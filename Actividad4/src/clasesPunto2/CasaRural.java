
package clasesPunto2;

public class CasaRural extends Casa {
    protected float distanciaCabeceraMunicipal;
    protected float altitudNivelMar;

    public CasaRural(float distanciaCabeceraMunicipal, float altitudNivelMar, int cantidadPisos, int numeroHabitaciones, int numeroBaños, int identificadorInmobiliario, int area, String direccion) {
        super(cantidadPisos, numeroHabitaciones, numeroBaños, identificadorInmobiliario, area, direccion);
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
        this.altitudNivelMar = altitudNivelMar;
    }
    
    
}
