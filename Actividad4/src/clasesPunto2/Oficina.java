
package clasesPunto2;


public class Oficina extends Local {
    
    protected int areaValor = 3500000;
    protected boolean isPublic;

    public Oficina(boolean isPublic, int identificadorInmobiliario, int area, String direccion, Tipo tipoLocal) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.isPublic = isPublic;
    }
    
    @Override
    public void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Es oficina gubernamental = " + isPublic);
        System.out.println();
        }
    
}
