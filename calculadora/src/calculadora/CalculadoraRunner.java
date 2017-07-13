package calculadora;

import java.util.*;

public class CalculadoraRunner {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		Calculadora maria = new Calculadora();
		maria.suma(a, b);
		System.out.println("Para sumar introduce 1");
		System.out.println("Para multiplicar introduce 2");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if (option == 1) {
			System.out.println("Introduce el primer numero");
			int n1 = sc.nextInt();
			System.out.println("Introduce el segundo numero");
			int n2 = sc.nextInt();
			System.out.println(maria.suma(n1, n2));

		} else if (option == 2) {
			System.out.println("Introduce el primer numero");
			int n1 = sc.nextInt();
			System.out.println("Introduce el segundo numero");
			int n2 = sc.nextInt();
			System.out.println(maria.multiplicacion(n1, n2));
		} else {
			System.out.println("Saliendo de la calculadora");
		}
	}

}
