package br.com.nfse.api.service;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import br.com.nfse.api.dto.objects.DtoConsultarNfseFaixa;
import br.com.nfse.api.dto.objects.DtoGerarNfseEnvio;
import br.com.nfse.api.dto.services.ConsultarNfseFaixaEnvio;
import br.com.nfse.api.dto.services.GerarNfseEnvio;
import br.com.nfse.api.dto.xmlElements.Cnpj;
import br.com.nfse.api.dto.xmlElements.Faixa;
import br.com.nfse.api.dto.xmlElements.InfDeclaracaoPrestacaoServico;
import br.com.nfse.api.dto.xmlElements.Nfse;
import br.com.nfse.api.dto.xmlElements.Prestador;
import br.com.nfse.api.dto.xmlElements.Rps;
import br.com.nfse.api.dto.xmlElements.Servico;
import br.com.nfse.api.dto.xmlElements.Valores;
import br.com.nfse.api.dto.xmlElements.DadosTomador.IdentificacaoTomador;
import br.com.nfse.api.dto.xmlElements.DadosTomador.Tomador;
import br.com.nfse.api.stubs.ConsultarNfseFaixa;
import br.com.nfse.api.stubs.GerarNfse;
import br.com.nfse.api.utils.XmlUtil;

@Service
public class SoapService {
        private XmlUtil utils = new XmlUtil();

        private final WebServiceTemplate webServiceTemplate;
        private final XmlServiceImpl xmlServiceImpl;

        public SoapService(WebServiceTemplate webServiceTemplate,
                        XmlServiceImpl xmlServiceImpl) {
                this.webServiceTemplate = webServiceTemplate;
                this.xmlServiceImpl = xmlServiceImpl;
        }

        public Object invokeSoapService(Object request) {
                // Use o webServiceTemplate para fazer chamadas ao serviço SOAP
                Object response = webServiceTemplate.marshalSendAndReceive(request);
                return response;
        }

        public ResponseEntity<Object> gerarNfse(DtoGerarNfseEnvio dados) {
                Prestador prestador = Prestador
                                .builder()
                                .cpfCnpj(new Cnpj(dados.getRps().getPrestador().getCpfCnpj()))
                                .inscrMunicipal(dados.getRps().getPrestador().getInscrMunicipal())
                                .build();

                IdentificacaoTomador identificacaoTomador = IdentificacaoTomador
                                .builder()
                                .cpfCnpj(dados.getRps().getTomador().getIdentificacaoTomador().cpfCnpj)
                                .inscrMunicipal(dados.getRps().getTomador().getIdentificacaoTomador()
                                                .inscrMunicipal)
                                .build();

                Tomador tomador = Tomador
                                .builder()
                                .identificacaoTomador(identificacaoTomador)
                                .razaoSocial(dados.getRps().getTomador().getRazaoSocial())
                                .endereco(dados.getRps().getTomador().getEndereco())
                                .contato(dados.getRps().getTomador().getContato())
                                .build();

                Valores valores = Valores
                                .builder()
                                .valorServicos(dados.getRps().getServico().getValores().getValorServicos())
                                .valorDeducoes(dados.getRps().getServico().getValores().getValorDeducoes())
                                .valorPis(dados.getRps().getServico().getValores().getValorPis())
                                .valorCofins(dados.getRps().getServico().getValores().getValorCofins())
                                .valorInss(dados.getRps().getServico().getValores().getValorInss())
                                .valorIr(dados.getRps().getServico().getValores().getValorIr())
                                .valorCsll(dados.getRps().getServico().getValores().getValorCsll())
                                .valorIss(dados.getRps().getServico().getValores().getValorIss())
                                .aliquota(dados.getRps().getServico().getValores().getAliquota())
                                .descontoIncondicionado(
                                                dados.getRps().getServico().getValores().getDescontoIncondicionado())
                                .descontoCondicionado(
                                                dados.getRps().getServico().getValores().getDescontoCondicionado())
                                .baseCalculo(dados.getRps().getServico().getValores().getBaseCalculo())
                                .build();

                Servico servico = Servico
                                .builder()
                                .valores(valores)
                                .issRetido(dados.getRps().getServico().getIssRetido())
                                .itemListaServico(dados.getRps().getServico().getItemListaServico())
                                .discriminacao(dados.getRps().getServico().getDiscriminacao())
                                .codigoMunicipio(dados.getRps().getServico().getCodigoMunicipio())
                                .exigibilidadeISS(dados.getRps().getServico().getExigibilidadeISS())
                                .municipioIncidencia(dados.getRps().getServico().getMunicipioIncidencia())
                                .build();

                InfDeclaracaoPrestacaoServico infDeclaracaoPrestacaoServico = InfDeclaracaoPrestacaoServico
                                .builder()
                                .id("000000999")
                                .competencia(dados.getRps().getCompetencia())
                                .servico(servico)
                                .prestador(prestador)
                                .tomador(tomador)
                                .optanteSimplesNacional(dados.getRps().getOptanteSimplesNacional())
                                .incentivoFiscal(dados.getRps().getIncentivoFiscal())
                                .build();

                Rps rps = Rps
                                .builder()
                                .infDeclaracaoPrestacaoServico(infDeclaracaoPrestacaoServico)
                                .build();

                GerarNfseEnvio gerarNfseEnvio = GerarNfseEnvio
                                .builder()
                                .rps(rps)
                                .build();

                String xml = xmlServiceImpl.convertToXml(gerarNfseEnvio, GerarNfseEnvio.class);

                GerarNfse request = new GerarNfse();
                request.setNfseCabecMsg(utils.getCabecMsg());
                request.setNfseDadosMsg(xml);
                return ResponseEntity.status(HttpStatus.OK).body(invokeSoapService(request));
        }

