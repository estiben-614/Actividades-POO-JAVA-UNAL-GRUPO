
package clasesPunto2;

public class CasaRural extends Casa {
    protected float distanciaCabeceraMunicipal;
    protected float altitudNivelMar;
    protected int areaValor = 1500000;  
            
    public CasaRural(float distanciaCabeceraMunicipal, float altitudNivelMar, int cantidadPisos, int numeroHabitaciones, int numeroBaños, int identificadorInmobiliario, int area, String direccion) {
        super(cantidadPisos, numeroHabitaciones, numeroBaños, identificadorInmobiliario, area, direccion);
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
        this.altitudNivelMar = altitudNivelMar;
    }
    
    public void imprimir() {
        super.imprimir(); 
        System.out.println("Distancia la cabecera municipal = " + this.distanciaCabeceraMunicipal + " km.");
        System.out.println("Altitud sobre el nivel del mar = " + this.altitudNivelMar + " metros.");
        System.out.println();
        }
    
    
}
