package aula_18_04;

public class Conta {
	private String numero;
	private double saldo;

	public Conta(String numero, double saldo){
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void creditar(double valor){
		saldo = saldo + valor;
	}
	
	public void debitar(double valor){
		if(saldo >= valor){
			saldo = saldo - valor;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void relatorio(){
		System.out.println("Informacoes Bancarias");
		System.out.println("Numero Conta: " + numero);
		System.out.println("Saldo R$ " + saldo);
	}
	
}

