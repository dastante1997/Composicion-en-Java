
package composicionjava;

import java.util.ArrayList;

public class Cliente {
    private String cedula;
    private String nombre;
    private ArrayList<Cuenta> cuentas = new ArrayList<>();

    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }    

    public String getCedula() {
        return cedula;
    }
 
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
    
    public double consultarSaldo(int numeroCuenta){
        double saldo =0;
        return saldo;
    }
    
    public void ingresarDinero(int numeroCuenta, double dinero){
        
    }
    public void retirarDinero(int numeroCuenta, double dinero){
        
    }
    
}
