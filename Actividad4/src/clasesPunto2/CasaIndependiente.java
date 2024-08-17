
package clasesPunto2;

public class CasaIndependiente extends CasaUrbana {
    protected int areaValor= 3000000;

    public CasaIndependiente(int cantidadPisos, int numeroHabitaciones, int numeroBaños, int identificadorInmobiliario, int area, String direccion) {
        super(cantidadPisos, numeroHabitaciones, numeroBaños, identificadorInmobiliario, area, direccion);
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println();
     }
    
}
