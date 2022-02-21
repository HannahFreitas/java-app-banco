package Contas;

public enum ContaTipos {
    CONTACORRENTE("corrente"),
    CONTAPOUPANCA("poupanca"),
    CONTAINVESTIMENTO("investimento");

    private String informacoes;

    ContaTipos(String informacoes) {
        this.informacoes = informacoes;
    }

    public String getInformacoes() {
        return informacoes;
    }
}
