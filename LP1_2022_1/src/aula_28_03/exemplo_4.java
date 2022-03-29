package aula_28_03;

import java.util.Scanner;

public class exemplo_4 {

	public static int multiplica(int x, int y) {
		if (y>0) {
			return x * multiplica(x, y-1);
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		int num1, num2;
		Scanner input = new Scanner(System.in);
		System.out.print("Digitie o número base: ");
		num1 = input.nextInt();
		System.out.print("Digitie o número para a potencia: ");
		num2 = input.nextInt();
		System.out.println("Resultado: " + multiplica(num1, num2));
		input.close();
	}

}
