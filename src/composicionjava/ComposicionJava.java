
package composicionjava;

import java.util.ArrayList;
import java.util.Scanner;

public class ComposicionJava {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("1727010439", "Maycon Caisaguano"));
        int opcion;
        String cedula;
        String nombre;
        System.out.println("BIENVENIDO!!");
        for (;;) {
            System.out.println("1. Crear Cliente");
            System.out.println("2. Asignar cuenta o cuentas al cliente");
            System.out.println("3. Depositar");
            System.out.println("4. Retirar");
            System.out.println("5. Consultar Saldo");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opcion deseada: ");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    scan.nextLine();
                    System.out.println("Ingrese el nombre del Cliente: ");
                    nombre = scan.nextLine();
                    System.out.println("Ingrese el numero de Cedula del Cliente: ");
                    cedula = scan.nextLine();
                    clientes.add(new Cliente(cedula, nombre));
                    System.out.println("Cliente Ingresado exitosamente!!");
                    break;
                case 2:
                    scan.nextLine();
                    System.out.println("Ingrese la cedula del cliente que quiere asignar una cuenta o cuentas: ");
                    cedula = scan.nextLine();
                    for (Cliente cliente : clientes) {
                        if (cedula.equals(cliente.getCedula())) {
                            boolean bandera = true;
                            do {
                                System.out.println("Ingrese el numero de cuenta: ");
                                int nroCuenta = Integer.parseInt(scan.nextLine());
                                scan.nextLine();
                                System.out.println("Ingrese el saldo incial de la cuenta: ");
                                double saldoCuenta = Double.parseDouble(scan.nextLine());
                                Cuenta cuenta = new Cuenta(nroCuenta, saldoCuenta);
                                cliente.getCuentas().add(cuenta);
                                System.out.println("Se ha asignado la cuenta al Cliente satisfactoriamente!!");
                                System.out.println("Desea asignar otra cuenta a este cliente?(S/N): ");
                                String opc = scan.nextLine();
                                opc = opc.toLowerCase();
                                if (opc.charAt(0) != 's') {
                                    bandera = false;
                                }
                            } while (bandera);
                            break;
                        }

                    }
                    break;
                case 3:
                    scan.nextLine();
                    System.out.println("Ingrese su cedula: ");
                    cedula = scan.nextLine();
                    for (Cliente cliente : clientes) {
                        if (cliente.getCedula().equals(cedula)) {
                            System.out.println("Ingrese el numero de la cuenta en la que depositara: ");
                            int nroCuenta = scan.nextInt();
                            for (Cuenta cuenta : cliente.getCuentas()) {
                                if (cuenta.getNroCuenta() == nroCuenta) {
                                    System.out.println("Ingrese el valor del deposito: ");
                                    double cantidad = scan.nextDouble();
                                    cuenta.depositar(cantidad);
                                }
                            }
                            break;
                        }
                    }
                    break;
                case 4:
                    scan.nextLine();
                    System.out.println("Ingrese su cedula: ");
                    cedula = scan.nextLine();
                    for (Cliente cliente : clientes) {
                        if (cliente.getCedula().equals(cedula)) {
                            System.out.println("Ingrese el numero de la cuenta de la desea retirar: ");
                            int nroCuenta = scan.nextInt();
                            for (Cuenta cuenta : cliente.getCuentas()) {
                                if (cuenta.getNroCuenta() == nroCuenta) {
                                    System.out.println("Ingrese el valor del retiro: ");
                                    double cantidad = scan.nextDouble();
                                    cuenta.retirar(cantidad);
                                }
                            }
                            break;
                        }
                    }
                    break;
                case 5:
                    scan.nextLine();
                    System.out.println("Ingrese su cedula: ");
                    cedula = scan.nextLine();
                    for (Cliente cliente : clientes) {
                        if (cliente.getCedula().equals(cedula)) {
                            System.out.println("Ingrese el numero de la cuenta en la que depositara: ");
                            int nroCuenta = scan.nextInt();
                            for (Cuenta cuenta : cliente.getCuentas()) {
                                if (cuenta.getNroCuenta() == nroCuenta) {
                                    System.out.println("El saldo de su cuenta es: " + cuenta.getSaldoCuenta());
                                }
                            }
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("Gracias por usar el sistema!!");
                    System.exit(0);
                    break;
            }
        }
    }

}
