package figuras;

public class Circulo implements FiguraGeometrica {

	private int radio;

	public Circulo(int radio) {
		this.radio = radio;
	}

	public double getArea() {
		return Math.PI * Math.pow(radio, 2);
	}

}
