package aula_06_concessionaria;

public class App {
    public static void main(String[] args) throws Exception {
        veiculo v1 = new veiculo("50cc", 4);
    		caminhao c1 = new caminhao("100cc", 16, 200.0);
        automovel a1 = new automovel("60cc", 4, "sedan");       
        v1.imprimir();
        c1.imprimir();
        a1.imprimir();
    }
}
