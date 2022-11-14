package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double saldo = 1000;
        while(true) {
            System.out.println("""
                    Elige la operación ha realizar:
                    1. Consultar saldo.
                    2. Ingresar dinero.
                    3. Retirar dinero.
                    4. Salir.""");
            int opcion = in.nextInt();
            if(opcion == 4){
                System.out.println("Gracias por su visita.");
                break;
            }else if(1 > opcion || opcion > 4) {
                System.out.println("Número invalido, vuelva a intentarlo.");
            }else{
                switch (opcion) {
                    case 1:
                        System.out.println("El saldo de su cuenta corriente es: " + saldo+ "\n");
                        break;
                    case 2:
                        System.out.print("¿Cuanto dinero desea ingresar?: ");
                        double ingreso = in.nextDouble();
                        saldo += ingreso;
                        System.out.println("Su saldo actual es de: " + saldo+ "\n");
                        break;
                    case 3:
                        System.out.print("¿Cuanto dinero desea retirar?: ");
                        double retirada = in.nextDouble();
                        if (retirada > saldo) {
                            System.out.println("Saldo insuficiente.\n");
                        } else {
                            saldo -= retirada;
                            System.out.println("Su saldo actual es de: " + saldo+ "\n");
                        }
                        break;
                }
            }
        }
    }
}

