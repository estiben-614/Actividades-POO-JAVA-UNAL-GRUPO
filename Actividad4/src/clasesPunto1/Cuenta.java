
package clasesPunto1;

public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float porcentajeTasaAnual;
    protected float comisionMensual = 0;

    public Cuenta(float saldo, float porcentajeTasaAnual) {
        this.saldo = saldo;
        this.porcentajeTasaAnual = porcentajeTasaAnual;
    }

    public void consignar(float cantidadConsigacion){
        this.saldo += cantidadConsigacion;
        this.numeroConsignaciones += 1;
    }
    
    public void retirar(float cantidadRetiro){
        if( this.saldo >= cantidadRetiro){
            this.saldo -= cantidadRetiro;
            this.numeroRetiros += 1;
        }
        else {
            System.out.println("Saldo insuficiente");
        }
        
    }
    
    public float calcularInteresMensual(){
        float tasaMensual = this.porcentajeTasaAnual/12;
        float interesMensual = this.saldo * tasaMensual;
        return this.saldo += interesMensual;  
    }
    
    public void extractoMensual(){
        this.saldo -= this.comisionMensual;
        calcularInteresMensual();
    }
    
}
