
package clasesPunto4;

public class Contrarrelojista extends Ciclista {
    private double velocidadMáxima;
    public Contrarrelojista(int identificador, String nombre, double
    velocidadMáxima) {
        super(identificador, nombre);
        this.velocidadMáxima = velocidadMáxima;
    }
    
    
    protected double getVelocidadMáxima() {
        return velocidadMáxima;
    }
    
    protected void setVelocidadMáxima(double velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }
    
    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Aceleración promedio = " + velocidadMáxima);
    }
    
    @Override
    protected String imprimirTipo() {
        return "Es un constrarrelojista";
    }
}
