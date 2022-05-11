package aula_07_conta;

public class App {
    public static void main(String[] args) throws Exception {

        Conta c1 = new Conta("123", 100.0);
        Poupanca p1 = new Poupanca("444", 250.0, "123456");
        Conta c2 = new Conta("456", 200.0);
        //c1.imprimir();
        //p1.imprimir();
        p1.renderJuros();
        //p1.imprimir();

        Repositorio BD = new Repositorio();
        BD.inserir(c1);
        BD.inserir(c2);
        BD.inserir(p1);

        BD.imprimir();

    }
}
