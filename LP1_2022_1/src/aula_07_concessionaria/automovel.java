package aula_07_concessionaria;

public class automovel extends veiculo{
    private String tipo;

    public automovel(String motor, int n_rodas, String tipo){
        super(motor, n_rodas);
        this.tipo = tipo;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo: " + tipo);
    }
}    