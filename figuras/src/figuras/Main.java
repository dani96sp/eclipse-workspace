package figuras;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		System.out.println("Introduce el numero de la figura:");
		System.out.println("1 - Círculo");
		System.out.println("2 - Triángulo");
		final Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if (option == 1) {
			System.out.println("Introduce el radio del circulo:");
			int radio = sc.nextInt();
			Circulo circulo = new Circulo(radio);
			System.out.println(circulo.getArea());
		} else if (option == 2) {
			System.out.println("Introduce la base del triangulo:");
			int base = sc.nextInt();
			System.out.println("Introduce la altura del triangulo:");
			int altura = sc.nextInt();
			Triangulo triangulo = new Triangulo(base, altura);
			System.out.println(triangulo.getArea());
		} else if (option == 0) {
			System.out.println("Saliendo");
		}

	}

}
