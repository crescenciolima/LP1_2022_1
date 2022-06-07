package aula_11;

public abstract class Livro {
    protected String descricao;
    protected double valor;
    protected int codigo;

    public Livro(String descricao, double valor, int codigo){
        this.descricao = descricao;
        this.valor = valor;
        this.codigo = codigo;
    }

    public abstract void relatorio();
    
}
