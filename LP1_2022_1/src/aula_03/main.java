package aula_03;

public class main {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.setNumero("123");
		c1.creditar(100.0);
		System.out.println(c1.getNumero());
		c1.debitar(110.0);
		c1.relatorio();
	}

}
