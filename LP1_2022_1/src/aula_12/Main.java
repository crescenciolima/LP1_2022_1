package aula_12;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        c1.debitar(200.0);

        Repositorio BD = new Repositorio();
        BD.inserir(c1);
        BD.inserir(c2);
        BD.inserir(c1);
        BD.remover();
        BD.relatorio();

        
    }
    
}
