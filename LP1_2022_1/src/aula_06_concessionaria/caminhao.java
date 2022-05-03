package aula_06_concessionaria;

public class caminhao extends veiculo{
    private double carga;

    public caminhao(String motor, int n_rodas, double carga){
        super(motor, n_rodas);
        this.carga = carga;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Carga: " + carga);
    }
}