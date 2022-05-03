package aula_04;

import java.util.Scanner;

public class Curso {
	private int codigo;
	private String nome;
	
	public Curso(int codigoIn, String nomeIn){
		codigo = codigoIn;
		nome = nomeIn;
	}
	
	public Curso(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o codigo do Curso: ");
		codigo = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Digite o nome do Curso: ");
		nome = entrada.nextLine();
		entrada.close();
	}
	
	public void imprimirCurso(){
		System.out.println("=======");
		System.out.println("Codigo do Curso: " + codigo);
		System.out.println("Nome do Curso: " + nome);
	}

}
