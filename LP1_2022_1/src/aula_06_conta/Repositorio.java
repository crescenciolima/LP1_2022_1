package aula_06_conta;

public class Repositorio {
    private Conta [] contas;
    private int indice;
    private final static int MAX = 5;
    
    public Repositorio(){
        contas = new Conta[MAX];
        indice = 0;
    }         

    public void inserir(Conta c){
        contas[indice] = c;
        indice++;
    }

    public void imprimir(){
        for(int i = 0; i < indice; i++){
            contas[i].imprimir();
        }
    }
}
