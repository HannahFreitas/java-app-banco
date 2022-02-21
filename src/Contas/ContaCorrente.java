package Contas;

import Cliente.Clients;
import Cliente.PessoaFisica;
import Cliente.PessoaJuridica;

import java.math.BigDecimal;

public class ContaCorrente extends Conta{

    public ContaCorrente(String numeroConta, Clients cliente, BigDecimal saldo, ContaTipos contaTipos) {
        super(numeroConta, cliente, saldo, contaTipos);
    }

    public ContaCorrente() {
        super(ContaTipos.CONTACORRENTE);
    }

    public ContaCorrente(Clients cliente) {
        super(cliente, ContaTipos.CONTACORRENTE);
    }

    public BigDecimal taxaCobrada(BigDecimal valor) {
        return valor.multiply(BigDecimal.valueOf(1.005));
    }


    @Override
    public void sacar(BigDecimal valor) {
        if(getCliente() instanceof PessoaJuridica) {
            setSaldo(getSaldo().subtract(taxaCobrada(valor)));
            System.out.print("Você sacou: " + taxaCobrada(valor) + " com taxa de 0,5% foi efetuado com sucesso, agora seu saldo é de: " + getSaldo().subtract(taxaCobrada(valor)));
        } else if(getCliente() instanceof PessoaFisica) {
            setSaldo(getSaldo().subtract(valor));
            System.out.print("Seu saque foi de: " + valor + ", agora seu saldo é de: " + getSaldo().subtract(valor));
        }
    }

    @Override
    public void transferir(Conta c, BigDecimal valor) {
        if(getCliente() instanceof PessoaJuridica) {
            sacar(taxaCobrada(valor));
            c.deposita(valor);
            System.out.print("O valor transferido foi de:" + taxaCobrada(valor) + "para conta: " + c);
        } else if(getCliente() instanceof PessoaFisica) {
            sacar(valor);
            c.deposita(valor);
            System.out.print(" O valor transferido foi de:" + valor + "para conta: " + c);
        }
    }
}
