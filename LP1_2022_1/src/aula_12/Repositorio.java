package aula_12;

import javax.swing.JOptionPane;

public class Repositorio {
    private ContaAbstrata [] BD;
    private int indice;

    public Repositorio() {
        BD = new ContaAbstrata[10];
        indice = 0;
    }

    public void inserir(ContaAbstrata c){
        if(procurar(c)){
            new JOptionPane().showMessageDialog(null, "Conta já existe");
        } else {
            BD[indice] = c;
            indice++;
        }
    }

    public boolean procurar(ContaAbstrata c){
        for(int i=0; i < indice; i++){
            if(BD[i].equals(c)){
                return true;
            }
        }
        return false;
    }

    public void remover(){
        String numero = new JOptionPane().showInputDialog("Digite o número da conta");
        for(int i=0; i < indice; i++){
            if(BD[i].getNumero().equals(numero)){
                BD[i] = BD[indice-1];
                BD[indice-1] = null;
                indice--;
                new JOptionPane().showMessageDialog(null, "Conta Removida com Sucesso");
            }
        }
    }

    public void relatorio(){
        for(int i=0; i < indice; i++){
            BD[i].relatorio();
        }
    }

}
