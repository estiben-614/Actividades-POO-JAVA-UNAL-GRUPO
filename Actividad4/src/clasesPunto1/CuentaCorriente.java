
package clasesPunto1;

public class CuentaCorriente extends Cuenta{
    float sobregiro = 0;
    public CuentaCorriente(float saldo, float porcentajeTasaAnual) {
        super(saldo, porcentajeTasaAnual);
    }
    
    @Override
    public void retirar(float cantidadRetirar){
        if(super.saldo >= cantidadRetirar){
            super.retirar(cantidadRetirar);
        }
        else{
            sobregiro =(cantidadRetirar- super.saldo );
            super.saldo = 0;
            this.numeroRetiros += 1;
        }
  }
 
    @Override
    public void consignar(float cantidadConsignar){
        if(sobregiro > 0){
            float diferencia = sobregiro - cantidadConsignar;
            if(diferencia > 0) {
                sobregiro = diferencia;
                super.saldo = 0;
            }
            else{
                sobregiro = 0;
                super.saldo = diferencia*(-1);
            }
        }
        else {
            super.consignar(cantidadConsignar);
        }
 
    }
    
    
    @Override
    public void extractoMensual(){
        super.extractoMensual();
    }
    
    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Cargo mensual = $ " + super.comisionMensual);
        System.out.println("Número de transacciones ="  + (super.numeroConsignaciones + super.numeroRetiros));
        System.out.println("Valor sobregiro = $" +sobregiro);
        System.out.println();
}
}
