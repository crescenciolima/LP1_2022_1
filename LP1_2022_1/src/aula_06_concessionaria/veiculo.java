package aula_06_concessionaria;

public class veiculo {
    protected String motor;
    protected int n_rodas;
    
    public veiculo(String motor, int n_rodas){
        this.motor = motor;
        this.n_rodas = n_rodas;
    }

    public void atualizacao_rodas(int novo_rodas){
        n_rodas = novo_rodas;
    }
    
    public void imprimir(){
        System.out.println("Motor: " + motor + "\n" + "Numero de rodas: " + n_rodas);
    }
}