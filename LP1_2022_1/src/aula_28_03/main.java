package aula_28_03;

public class main {

	public static void main(String[] args) {
		int result;
		exemplo_1 x = new exemplo_1();
		result = x.soma(5, 6);
		System.out.println(result);
		
		System.out.println(x.soma(3.4, 2.1));
		System.out.println(x.soma(5));
		System.out.println(x.soma());
		
		System.out.println(x.sqr(5.0, 5.0));
		
		for(int i=0; i < 10; i++) {
			x.cabecalho();
		}

	}

}
