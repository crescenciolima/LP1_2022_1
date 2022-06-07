package aula_11;

public class Tecnico extends Livro{
    public Tecnico(String descricao, double valor, int codigo){
        super(descricao, valor, codigo);
    }

    public void relatorio(){
        System.out.println("_____________________");
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Codigo: " + codigo);
    }
    
}
