package aula_11;

public class Repositorio {
    private Livro [] BD;
    private int indice;

    public Repositorio(){
        BD = new Livro[5];
        indice = 0;
    }

    public void inserir(Livro l){
        if(procurar(l)){
            System.out.println("Livro já cadastrado");
        }else{
            BD[indice] = l;
            indice++;
        }
    }

    public boolean procurar(Livro l){
        for(int i = 0; i <= indice; i++){
            if(BD[i] == l){
                return true;
            }
        }
        return false;
    }

    public void maisCaro(){
        Livro maior = BD[0];
        for(int i = 0; i < indice; i++){
            if(BD[i].valor > maior.valor){
                maior = BD[i];
            }
        }
        System.out.println("Livro mais caro");
        maior.relatorio();
    }

    public void imprimir(){
        for(int i=0; i < indice; i++){
            BD[i].relatorio();
        }
    }
}
