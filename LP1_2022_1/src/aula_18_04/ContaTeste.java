package aula_18_04;

public class ContaTeste {

	public static void main(String[] args) {
		Conta C1 = new Conta("123", 100.0);
		Conta C2 = new Conta("456", 150.0);
		Conta C3 = new Conta("789", 50.0);
		
		//Alocação Estática
		Conta [] ContasBD1 = {C1, C2, C3};
		
		//Alocação Dinâmica
		Conta [] ContasBD2 = new Conta[3];
		ContasBD2[0] = C1;
		ContasBD2[1] = C2;
		ContasBD2[2] = C3;
		
		ContasBD1[0].creditar(100.0);
		ContasBD1[0].relatorio();
		
		for(int i = 0; i < ContasBD1.length; i++){
			System.out.println("----------");
			ContasBD1[i].relatorio();
		}

		for(int i = 0; i < ContasBD2.length; i++){
			System.out.println("----------");
			ContasBD2[i].relatorio();
		}
		
	}

}
