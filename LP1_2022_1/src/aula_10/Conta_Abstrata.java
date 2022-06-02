package aula_10;

public abstract class Conta_Abstrata {
    protected String numero;
    protected double saldo;

    public Conta_Abstrata(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public abstract void debitar(double saldo) throws SIException;
    
}
