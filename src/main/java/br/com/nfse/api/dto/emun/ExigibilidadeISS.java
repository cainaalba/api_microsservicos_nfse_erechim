package br.com.nfse.api.dto.emun;

public enum ExigibilidadeISS {
    SIM("0"), NAO("1");

    private String codigo;

    ExigibilidadeISS(String codigo) {
        this.codigo = codigo;
    }

    public String getCodString() {
        return this.codigo;
      }
}
