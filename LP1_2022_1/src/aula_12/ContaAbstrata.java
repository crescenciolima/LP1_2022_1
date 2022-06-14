package aula_12;

import javax.swing.JOptionPane;

public abstract class ContaAbstrata {
    protected double saldo;
    protected String numero;

    public ContaAbstrata(){
        numero = new JOptionPane().showInputDialog("Digite o número da conta");
        saldo = Double.parseDouble(new JOptionPane().showInputDialog("Digite o saldo"));
    }

    public void creditar(double valor){
        saldo += valor;
    }

    public abstract void debitar(double valor);
    public abstract void relatorio();

    public String getNumero() {
        return numero;
    }
}
