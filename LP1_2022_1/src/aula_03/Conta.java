package aula_03;

public class Conta {
	private String numero;
	private double saldo;
	
	public String getNumero(){
		return numero;
	}
	
	public void setNumero(String numero_temp){
		numero = numero_temp;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
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
