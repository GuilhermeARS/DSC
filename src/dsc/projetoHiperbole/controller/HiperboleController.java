package dsc.projetoHiperbole.controller;

import dsc.projetoHiperbole.model.Foco;

public class HiperboleController {

	private double calculaAB(double c, double ab) {

		double b = (c * c) - (ab * ab);
		double calculo = Math.sqrt(b);
		
		return calculo;
	}
	
	private double CalculaEixo(double eixo){
		
		return eixo/2;
	}
	
	public void calculaPontos(Foco foco, double c){
		
		double a = CalculaEixo(foco.getEixolength());
		double b = calculaAB(c, a);
		
	}
}