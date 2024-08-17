
package clasesPunto2;

public class Inmueble {
    protected int identificadorInmobiliario;
    protected int area;
    protected String direccion;
    
    protected float  precioVenta;
    
    public Inmueble(int identificadorInmobiliario, int area, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }
    
    public float calcularPrecioVenta (int valorArea) {
        precioVenta = valorArea * this.area;
        return precioVenta;
    }
    
    public void imprimir() {
        System.out.println("Identificador inmobiliario = " + identificadorInmobiliario);
        System.out.println("Area ="  + area);
        System.out.println("Dirección = " + direccion);
        System.out.println("Precio de venta = $" + precioVenta);
        }
    
}
