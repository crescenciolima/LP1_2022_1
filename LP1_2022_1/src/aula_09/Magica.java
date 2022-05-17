package aula_09;

public class Magica extends Carta{ //classe de mágica
    private String tipo;

    public Magica(String nome, String tipo){
        super(nome);
        this.tipo = tipo;
    }

    public void imprimir(){
        System.out.println("__________________________");
        System.out.println("Nome Magica: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
    }
}