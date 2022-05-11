package aula_07_conta;

public class Poupanca extends Conta{
    private String matricula;
    
    public Poupanca(String numero, double saldo, String matricula) {
        super(numero, saldo);
        this.matricula = matricula;
    }

    public void renderJuros(){
        saldo += saldo * 0.01;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Matricula: " + matricula);
    }
}