        public Object consultarNfseFaixa(DtoConsultarNfseFaixa dados) throws RuntimeException {
                // {
                // "cpfCnpj":"93388031000142",
                // "inscrMunicipal":"10911",
                // "numeroInicial":"141206",
                // "numeroFinal":"141206"
                // }

                try {
                        Faixa faixa = Faixa.builder()
                                        .numeroNfseInicial(dados.getNumeroInicial())
                                        .numeroNfseFinal(dados.getNumeroFinal())
                                        .build();
                        Prestador prestador = Prestador
                                        .builder()
                                        .cpfCnpj(new Cnpj(dados.getCpfCnpj()))
                                        .inscrMunicipal(dados.getInscrMunicipal())
                                        .build();

                        ConsultarNfseFaixaEnvio consultarNfseFaixaEnvio = ConsultarNfseFaixaEnvio
                                        .builder()
                                        .prestador(prestador)
                                        .faixa(faixa)
                                        .pagina("1")
                                        .build();
                        String xml = xmlServiceImpl.convertToXml(consultarNfseFaixaEnvio,
                                        ConsultarNfseFaixaEnvio.class);

                        // String xml = "<?xml version=\"1.0\"
                        // encoding=\"UTF-8\"?><ConsultarNfseFaixaEnvio
                        // xmlns=\"http://www.abrasf.org.br/nfse.xsd\"><Prestador><CpfCnpj><Cnpj>93388031000142</Cnpj></CpfCnpj><InscricaoMunicipal>10911</InscricaoMunicipal></Prestador><Faixa><NumeroNfseInicial>141206</NumeroNfseInicial><NumeroNfseFinal>141206</NumeroNfseFinal></Faixa><Pagina>1</Pagina></ConsultarNfseFaixaEnvio>";
                        // System.out.println(xml);
                        ConsultarNfseFaixa consultarNfseFaixaRequest = new ConsultarNfseFaixa();
                        consultarNfseFaixaRequest.setNfseCabecMsg(utils.getCabecMsg());
                        consultarNfseFaixaRequest.setNfseDadosMsg(xml);
                        return invokeSoapService(consultarNfseFaixaRequest);
                } catch (Exception exception) {
                        exception.printStackTrace();
                        return null;
                }
        }
}
