package aula_09;

public class Monstro extends Carta{ //classe de mosntro
    private int level_star;
    private String efeito;
    private String raca;
    private String atributo;

    public Monstro(String nome, int level_star, String efeito, String raca, String atributo) {
        super(nome);
        this.level_star = level_star;
        this.efeito = efeito;
        this.raca = raca;
        this.atributo = atributo;
    }

    public void imprimir(){
        System.out.println("__________________________");
        System.out.println("Nome Monstro: " + this.nome);
        System.out.println("Level Star: " + this.level_star);
        System.out.println("Efeito: " + this.efeito);
        System.out.println("Raca: " + this.raca);
        System.out.println("Atributo: " + this.atributo);
    }
}