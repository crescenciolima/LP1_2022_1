package aula_09;

public abstract class Carta{ // classe base
    protected String nome;

    public Carta(String nome){
        this.nome = nome;
    }

    public abstract void imprimir();
}