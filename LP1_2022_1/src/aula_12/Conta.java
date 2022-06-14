package aula_12;

import javax.swing.JOptionPane;

public class Conta extends ContaAbstrata{

    public Conta(){
        super();
    }
    
    public void debitar(double valor){
        if (valor > saldo){
            new JOptionPane().showMessageDialog(null, "Saldo insuficiente");
        } else {
            saldo -= valor;
        }
    }

    public void relatorio(){
        new JOptionPane().showMessageDialog(null, "Número da Conta: "+ numero + "\nSaldo: " + saldo);
    }

}
