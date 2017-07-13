package figuras;

public class Triangulo implements FiguraGeometrica {

	private int base;
	private int altura;

	public Triangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getArea() {
		return base * altura / 2;
	}

}
