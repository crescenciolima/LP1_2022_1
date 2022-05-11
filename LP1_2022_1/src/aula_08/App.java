package aula_08;

public class App {
    public static void main(String[] args) throws Exception {
        //ContaAbstrata c1 = new ContaAbstrata("123", 100.0);
        Conta c1 = new Conta("123", 100.0);
        c1.debitar(25.0);
        //c1.imprimir();
        
        ContaImposto c2 = new ContaImposto("456", 200.0);
        c2.debitar(125.0);
        //c2.imprimir();

        Poupanca p1 = new Poupanca("789", 50.0, "2019111");
        //p1.imprimir();

    /*    ContaAbstrata [] BD = new ContaAbstrata[5];
        BD[0] = c1; //Conta
        BD[1] = c2; //ContaImposto
        BD[2] = p1; //Poupanca

        for(int i=0; i < BD.length; i++){
            if(BD[i] != null){
                BD[i].imprimir();
            } else {
                System.out.println("Espaco Livre");
            }  
        }
        */

        Repositorio r = new Repositorio();
        r.inserir(c1);
        r.inserir(c2);
        r.inserir(p1);

        r.imprimir();
    }
}
