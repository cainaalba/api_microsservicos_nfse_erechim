package br.com.nfse.api.service;

import java.text.DecimalFormat;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import br.com.nfse.api.dto.emun.ExigibilidadeISS;
import br.com.nfse.api.dto.emun.IncentivoFiscal;
import br.com.nfse.api.dto.emun.IssRetido;
import br.com.nfse.api.dto.emun.OptanteSimplesNacional;
import br.com.nfse.api.dto.objects.cancelar.DtoCancelarNfse;
import br.com.nfse.api.dto.objects.cancelar.DtoCancelarNfseEnvio;
import br.com.nfse.api.dto.objects.consultar.DtoConsultarNfseEnvio;
import br.com.nfse.api.dto.objects.gerar.DtoGerarNfseEnvio;
import br.com.nfse.api.dto.objects.substituir.DtoSubstituirNfse;
import br.com.nfse.api.dto.objects.substituir.DtoSubstituirNfseEnvio;
import br.com.nfse.api.dto.xmlElements.CancelarNfseEnvio;
import br.com.nfse.api.dto.xmlElements.Cnpj;
import br.com.nfse.api.dto.xmlElements.ConsultarNfseFaixaEnvio;
import br.com.nfse.api.dto.xmlElements.Faixa;
import br.com.nfse.api.dto.xmlElements.GerarNfseEnvio;
import br.com.nfse.api.dto.xmlElements.IdentificacaoNfse;
import br.com.nfse.api.dto.xmlElements.InfDeclaracaoPrestacaoServico;
import br.com.nfse.api.dto.xmlElements.PedidoCancelamento;
import br.com.nfse.api.dto.xmlElements.Prestador;
import br.com.nfse.api.dto.xmlElements.Rps;
import br.com.nfse.api.dto.xmlElements.Servico;
import br.com.nfse.api.dto.xmlElements.Valores;
import br.com.nfse.api.dto.xmlElements.dadosTomador.IdentificacaoTomador;
import br.com.nfse.api.dto.xmlElements.dadosTomador.Tomador;
import br.com.nfse.api.stubs.CancelarNfse;
import br.com.nfse.api.stubs.CancelarNfseResponse;
import br.com.nfse.api.stubs.ConsultarNfseFaixa;
import br.com.nfse.api.stubs.GerarNfse;
import br.com.nfse.api.utils.XmlUtil;

@Service
public class SoapService {
        private DecimalFormat decimalFormat = new DecimalFormat("000000000");

        private final WebServiceTemplate webServiceTemplate;
        private final XmlServiceImpl xmlServiceImpl;

        public SoapService(WebServiceTemplate webServiceTemplate,
                        XmlServiceImpl xmlServiceImpl) {
                this.webServiceTemplate = webServiceTemplate;
                this.xmlServiceImpl = xmlServiceImpl;
        }

        public ResponseEntity<Object> gerarNfse(DtoGerarNfseEnvio dados) throws Exception {
                try {
                        String xmlAssinado = gerarNfseString(dados);

                        GerarNfse request = new GerarNfse();
                        request.setNfseCabecMsg(XmlUtil.getCabecMsg());
                        request.setNfseDadosMsg(xmlAssinado);
                        return ResponseEntity
                                        .status(HttpStatus.OK)
                                        .body(webServiceTemplate.marshalSendAndReceive(request));
                } catch (Exception e) {
                        e.printStackTrace();
                        return ResponseEntity
                                        .status(HttpStatus.BAD_REQUEST)
                                        .body(e.getLocalizedMessage());
                }
        }

        public ResponseEntity<Object> consultarNfse(DtoConsultarNfseEnvio dados) throws Exception {
                try {
                        Faixa faixa = Faixa.builder()
                                        .numeroNfseInicial(dados.getConsultar().getNumeroInicial())
                                        .numeroNfseFinal(dados.getConsultar().getNumeroFinal())
                                        .build();
                        Prestador prestador = Prestador
                                        .builder()
                                        .cpfCnpj(new Cnpj(dados.getConsultar().getCpfCnpj()))
                                        .inscrMunicipal(dados.getConsultar().getInscrMunicipal())
                                        .build();

                        ConsultarNfseFaixaEnvio consultarNfseFaixaEnvio = ConsultarNfseFaixaEnvio
                                        .builder()
                                        .prestador(prestador)
                                        .faixa(faixa)
                                        .pagina("1")
                                        .build();
                        String xml = xmlServiceImpl.convertToXml(consultarNfseFaixaEnvio,
                                        ConsultarNfseFaixaEnvio.class);

                        ConsultarNfseFaixa request = new ConsultarNfseFaixa();
                        request.setNfseCabecMsg(XmlUtil.getCabecMsg());
                        request.setNfseDadosMsg(xml);
                        return ResponseEntity
                                        .status(HttpStatus.OK)
                                        .body(webServiceTemplate.marshalSendAndReceive(request));
                } catch (Exception e) {
                        e.printStackTrace();
                        return ResponseEntity
                                        .status(HttpStatus.BAD_REQUEST)
                                        .body(e.getLocalizedMessage());
                }
        }

        public ResponseEntity<Object> cancelarNfse(DtoCancelarNfseEnvio dados) throws Exception {
                try {
                        String xmlAssinado = cancelarNfseString(dados);

                        CancelarNfse request = new CancelarNfse();
                        request.setNfseCabecMsg(XmlUtil.getCabecMsg());
                        request.setNfseDadosMsg(xmlAssinado);
                        return ResponseEntity
                                        .status(HttpStatus.OK)
                                        .body(webServiceTemplate.marshalSendAndReceive(request));
                } catch (Exception e) {
                        e.printStackTrace();
                        return ResponseEntity
                                        .status(HttpStatus.BAD_REQUEST)
                                        .body(e.getLocalizedMessage());
                }
        }

