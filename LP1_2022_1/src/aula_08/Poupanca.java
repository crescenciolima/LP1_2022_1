package aula_08;

public class Poupanca extends Conta{
    private String matricula;

    public Poupanca(String numero, double saldo, String matricula){
        super(numero, saldo);
        this.matricula = matricula;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Matricula: " + matricula);
    }

}
