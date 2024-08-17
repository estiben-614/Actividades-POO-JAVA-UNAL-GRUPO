package clasesPunto2;

public class CasaConjuntoCerrado extends CasaUrbana{
    protected float valorAdministracion;
    protected boolean areasComunes;

    public CasaConjuntoCerrado(float valorAdministracion, boolean areasComunes, int cantidadPisos, int numeroHabitaciones, int numeroBaños, int identificadorInmobiliario, int area, String direccion) {
        super(cantidadPisos, numeroHabitaciones, numeroBaños, identificadorInmobiliario, area, direccion);
        this.valorAdministracion = valorAdministracion;
        this.areasComunes = areasComunes;
    }
    
    
}
