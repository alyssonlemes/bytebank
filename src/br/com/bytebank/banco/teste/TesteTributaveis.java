package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*; //importando os packages anteriores nos arquivos

/**
 * Classe que representa um cliente no byte bank
 * 
 * @author Alysson Lemes
 * @version 0.1
 */
public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());
    }
    
}
