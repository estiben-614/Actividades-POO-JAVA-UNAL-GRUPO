
package clasesPunto2;

public class LocalComercial extends Local {
    
    protected int areaValor = 3000000;
    protected String centroComercial;

    public LocalComercial(String centroComercial, int identificadorInmobiliario, int area, String direccion, Tipo tipoLocal) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }
    
    @Override
    public void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Centro comercial = " + this.centroComercial);
        System.out.println();
        }
    
}
