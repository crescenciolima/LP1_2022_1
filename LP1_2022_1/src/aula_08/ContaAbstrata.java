package aula_08;

public abstract class ContaAbstrata {
    protected String numero;
    protected double saldo;

    public ContaAbstrata(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void creditar(double valor){
        saldo += valor;
    }

    public abstract void debitar(double valor);

    public void imprimir(){
        System.out.println("__________________________");
        System.out.println("Numero da Conta: " + numero);
        System.out.println("Saldo da Conta: " + saldo);
    }

}
