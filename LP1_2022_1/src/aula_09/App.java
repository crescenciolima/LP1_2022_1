package aula_09;

public class App {
    public static void main(String[] args) throws Exception {
        Monstro m1 = new Monstro("Mago Negro", 7, "nda", "mago", "dark");
        //m1.imprimir();

        Magica m2 = new Magica("Controlador de inimigo", "Rápida");
        //m2.imprimir();

        Armadilha a1 = new Armadilha("Força Espelho", "Normal");
        //a1.imprimir();

        Deck d1 = new Deck();
        d1.inserir(m1);
        d1.inserir(m2);
        d1.inserir(a1);

        d1.imprimir();
        d1.procurar(m2);

    }
}
