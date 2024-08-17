
package logica;

import clasesPunto1.CuentaAhorros;
import clasesPunto1.CuentaCorriente;
import java.util.Scanner;

public class Punto1Herencia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite 1 para cuenta de ahorro o 2 para cuenta corriente: ");
        int tipoCuenta = teclado.nextInt();
        
        switch (tipoCuenta) {
            case 1 -> {
                /* Cuenta de ahorros */
                System.out.println("Cuenta de ahorros");
                System.out.println("Ingrese el saldo inicial en ($) = ");
                float saldoInicialAhorros = teclado.nextFloat();
                System.out.println("Ingrese la tasa de interés anual = ");
                float tasaInteresAhorros = teclado.nextFloat();
                CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicialAhorros, tasaInteresAhorros);
                System.out.print("Ingresar cantidad a consignar en ($) = ");
                float cantidadDepositar = teclado.nextFloat();
                cuenta1.consignar(cantidadDepositar);
                System.out.print("Ingresar cantidad a retirar en ($)");
                float cantidadRetirar = teclado.nextFloat();
                cuenta1.retirar(cantidadRetirar);
                cuenta1.extractoMensual();
                cuenta1.imprimir();
                System.out.println("*****************************************");
            }

            case 2 -> {
                /** Cuenta Corriente **/
                System.out.println("Cuenta corriente");
                System.out.println("Ingrese el saldo inicial en ($) = ");
                float saldoInicialCorriente = teclado.nextFloat();
                System.out.println("Ingrese la tasa de interés anual = ");
                float tasaInteresCorriente = teclado.nextFloat();
                CuentaCorriente cuenta2 = new CuentaCorriente(saldoInicialCorriente, tasaInteresCorriente);
                System.out.print("Ingresar cantidad a consignar en ($) = ");
                float cantidadDepositar = teclado.nextFloat();
                cuenta2.consignar(cantidadDepositar);
                System.out.print("Ingresar cantidad a retirar en ($)");
                float cantidadRetirar = teclado.nextFloat();
                cuenta2.retirar(cantidadRetirar);
                cuenta2.extractoMensual();
                cuenta2.imprimir();
                System.out.println("*****************************************");
            }
            default -> System.out.println("No selecciono un valor válido.");
        }
        
        
    }
    
}
