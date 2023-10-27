package br.com.nfse.api.dto.emun;

public enum IssRetido {
    SIM("1"), NAO("2");

    private String codigo;

    IssRetido(String codigo) {
        this.codigo = codigo;
    }

    public String getCodString() {
        return this.codigo;
      }
}
