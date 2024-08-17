
package clasesPunto2;

public class InmuebleVivienda extends Inmueble {
    protected int numeroHabitaciones;
    protected int numeroBaños;

    public InmuebleVivienda(int numeroHabitaciones, int numeroBaños, int identificadorInmobiliario, int area, String direccion) {
        super(identificadorInmobiliario, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de habitaciones = " + this.numeroHabitaciones);
        System.out.println("Número de baños = " + this.numeroBaños);
        }
    
}
