
package br.com.bytebank.banco.modelo;

//public class ContaCorrente extends Conta dá erro pois a herança não herda construtores
public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override //mostra pro compilador que queremos reescrever o metodo
    public void saca(double valor) throws SaldoInsuficienteException{
        double ValorASacar = valor + 0.2;
        super.saca(ValorASacar);
    }
    
    @Override
    public void deposita(double valor) {
       super.saldo += valor;
        
    }

    @Override
    public double getValorImposto() {
        return super.saldo *0.01;
    }
    
    @Override
    public String toString() {
    	
    	return "ContaCorrente: " + super.toString();
    	
    }
    

} 
