package clasesPunto2;

public class CasaConjuntoCerrado extends CasaUrbana{
    protected float valorAdministracion;
    protected boolean hasPiscina;
    protected boolean hasCamposDeportivos;
    protected int areaValor = 2500000;

    public CasaConjuntoCerrado(float valorAdministracion, boolean areasComunes, boolean hasPiscina, boolean hasCamposDeportivos, int cantidadPisos, int numeroHabitaciones, int numeroBaños, int identificadorInmobiliario, int area, String direccion) {
        super(cantidadPisos, numeroHabitaciones, numeroBaños, identificadorInmobiliario, area, direccion);
        this.valorAdministracion = valorAdministracion;
        this.hasPiscina = hasPiscina;
        this.hasCamposDeportivos = hasCamposDeportivos;
    }
    
    
    @Override
        public void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administración = " + this.valorAdministracion);
        System.out.println("Tiene piscina? = " + this.hasPiscina);
        System.out.println("Tiene campos deportivos? = " + hasCamposDeportivos);
        System.out.println();
        }
    
    
}
