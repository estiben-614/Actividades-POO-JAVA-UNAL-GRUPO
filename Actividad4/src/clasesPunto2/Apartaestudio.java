
package clasesPunto2;

public class Apartaestudio extends Apartamento {
    
    protected int areaValor = 1500000;
    // Una sola habitacion y 1 solo baño

    public Apartaestudio(int numeroHabitaciones, int numeroBaños, int identificadorInmobiliario, int area, String direccion) {
        super(1, 1, identificadorInmobiliario, area, direccion);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println();
     }
    
}
