
package logica;

import clasesPunto2.Apartaestudio;
import clasesPunto2.ApartamentoFamiliar;



public class Punto2 {
    public static void main(String args[]) {
    System.out.println("Datos apartamento familiar");
    ApartamentoFamiliar apto1 = new ApartamentoFamiliar(2000000,3,2,103067, 120, "Avenida Santander 45-4"); 
    
    apto1.calcularPrecioVenta(apto1.areaValor);
    apto1.imprimir();
    
    System.out.println("Datos apartaestudio");
    Apartaestudio aptestudio1 = new Apartaestudio(1,1, 12354, 50, "Avenida Caracas 30-15");
    
    aptestudio1.calcularPrecioVenta(aptestudio1.areaValor);
    aptestudio1.imprimir();
    }
    
}   
