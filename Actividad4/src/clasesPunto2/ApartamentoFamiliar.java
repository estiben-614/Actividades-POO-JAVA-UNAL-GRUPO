
package clasesPunto2;

public class ApartamentoFamiliar extends Apartamento {
    protected float valorAdministracion;

    public ApartamentoFamiliar(float valorAdministracion, int numeroHabitaciones, int numeroBaños, int identificadorInmobiliario, int area, String direccion) {
        super(numeroHabitaciones, numeroBaños, identificadorInmobiliario, area, direccion);
        this.valorAdministracion = valorAdministracion;
    }


    
    
}
