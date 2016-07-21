package dsc.projetoHiperbole.model;

import java.text.DecimalFormat;

public class Hiperbole implements Runnable {

	private int init;
	private int fim;
	private double a;
	private double b;
	private double c;
	private boolean eixox;
	private boolean eixoy;
	private boolean verifica;

	public Hiperbole(int init, int fim, double a, double b, double c, boolean eixox, boolean eixoy) {

		setInit(init);
		setFim(fim);
		setA(a);
		setB(b);
		setC(c);
		setEixox(eixox);
		setEixoy(eixoy);
	}

	@Override
	public void run() {

		for (int x = getInit(); x <= getFim(); x++) {

			if (isEixox()) {

				double yquadrado = (-(getA() * getA() * getB() * getB()) + (x * x * getB() * getB()))
						/ (getA() * getA());
				
				yquadrado = valorAbsoluto(yquadrado);
				double y = Math.sqrt(yquadrado);

				DecimalFormat format = new DecimalFormat("0.##");
				String xformat = format.format(x);
				String yformat = format.format(y);
				
				imprime(xformat, yformat);

			} else if (isEixoy()) {

				double yquadrado = ((getA() * getA() * getB() * getB()) + (x * x * getA() * getA()))
						/ (getB() * getB());
				double y = Math.sqrt(yquadrado);
				
				DecimalFormat format = new DecimalFormat("0.##");
				String xformat = format.format(x);
				String yformat = format.format(y);

				imprime(xformat, yformat);
			}
		}
	}
	
	private double valorAbsoluto(double yquadrado){
		
		double convert = yquadrado;
		
		if(yquadrado < 0){
			
			setVerifica(true);
			convert = Math.abs(yquadrado);
		}
		
		return convert;
	}
	
	private void imprime(String x, String y){
		
		if(isVerifica()){
			System.out.println("P = (" + x + ", " + "-" + y.replaceAll(",", ".") + ")");
			setVerifica(false);
		} else {
			System.out.println("P = (" + x + ", " + y.replaceAll(",", ".") + ")");
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

	public synchronized boolean isEixox() {
		return eixox;
	}

	public synchronized void setEixox(boolean eixox) {
		this.eixox = eixox;
	}

	public synchronized boolean isEixoy() {
		return eixoy;
	}

	public synchronized void setEixoy(boolean eixoy) {
		this.eixoy = eixoy;
	}

	public int getInit() {
		return init;
	}

	public void setInit(int init) {
		this.init = init;
	}

	public int getFim() {
		return fim;
	}

	public void setFim(int fim) {
		this.fim = fim;
	}

	public synchronized boolean isVerifica() {
		return verifica;
	}

	public synchronized void setVerifica(boolean verifica) {
		this.verifica = verifica;
	}

}
