package aula_10;

public class App_3 {
    public static void main(String[] args) {
        try{
            System.out.println("Inicio do Main");
            metodo1();
            System.out.println("Fim do Main");
        }catch(Exception e){
            System.out.println("Erro: " + e);
        }
}

    public static void metodo1(){
        System.out.println("Inicio do metodo 1");
        metodo2();
        System.out.println("Fim do metodo 1");
    }

    public static void metodo2(){
        System.out.println("Inicio do metodo 2");
        int [] matriz = new int[10];
        for(int i = 0; i <= 15; i++){
            matriz[i] = i;
            System.out.println("Valor de i: " + i);
        }
        System.out.println("Fim do metodo 2");

    }
    
}
