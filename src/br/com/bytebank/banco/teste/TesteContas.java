package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.SaldoInsuficienteException; //importando os packages anteriores nos arquivos
import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente; //exemplo de import específico
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteContas {
    
    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaEspecial ce = new ContaEspecial(123, 5555);
    

        //Full Qualified Name FQN
       ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(222,  222);
        cp.deposita(200);

        cc.transfere(10, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

        
    }
}
