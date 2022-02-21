package Contas;

import Cliente.Clients;

import java.math.BigDecimal;

public abstract class Conta {
    protected String numeroConta;
    Clients cliente;
    protected BigDecimal saldo;
    private ContaTipos contaTipos;

    public Conta(String numeroConta, Clients cliente, BigDecimal saldo, ContaTipos contaTipos) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.saldo= saldo;
        this.contaTipos = contaTipos;
    }

    public Conta(Clients cliente, ContaTipos contaTipos) {
        this.cliente = cliente;
        this.contaTipos = contaTipos;
        this.saldo = getSaldo();
    }


    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setCliente(Clients cliente) {
        this.cliente = cliente;
    }

    public Clients getCliente() {
        return cliente;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Conta(ContaTipos contaTipos) {
        this.contaTipos = contaTipos;
    }

    public void setContaTipos(ContaTipos contaTipos) {
        this.contaTipos = contaTipos;
    }

    public ContaTipos getContaTipos() {
        return contaTipos;
    }

    public void sacar(BigDecimal valor) {
        saldo = saldo.subtract(valor);
        System.out.print("Você sacou: " + valor + ", agora seu saldo é de: " + saldo.subtract(valor));
    }

    public void consultaSaldo() {
        System.out.print("Seu saldo é de: " + getSaldo());
    }

    public void deposita(BigDecimal valor) {
        saldo = saldo.add(valor);
        System.out.print("O valor depositado foi de: " + valor + ", agora seu saldo é de: " + saldo);
    }

    public void transferir(Conta c, BigDecimal valor) {
        this.sacar(valor);
        c.deposita(valor);
        System.out.print(" O valor transferido foi de:" + valor + "para conta: " + c);
    }

    public void investe(BigDecimal valor) {
        saldo = saldo.add(valor);
        System.out.print("Você investiu: " + valor);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente='" + cliente +  '\'' +
                ", conta='" + numeroConta + '\'' +
                ", saldo='" + saldo + '\'' +
                ", Tipo='" + contaTipos + '\'' +
                '}';
    }
}
