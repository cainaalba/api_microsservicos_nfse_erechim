package br.com.nfse.api.dto.emun;

public enum IncentivoFiscal {
    SIM("1"), NAO("2");

    private String codigo;

    IncentivoFiscal(String codigo) {
        this.codigo = codigo;
    }

    public String getCodString() {
        return this.codigo;
      }
}
