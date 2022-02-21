package Contas;

import Cliente.Clients;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String numeroConta, Clients cliente, BigDecimal saldo, ContaTipos contaTipos) {
        super(numeroConta, cliente, saldo, contaTipos);
    }

    public ContaPoupanca() {
        super(ContaTipos.CONTAPOUPANCA);
    }

    public ContaPoupanca(Clients cliente) {
        super(cliente, ContaTipos.CONTAPOUPANCA);
    }


}
