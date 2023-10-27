package br.com.nfse.api.dto.emun;

public enum OptanteSimplesNacional {
    SIM("1"), NAO("2");

    private String codigo;

    OptanteSimplesNacional(String codigo) {
        this.codigo = codigo;
    }

    public String getCodString() {
        return this.codigo;
      }
}
