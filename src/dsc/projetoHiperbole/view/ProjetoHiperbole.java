package dsc.projetoHiperbole.view;

import dsc.projetoHiperbole.controller.HiperboleController;
import dsc.projetoHiperbole.model.Ponto;


/**
 * Classe principal do Projeto Hipérbole, faz chamada para as funções de alto 
 * nível do programa.
 * 
 * Definição de hipérbole: Considere F1 e F2 como sendo dois pontos distintos 
 * do plano e 2c a distância entre eles. Hipérbole é o conjunto dos pontos do 
 * plano, tais que a diferença, em valor absoluto, das distâncias à F1 e F2 é 
 * a constante 2a (0 < 2a < 2c). 
 * A hipérbole pode ter os focos sobre o eixo x ou sobre o eixo y e sua equação 
 * varia em cada um dos casos.
 * 
 * Equação da hipérbole quando os focos da hipérbole estão localizados sobre o 
 * eixo x:
 * 
 *		x²   y²
 *		–– - –– = 1
 *		a2   b²
 * 
 * Equação da hipérbole quando os focos da hipérbole estão localizados sobre o
 * eixo y:
 * 
 *		y²   x²
 *		–– - –– = 1
 *		a2   b²
 */
public class ProjetoHiperbole {

	public static void main (String[] args) {

		System.out.println("Projeto Hipérbole");
	}
}