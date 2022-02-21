package Main;

import Banco.Banco;
import Cliente.Clients;
import Cliente.PessoaFisica;
import Cliente.PessoaJuridica;
import Contas.*;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();
        BigDecimal s = new BigDecimal(1000);
        BigDecimal s1 = new BigDecimal(10000);

	    Clients pessoaFisica = new PessoaFisica("Hannah", "hannahcassia@gmail.com", "122.333.444-65");
	    Clients pessoaJuridica = new PessoaJuridica("Beatriz", "beatrizmiranda@gmail.com", "09.345.543/0001-12");

        Conta cc = new ContaCorrente("20023", pessoaFisica, s, ContaTipos.CONTACORRENTE );
        Conta cp = new ContaPoupanca("234556", pessoaFisica, s, ContaTipos.CONTAPOUPANCA);
        Conta ci = new ContaInvestimento("045632", pessoaFisica, s, ContaTipos.CONTAINVESTIMENTO);

        Conta cc1 = new ContaCorrente("435678", pessoaJuridica, s1, ContaTipos.CONTACORRENTE);
        Conta cp1 = new ContaPoupanca("11123", pessoaJuridica, s1, ContaTipos.CONTAPOUPANCA);
        Conta ci1 = new ContaInvestimento("324556",pessoaJuridica, s1, ContaTipos.CONTAINVESTIMENTO);

        banco.abrirConta(cc);
        System.out.print("\n");
        banco.abrirConta(cp);
        System.out.print("\n");
        banco.abrirConta(ci);
        System.out.print("\n");
        banco.abrirConta(cc1);
        System.out.print("\n");
        banco.abrirConta(cp1);
        System.out.print("\n");
        banco.abrirConta(ci1);
        System.out.print("\n");

        cc.sacar(new BigDecimal(100));
        System.out.print("\n");
        cc.consultaSaldo();
        System.out.print("\n");
        cc.deposita(new BigDecimal(100));
        System.out.print("\n");
        ci1.investe(new BigDecimal(200));
        System.out.print("\n");
        cc1.sacar(new BigDecimal(300));
        System.out.print("\n");
        cc1.transferir(cp, new BigDecimal(200));
    }
}
