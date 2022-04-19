package aula_18_04;

public class RepositorioContaArrayTeste {

	public static void main(String[] args) {
		Conta C1 = new Conta("123", 100.0);
		Conta C2 = new Conta("456", 150.0);
		Conta C3 = new Conta("789", 50.0);
		Conta C4 = new Conta("111", 500.0);
		Conta C5 = new Conta("777", 250.0);
		
		RepositorioContasArray BD = new RepositorioContasArray();
		BD.inserir(C1);
		BD.inserir(C2);
		BD.inserir(C3);
		BD.inserir(C4);
		BD.inserir(C5);
		//BD.inserir(C1);
		
		BD.remover("123");
		
		BD.imprimir();
	}

}
