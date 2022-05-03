package aula_02;

public class exemplo_2 {

	public static double fatorial(double x) {
		if (x <= 1) {
			return 1;
		} else {
			return x * fatorial(x-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(fatorial(67.0));

	}

}
