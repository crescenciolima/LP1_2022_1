package aula_11;

public class Didatico extends Livro{
    private String disciplina;

    public Didatico(String descricao, double valor, int codigo, String disciplina){
        super(descricao, valor, codigo);
        this.disciplina = disciplina;
    }

    public void relatorio(){
        System.out.println("_____________________");
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Codigo: " + codigo);
        System.out.println("Disciplina: " + disciplina);
    }
    
}
