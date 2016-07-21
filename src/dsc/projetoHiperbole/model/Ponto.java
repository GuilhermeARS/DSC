package dsc.projetoHiperbole.model;

/**
 * Classe que representa um ponto no plano cartesiano (x,y).
 */
public class Ponto {
    
    private final double x;
    private final double y;
    
    public Ponto (double x, double y) {
        
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        
        return x;
    }
    
    public double getY() {
        
        return y;
    }
}