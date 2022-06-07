package aula_11;

public class App {
    public static void main(String[] args) throws Exception {
        Didatico d1 = new Didatico("Programação", 100.0, 123, "LP1");
        Didatico d2 = new Didatico("Bando de Dados", 120.0, 456, "BD1");
        Tecnico t1 = new Tecnico("Energia", 250.0, 789);
        Tecnico t2 = new Tecnico("Fisica", 55.0, 333);
        //d1.relatorio();
        //d2.relatorio();
        //t1.relatorio();
        //t2.relatorio();
        Repositorio BD = new Repositorio();
        BD.inserir(d1);
        BD.inserir(d1);
        BD.inserir(d2);
        BD.inserir(t1);
        BD.inserir(t2);
        BD.imprimir();
        BD.maisCaro();
    }
}
