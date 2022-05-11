package aula_08;

public class Repositorio {
    private ContaAbstrata[] BD;
    private int indice;
    private static final int MAX = 5;

    public Repositorio() {
        BD = new ContaAbstrata[MAX];
        indice = 0;
    }

    public void inserir(ContaAbstrata c){
        BD[indice] = c;
        indice++;
    }

    public void imprimir(){
        for (int i = 0; i < indice; i++){
            BD[i].imprimir();
        }
    }



}
