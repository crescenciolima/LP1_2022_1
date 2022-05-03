package aula_06_conta;

import java.util.ArrayList;

public class Repositorio_alternativo{
    private ArrayList<Conta> contas;

    public Repositorio_alternativo(){
        contas = new ArrayList<Conta>();
    }

    public void inserir(Conta c){
        contas.add(c);
    }

    public void remover(Conta c){
        contas.remove(c);
    }

    public void procurar(Conta c){
        if(contas.contains(c)){
            System.out.println("Conta encontrada");
        }else{
            System.out.println("Conta não encontrada");
        }
    }

    public void imprimir(){
        for(int i = 0; i < contas.size(); i++){
            contas.get(i).imprimir();
        }
    }
}
