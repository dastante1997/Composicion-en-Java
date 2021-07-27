package composicionjava;

import java.util.Scanner;
public class Cuenta {
    private int nroCuenta;
    private double saldoCuenta;

    public Cuenta(int nroCuenta, double saldoCuenta) {
        this.nroCuenta = nroCuenta;
        this.saldoCuenta = saldoCuenta;
    }
    
    /**
     * @return the nroCuenta
     */
    public int getNroCuenta() {
        return nroCuenta;
    }

    /**
     * @return the saldoCuenta
     */
    public double getSaldoCuenta() {
        return saldoCuenta;
    }
    
    public void depositar(double cantidad){
        Scanner scan = new Scanner(System.in);
        while(cantidad<0){
            System.out.println("Cantidad ingresada no valida, reingrese: ");
            cantidad = scan.nextDouble();
        }
        saldoCuenta+=cantidad;
    }
    
    public void retirar(double cantidad){
        Scanner scan = new Scanner(System.in);
        while(cantidad<0){
            System.out.println("Cantidad ingresada no valida, reingrese: ");
            cantidad = scan.nextDouble();
        }
        while(cantidad>saldoCuenta){
            System.out.println("Cantidad no disponible para retirar, reingrese: ");
            cantidad = scan.nextDouble();
        }
        saldoCuenta-=cantidad;
    }
}
