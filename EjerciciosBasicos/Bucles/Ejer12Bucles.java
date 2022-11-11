package Bucles;

import java.util.Scanner;

public class Ejer12Bucles {
    public static void main(String[] args) {
        /*
         * Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe
introducir por teclado.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número");

        int numero = sc.nextInt();

        switch (numero)
        {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("0, 1");
                break;
            default:

                int num1 = 0;
                int num2 = 1;
                int fibActual = num1 + num2;

                System.out.print(num1 +", "+ num2);

                while (numero>0)
                {
                    System.out.print(", "+ fibActual);

                    num1 = num2;
                    num2 = fibActual;
                    fibActual = num1 + num2;
                    numero--;

                }

                break;
        }
    }
}
