package aula_07_conta;

public class App_alternativo {
    public static void main(String[] args) throws Exception {

        Conta c1 = new Conta("123", 100.0);
        Poupanca p1 = new Poupanca("444", 250.0, "123456");
        Conta c2 = new Conta("456", 200.0);
        //c1.imprimir();
        //p1.imprimir();
        p1.renderJuros();
        //p1.imprimir();

        Repositorio_alternativo BD = new Repositorio_alternativo();
        BD.inserir(c1);
        BD.inserir(p1);
        BD.imprimir();
        BD.procurar(c1);
        BD.procurar(c2);

    }
}
