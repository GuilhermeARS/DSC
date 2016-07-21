package dsc.projetoHiperbole.controller;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import dsc.projetoHiperbole.model.Foco;
import dsc.projetoHiperbole.model.Hiperbole;

public class HiperboleController {

	private double calculaAB(double c, double ab) {

		double testec = 2*c;
		double testeab = 2*ab;
		
		verificaCondicaoExistencia(testec, testeab);
			
		double b = (c * c) - (ab * ab);
		double calculo = Math.sqrt(b);

		return calculo;
	}

	private double CalculaEixo(double eixo) {

		return eixo / 2;
	}
	
	private void verificaCondicaoExistencia(double testec, double testeab){
		
		if(testeab <= 0 || testeab >= testec){
			System.err.println("Condição de Existencia não atendida");
			System.exit(0);
		}
	}

	public void calculaVariaveis(Foco foco, double c, boolean eixox, boolean eixoy) {

		double a = CalculaEixo(foco.getEixolength());
		double b = calculaAB(c, a);

		geraPontos(a, b, c, eixox, eixoy);
	}

	private void geraPontos(double a, double b, double c, boolean eixox, boolean eixoy) {

		// paraleliza 100 pontos
		Hiperbole hiperbole = new Hiperbole(1, 20, a, b, c, eixox, eixoy);
		Hiperbole hiperbole2 = new Hiperbole(21, 40, a, b, c, eixox, eixoy);
		Hiperbole hiperbole3 = new Hiperbole(41, 60, a, b, c, eixox, eixoy);
		Hiperbole hiperbole4 = new Hiperbole(61, 80, a, b, c, eixox, eixoy);
		Hiperbole hiperbole5 = new Hiperbole(81, 100, a, b, c, eixox, eixoy);

		ExecutorService service = Executors.newFixedThreadPool(5);

		service.execute(hiperbole);
		service.execute(hiperbole2);
		service.execute(hiperbole3);
		service.execute(hiperbole4);
		service.execute(hiperbole5);

		service.shutdown();
	}
}