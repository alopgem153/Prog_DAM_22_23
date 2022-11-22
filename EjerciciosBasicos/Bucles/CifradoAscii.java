package Bucles;

import java.util.Scanner;

public class CifradoAscii {

    public static void main(String[] args) {
        /*
         * Vamos a realizar un cifrado de texto que consistirá en sustituir 
         * cada letra del texto por un carácter que estará x posiciones más adelantado
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Que palabra quieres cifrar");
        String palabra = sc.nextLine().toUpperCase();

        System.out.println("Dime el factor de cifrado...");
        int factor = sc.nextInt();

        for(int apuntador = 0; apuntador <= palabra.length()-1; apuntador++)
        {
            char caracterLeido = palabra.charAt(apuntador);

            int numeroNuevoCaracter = (int)caracterLeido + factor;

            //Veo si estoy en el rango de 65 a 90 (ABC....XYZ)
            if(numeroNuevoCaracter > 90)
            {
                //tengo que empezar desde A cuando llega a Z
                numeroNuevoCaracter = ((numeroNuevoCaracter - 65) % 25) + 64;
            
            } 

            char nuevoCaracter = (char)numeroNuevoCaracter;

            System.out.println("Caracter: " + caracterLeido + " --- " + nuevoCaracter + "(" + numeroNuevoCaracter + ")");
        }

    }
    
}
