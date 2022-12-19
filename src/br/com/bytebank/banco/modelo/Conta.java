package br.com.bytebank.banco.modelo;

/**
 * Classe que representa a moldura de uma conta
 * 
 * @author Alysson Lemes    
 */

public abstract class Conta extends Object implements Comparable<Conta> {

    // as classes são arquivos de suporte, por isso não executam sozinhas

    protected double saldo; //protected é publico para os filhos
    private int agencia; // private significa que o atributo só pode ser modificado na propria classe
    private int numero;
    private Cliente titular;
    private static int total; // utiliza=-se o static para que o total pertença a classe

    /**
     * Construtor para inicializar o objeto  conta a partir da agencia e numero
     * 
     */

    public Conta() {
    }

    public Conta(int agencia, int numero) {
        // exemplo de construtor padrao que o java escreve para a gente
        // o construtor é uma rotina de inicialização, diferente dos métodos que tem
        // retorno
        Conta.total++;
        // System.out.println("O total de contas e " + total);
        this.agencia = agencia;
        this.numero = numero;
        // System.out.println("Estou criando uma conta: " + this.numero);

    }

    public abstract void deposita(double valor);

    /** 
     * Valor precisa ser maior que o saldo
     * @param valor
     * @throws SaldoInsuficienteException
     */

    public void saca(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
           
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor:" + valor);
            
        } 
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {

        this.saca(valor);
        destino.deposita(valor); 
            
    }

    public double getSaldo() {

        return this.saldo;

    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int novoNumero) { // geralmente metodos que alteram atributos sao void pois nao devolvem nada
        this.numero = novoNumero;
        if (numero <= 0) {
            System.out.println("Não pode numero menor ou igual a 0");
            return;

        }

    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {

        if (agencia <= 0) {
            System.out.println("Não pode valor menor ou igual a 0");
            return;
        }

        this.agencia = agencia;

    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
    
 
    
    @Override
    public boolean equals(Object ref) {
    	
    	Conta outra = (Conta) ref;
    	
    	if(this.agencia != outra.agencia) {
    		return false;
    	}
    	
    	if(this.numero != outra.numero) {
    		return false;
    	}
    	
    	return true;
    	
    }
    
    @Override
    public int compareTo(Conta outra) {  	
    	return Double.compare(this.saldo, outra.saldo);
    }	
    
    @Override
    public String toString() {
    	
    	return "NUMERO: " + this.getNumero() + " Agencia: " + this.agencia + "Saldo: " + this.saldo;
    	
    }

}
