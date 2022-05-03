package aula_04;

import java.util.Scanner;

public class Conta {
	private String numero;
	private double saldo;
	
	public Conta(String numeroIn, double saldoIn){
		numero = numeroIn;
		saldo = saldoIn;
	}
	
	public Conta(String numeroIn){
		numero = numeroIn;
		saldo = 0.0;
		
	}
	
	public Conta(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número da Conta: ");
		numero = entrada.nextLine();
		System.out.println("Digite o saldo da Conta: ");
		saldo = entrada.nextDouble();
		entrada.close();
	}
	
	
	
	public void relatorio(){
		System.out.println("---------");
		System.out.println("Numero da Conta: " + numero);
		System.out.println("Saldo: R$ " + saldo);
	}
	
	
}
