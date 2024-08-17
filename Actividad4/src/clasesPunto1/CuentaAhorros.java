
package clasesPunto1;

public class CuentaAhorros extends Cuenta {
    private boolean isActive;

    public CuentaAhorros(float saldo, float porcentajeTasaAnual) {
        super(saldo, porcentajeTasaAnual);
        
        isActive = saldo >= 10000;
    }
    
    @Override
    public void consignar(float cantidadConsignacion){
        if(isActive){
            super.consignar(cantidadConsignacion);
        }
    }
    @Override
    public void retirar(float cantidadRetirar){
        if(isActive){
            super.retirar(cantidadRetirar);
        }
    }
    
    @Override
    public void extractoMensual(){
        if(super.numeroRetiros > 4) {
            int retirosAdicionales = super.numeroRetiros - 4;
            super.comisionMensual = retirosAdicionales * 1000;
        }
        
        super.extractoMensual();
        
        isActive = super.saldo >= 10000;
    }
    
    public void imprimir(){
        System.out.println("Saldo = $"+ this.saldo);
        System.out.println("Comision mensual = $" +this.comisionMensual);
        System.out.println("Número de transacciones = " + (this.numeroConsignaciones + this.numeroRetiros));
        System.out.println();
    }
    
}
