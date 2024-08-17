
package clasesPunto2;

public class ApartamentoFamiliar extends Apartamento {
    
    protected int areaValor = 2000000;
    protected float valorAdministracion;

    public ApartamentoFamiliar(float valorAdministracion, int numeroHabitaciones, int numeroBaños, int identificadorInmobiliario, int area, String direccion) {
        super(numeroHabitaciones, numeroBaños, identificadorInmobiliario, area, direccion);
        this.valorAdministracion = valorAdministracion;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor de la administración = $" + valorAdministracion);
        System.out.println();
        }


    
    
}
