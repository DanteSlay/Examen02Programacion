package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("Introduce un número: ");
            int numUsuario = in.nextInt();
            if(numUsuario < 1){
                System.out.println("Número menor que 1, vuelva a intentarlo. ");
            }else {
                System.out.println("\nNúmeros divisibles por 2 entre 1 y " + numUsuario + ":");
                for (int num = 1; num <= numUsuario; num++) {
                    if (num % 2 == 0 && num % 3 == 0) {
                        System.out.println(num);
                    }
                }
                break;
            }
        }
    }
}
