package aula_11_04;

import java.util.Scanner;

public class Aluno {
	private int matricula;
	private String nome;
	private int idade;
	private Curso cursoMat;
	
	public Aluno(int mat, String nomeIn, int idadeIn, Curso cursoMatIn){
		matricula = mat;
		nome = nomeIn;
		idade = idadeIn;
		cursoMat = cursoMatIn;
	}
	
	public Aluno(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a matricula: ");
		matricula = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Digite o nome de Aluno");
		nome = entrada.nextLine();
		System.out.println("Digite a idade");
		idade = entrada.nextInt();
		cursoMat = new Curso();
		entrada.close();
	}
	
	public void imprimirAluno(){
		System.out.println("-----------");
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome do Aluno: " + nome);
		System.out.println("Idade: " + idade);
		cursoMat.imprimirCurso();
	}
}
