
package clasesPunto2;

public class PruebaPunto2 {
    public static void main(String args[]) {
    System.out.println("Datos apartamento familiar");
    ApartamentoFamiliar apto1 = new ApartamentoFamiliar(2000000,3,2,103067, 120, "Avenida Santander 45-4"); 
    
    apto1.calcularPrecioVenta(apto1.areaValor);
    apto1.imprimir();
    
    System.out.println("Datos apartaestudio");
    Apartaestudio aptestudio1 = new Apartaestudio(1,1, 12354, 50, "Avenida Caracas 30-15");
    
    aptestudio1.calcularPrecioVenta(aptestudio1.areaValor);
    aptestudio1.imprimir();
    
    System.out.println("Datos casa conjunto cerrado");
    CasaConjuntoCerrado casaCS1 = new CasaConjuntoCerrado(2000, true, false, 1, 1, 1, 2, 3, "Prueba");
    
    casaCS1.calcularPrecioVenta(casaCS1.areaValor);
    casaCS1.imprimir();
    
    System.out.println("Datos casa independiente");
    CasaIndependiente casaI1 = new CasaIndependiente(2000, 1, 1, 2, 3, "Prueba");
    
    casaI1.calcularPrecioVenta(casaI1.areaValor);
    casaI1.imprimir();
    
    System.out.println("Datos casa rural");
    CasaRural casaR1 = new CasaRural(2000, 3000,  1, 1, 2, 3,5, "Prueba");
    
    casaR1.calcularPrecioVenta(casaR1.areaValor);
    casaR1.imprimir();
    
    System.out.println("Datos Local Comercial");
    LocalComercial LocalC1 = new LocalComercial("Prueba", 2000, 3000,  "Prueba v2", Local.Tipo.DIRECCION);
    
    LocalC1.calcularPrecioVenta(LocalC1.areaValor);
    LocalC1.imprimir();
    
    System.out.println("Datos Oficina");
    Oficina oficina1 = new Oficina(true, 2000, 3000,  "Prueba v2", Local.Tipo.DIRECCION);
    
    oficina1.calcularPrecioVenta(oficina1.areaValor);
    oficina1.imprimir();
    }
    
}   
