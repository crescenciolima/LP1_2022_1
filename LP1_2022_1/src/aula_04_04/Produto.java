package aula_04_04;

public class Produto {
	private String descricao;
	private double valor;
	private int qtd;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public void relatorio() {
		System.out.println("---------------------------------------");
		System.out.println(":: Resumo do Estoque ::");
		System.out.println("Descrição do Produto: " + descricao);
		System.out.println("Valor do Produto: " + valor);
		System.out.println("Quantidade do Produto em estoque: " + qtd);
	}
	
}
