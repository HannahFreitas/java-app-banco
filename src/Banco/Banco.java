package Banco;

import Cliente.PessoaJuridica;
import Contas.Conta;
import Contas.ContaTipos;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final List<Conta> contas = new ArrayList<>();


    public void abrirConta(Conta conta) {
        if(conta.getCliente() instanceof PessoaJuridica && conta.getContaTipos() == ContaTipos.CONTAPOUPANCA){
            System.out.print("Não é possível criar conta poupança para pessoa jurídica");
        } else {
            conta.setNumeroConta(conta.getNumeroConta());
            contas.add(conta);
            System.out.print("Conta de número: "  + conta.getNumeroConta() + " criada com sucesso!");
        }
    }
}


