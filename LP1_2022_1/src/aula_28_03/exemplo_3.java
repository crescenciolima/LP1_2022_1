package aula_28_03;

public class exemplo_3 {

	public static int fibonacci(int x) {
		if (x==0 || x==1) {
			return x;
		} else {
			return fibonacci(x-1) + fibonacci(x-2);
		}
	}
	
	public static void main(String[] args) {
		int num = 5;
		for(int i=1 ; i < num; i++) {
			System.out.print(fibonacci(i) + " ");
		}

	}

}
