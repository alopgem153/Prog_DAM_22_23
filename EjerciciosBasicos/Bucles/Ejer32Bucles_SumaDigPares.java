package Bucles;

import java.util.Scanner;

public class Ejer32Bucles_SumaDigPares {
    
    public static void main(String[] args) {
        /*
         * Escribe un programa que, dado un número entero positivo, diga cuáles son y
            cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
            izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
            números largos.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numeroLeido = sc.nextInt();
        
        sc.close();

        int numero = numeroLeido;
        String digitosPares = "";
        int sumaPares = 0;

        while (numero > 0)
        {
            int digitoDelNumero = numero % 10;
            
            if (digitoDelNumero % 2 == 0)
            {
                digitosPares = digitoDelNumero + " " +  digitosPares;
                sumaPares += digitoDelNumero;
            }


            numero = numero / 10;
        }

        System.out.println("Digitos Pares: "+ digitosPares);
        System.out.println("Suma de los dígtos pares: "+ sumaPares);

        
    }
}
