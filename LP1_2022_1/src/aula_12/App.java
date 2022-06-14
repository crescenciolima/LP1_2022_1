package aula_12;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String valor1 = new JOptionPane().showInputDialog("Digite o primeiro valor");
        String valor2 = new JOptionPane().showInputDialog("Digite o segundo valor");
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        double soma = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "A soma é: " + soma);
    }


}
