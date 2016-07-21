package dsc.projetoHiperbole.model;

public class Hiperbole implements Runnable {

	private double a;
	private double b;
	private double c;
	private double x;
	private boolean eixox;
	private boolean eixoy;

	public Hiperbole(double a, double b, double c, double x, boolean eixox, boolean eixoy) {

		setA(a);
		setB(b);
		setC(c);
		setX(x);
		setEixox(eixox);
		setEixoy(eixoy);
	}

	@Override
	public void run() {

		if (isEixox()) {

			double yquadrado = (-(getA() * getA() * getB() * getB()) + (getX() * getX() * getB() * getB()))
					/ (getA() * getA());
			double y = Math.sqrt(yquadrado);

			System.out.println("P = (" + getX() + "," + y + ")");

		} else if (isEixoy()) {

			double yquadrado = ((getA() * getA() * getB() * getB()) + (getX() * getX() * getA() * getA()))
					/ (getB() * getB());
			double y = Math.sqrt(yquadrado);
			
			System.out.println("P = (" + getX() + "," + y + ")");
		}
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public boolean isEixox() {
		return eixox;
	}

	public void setEixox(boolean eixox) {
		this.eixox = eixox;
	}

	public boolean isEixoy() {
		return eixoy;
	}

	public void setEixoy(boolean eixoy) {
		this.eixoy = eixoy;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

}
