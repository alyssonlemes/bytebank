package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero){
        super(agencia, numero); // chamando o construtor especifico da classe mae com os mesmos parametros
    }
    
    @Override
    public void deposita(double valor) {
        super.saldo += valor;
        
    }

    @Override
    public String toString() {
    	
    	return "ContaPoupanca: " + super.toString();
    	
    }

    
}
