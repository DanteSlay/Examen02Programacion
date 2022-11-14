package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("Introduce un número entre 1 y 1000: ");
            int numUsuario = in.nextInt();
            if(1>numUsuario || numUsuario>1000){
                System.out.println("Número invalido, vuelva a probar.");
            }else {
                if (1 <= numUsuario && numUsuario < 10) {
                    System.out.println("El número " + numUsuario + " tiene una cifra.");
                    break;
                } else if (10 <= numUsuario && numUsuario < 100) {
                    System.out.println("El número " + numUsuario + " tiene dos cifras.");
                    break;
                } else if (100 <= numUsuario && numUsuario < 1000){
                    System.out.println("El número " + numUsuario + " tiene tres cifras.");
                    break;
                }else {
                    System.out.println("El número " +numUsuario+ " tiene cuatro cifras.");
                    break;
                }
            }
        }
    }
}
