package dsc.projetoHiperbole.controller;

public class HiperboleController {

	public double calculaAB(int c, int ab) {

		int b = (c * c) - (ab * ab);
		double calculo = Math.sqrt(b);
		
		return calculo;
	}
	
	public int CalculaEixo(int eixo){
		
		return eixo/2;
	}
}