        public ResponseEntity<Object> substituirNfse(DtoSubstituirNfseEnvio dados) throws Exception {
                return null;
        }

        private String gerarNfseString(DtoGerarNfseEnvio dados) throws Exception {
                final String INF_DECL_PREST_SERV = "infDeclaracaoPrestacaoServico";
                final String numeroRps = decimalFormat.format(Integer.parseInt(dados.getRps().getNumeroRps()));

                Prestador prestador = Prestador
                                .builder()
                                .cpfCnpj(new Cnpj(dados.getRps().getPrestador().getCpfCnpj()))
                                .inscrMunicipal(dados.getRps().getPrestador().getInscrMunicipal())
                                .build();

                IdentificacaoTomador identificacaoTomador = IdentificacaoTomador
                                .builder()
                                .cpfCnpj(dados.getRps().getTomador().getIdentificacaoTomador().cpfCnpj)
                                .inscrMunicipal(dados.getRps().getTomador().getIdentificacaoTomador().inscrMunicipal)
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
                                .issRetido(dados.getRps().getServico().getIssRetido().toString().toUpperCase()
                                                .equals("SIM")
                                                                ? IssRetido.SIM.getCodString()
                                                                : IssRetido.NAO.getCodString())
                                .itemListaServico(dados.getRps().getServico().getItemListaServico())
                                .discriminacao(dados.getRps().getServico().getDiscriminacao())
                                .codigoMunicipio(dados.getRps().getServico().getCodigoMunicipio())
                                .exigibilidadeISS(dados.getRps().getServico().getExigibilidadeISS().toString()
                                                .toUpperCase().equals("SIM")
                                                                ? ExigibilidadeISS.SIM.getCodString()
                                                                : ExigibilidadeISS.NAO.getCodString())
                                .municipioIncidencia(dados.getRps().getServico().getMunicipioIncidencia())
                                .build();

                InfDeclaracaoPrestacaoServico infDeclaracaoPrestacaoServico = InfDeclaracaoPrestacaoServico
                                .builder()
                                .competencia(dados.getRps().getCompetencia())
                                .servico(servico)
                                .prestador(prestador)
                                .tomador(tomador)
                                .optanteSimplesNacional(dados.getRps().getOptanteSimplesNacional().toString()
                                                .toUpperCase().equals("SIM")
                                                                ? OptanteSimplesNacional.SIM.getCodString()
                                                                : OptanteSimplesNacional.NAO.getCodString())
                                .incentivoFiscal(dados.getRps().getIncentivoFiscal().toString().toUpperCase()
                                                .equals("SIM")
                                                                ? IncentivoFiscal.SIM.getCodString()
                                                                : IncentivoFiscal.NAO.getCodString())
                                .build();

                Rps rps = Rps
                                .builder()
                                .infDeclaracaoPrestacaoServico(infDeclaracaoPrestacaoServico)
                                .build();

                GerarNfseEnvio gerarNfseEnvio = GerarNfseEnvio
                                .builder()
                                .rps(rps)
                                .build();

                String xmlAssinar = xmlServiceImpl.convertToXml(gerarNfseEnvio, GerarNfseEnvio.class);
                Document documentoAssinar = XmlUtil.documentFactory(xmlAssinar);

                // Atribui valor ao ID
                NodeList elements = documentoAssinar
                                .getDocumentElement()
                                .getElementsByTagName(INF_DECL_PREST_SERV);
                for (int i = 0; i < elements.getLength(); i++) {
                        Element element = (Element) elements.item(i);
                        element.setAttribute("Id", numeroRps);
                }
                xmlAssinar = XmlUtil.xmlString(documentoAssinar);
                return new Assinatura().assinar(xmlAssinar, numeroRps);
        }

        private String cancelarNfseString(DtoCancelarNfseEnvio dados) throws Exception {
                final String INF_PED_CANC = "infPedidoCancelamento";

                IdentificacaoNfse identificacaoNfse = IdentificacaoNfse
                                .builder()
                                .nfse(dados.getCancelar().getNfse())
                                .cnpj(dados.getCancelar().getCpfCnpj())
                                .inscrMunicipal(dados.getCancelar().getInscrMunicipal())
                                .codigoMunicipio(dados.getCancelar().getCodigoMunicipio())
                                .build();
                                
                PedidoCancelamento pedidoCancelamento = PedidoCancelamento
                                .builder()
                                .identificacaoNfse(identificacaoNfse)
                                .codigoCancelamento(dados.getCancelar().getCodigoCancelamento().toString())
                                .build();

                CancelarNfseEnvio cancelarNfse = CancelarNfseEnvio
                                .builder()
                                .pedidoCancelamento(pedidoCancelamento)
                                .build();

                String xmlAssinar = xmlServiceImpl.convertToXml(cancelarNfse,
                                CancelarNfseEnvio.class);

                Document documentoAssinar = XmlUtil.documentFactory(xmlAssinar);

                // Atribui valor ao ID
                NodeList elements = documentoAssinar
                                .getDocumentElement()
                                .getElementsByTagName(INF_PED_CANC);
                for (int i = 0; i < elements.getLength(); i++) {
                        Element element = (Element) elements.item(i);
                        element.setAttribute("Id", "pedidoCancelamento_" + dados.getCancelar().getNfse());
                }
                xmlAssinar = XmlUtil.xmlString(documentoAssinar);
                return new Assinatura().assinar(xmlAssinar, "pedidoCancelamento_" + dados.getCancelar().getNfse());
        }
}
