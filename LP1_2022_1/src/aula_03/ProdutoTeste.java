package aula_03;

import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Produto p1 = new Produto();
		
		System.out.println("Digite a descricao do Produto: ");
		p1.setDescricao(entrada.nextLine());
		
		System.out.println("Digite o valor do Produto: R$ ");
		p1.setValor(entrada.nextDouble());
		
		System.out.println("Digite a quantidade do Produto: ");
		p1.setQtd(entrada.nextInt());
		
		p1.relatorio();
		
		entrada.close();

	}

}
