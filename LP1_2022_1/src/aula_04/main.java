package aula_04;

public class main {

	public static void main(String[] args) {
		Conta C1 = new Conta("123", 100.0);
		Conta C2 = new Conta("456");
		Conta C3 = new Conta();
		C1.relatorio();
		C2.relatorio();
		C3.relatorio();
	}

}
