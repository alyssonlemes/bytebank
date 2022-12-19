package br.com.bytebank.banco.modelo; // declaracao da pasta onde o arquivo está

public class CalculadorDeImposto {

    private double totalImposto;

    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto += valor;

    }
    
    public double getTotalImposto() {
        return totalImposto;
    }

}
