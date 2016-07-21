package dsc.projetoHiperbole.controller;

import dsc.projetoHiperbole.model.Foco;

public class HiperboleController {

	private double calculaAB(double c, double ab) {

		double b = (c * c) - (ab * ab);
		double calculo = Math.sqrt(b);

		return calculo;
	}

	private double CalculaEixo(double eixo) {

		return eixo / 2;
	}

	public void calculaVariaveis(Foco foco, double c, boolean eixox, boolean eixoy) {

		double a = CalculaEixo(foco.getEixolength());
		double b = calculaAB(c, a);

		geraPontos(a, b, c, eixox, eixoy);
	}

	private void geraPontos(double a, double b, double c, boolean eixox, boolean eixoy) {

	}
}