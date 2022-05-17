package aula_09;

public class Armadilha extends Carta{ //classe de armadilha
    private String propriedade;
    
    public Armadilha(String nome, String propiedade){
        super(nome);
        this.propriedade = propiedade;
    }

    public void imprimir(){
        System.out.println("__________________________");
        System.out.println("Nome Armadilha: " + this.nome);
        System.out.println("Propriedade: " + this.propriedade);
    }
}