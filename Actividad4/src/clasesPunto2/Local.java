package clasesPunto2;

public class Local extends Inmueble {
    enum Tipo { 
        INTERNO, 
        DIRECCION 
    };
    
    protected Tipo tipoLocal;

    public Local(int identificadorInmobiliario, int area, String direccion, Tipo tipoLocal) {
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }
    
    @Override
    public void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Tipo de local = " + tipoLocal);
        }
}
