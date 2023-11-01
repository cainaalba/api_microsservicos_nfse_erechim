package br.com.nfse.api.dto.emun;

/* CÓDIGOS DE CANELAMENTO : -----------------------------------------------------------------------------------------
	// 1 - Erro de emissão
	// 2 - Serviço não concluido
	// 3 - RPS Cancelado na Emissão

	O código 1 significa que estamos cancelando a NFS-e pois esta contem erros, portanto uma nova será emitida.
	O código 2 significa que a NFS-e esta sendo cancelada pois o serviço não vai mais ser executado (execução parcial).
	O código 3 significa que a NFS-e foi emitida indevidamente.
---------------------------------------------------------------------------------------------------------------------- */

public enum CodigoCancelamento {
    ERRO_EMISSAO("1", "Erro de emissão"),
    NAO_PRESTADO("2", "Serviço não concluído"),
    RPS_CANCELADA("3", "RPS Cancelado na Emissão");

    private String codigo;
    private String descricao;

    CodigoCancelamento(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
