
package clasesPunto2;

public class Casa extends InmuebleVivienda{
    protected int cantidadPisos;

    public Casa(int cantidadPisos, int numeroHabitaciones, int numeroBaños, int identificadorInmobiliario, int area, String direccion) {
        super(numeroHabitaciones, numeroBaños, identificadorInmobiliario, area, direccion);
        this.cantidadPisos = cantidadPisos;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de pisos = " + this.cantidadPisos);
     }
    
}
