package Contas;

import Cliente.Clients;
import Cliente.PessoaFisica;
import Cliente.PessoaJuridica;

import java.math.BigDecimal;

public class ContaInvestimento extends Conta{

    public ContaInvestimento(String numeroConta, Clients cliente, BigDecimal saldo, ContaTipos contaTipos) {
        super(numeroConta, cliente, saldo, contaTipos);
    }

    public ContaInvestimento() {
        super(ContaTipos.CONTAINVESTIMENTO);
    }

    public ContaInvestimento(Clients cliente) {
        super(cliente, ContaTipos.CONTAINVESTIMENTO);
    }

    public BigDecimal rendeInvestimento(BigDecimal valor) {
        return valor.multiply(BigDecimal.valueOf(1.02));
    }


    @Override
    public void investe(BigDecimal valor) {
        if(getCliente() instanceof PessoaJuridica) {
            BigDecimal novoValor = valor.add(getSaldo());
            setSaldo(rendeInvestimento(novoValor));
            System.out.print("Você investiu o valor de: " + valor + ", e seu saldo novo será de: " + novoValor);
        } else if(getCliente() instanceof PessoaFisica) {
            setSaldo(getSaldo().add(valor));
            System.out.print("Você investiu: " + valor);
        }
    }
}
