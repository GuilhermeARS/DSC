package dsc.projetoHiperbole.model;

/**
 * Classe que representa um ponto no plano cartesiano (x,y).
 */
public class Foco {

	private final double x;
	private final double y;
	private final double eixolength;

	public Foco(double x, double y, double eixolength) {

		this.x = x;
		this.y = y;
		this.eixolength = eixolength;
	}

	public double getX() {

		return x;
	}

	public double getY() {

		return y;
	}

	public double getEixolength() {
		return eixolength;
	}
}