package Bucles;

import java.util.Scanner;

public class CifradoAscii {

    public static void main(String[] args) {
        /*
         * Vamos a realizar un cifrado de texto que consistirá en sustituir 
         * cada letra del texto por un carácter que estará x posiciones más adelantado
         */

        Scanner sc = new Scanner(System.in);

        //VARIABLES DE TODO EL PROGRAMA
        String fraseCifrada = "";


        //lECTURA DE INFORMACIÓN
        System.out.println("Que frase quieres cifrar");
        String frase = sc.nextLine().toUpperCase();

        System.out.println("Dime el factor de cifrado...");
        int factor = sc.nextInt();


        //Dividimos la frase en palabras

        String[] palabras = frase.split(" ");

        //Recorro todas las palabras de la frase
        for(int numeroPalabra = 0; numeroPalabra <= palabras.length-1; numeroPalabra++)
        {
            String palabra = palabras[numeroPalabra];

            String palabraCifrada = "";

            //Recorro una Palabra y la cifro
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

                palabraCifrada += nuevoCaracter +"";

                //System.out.println("Caracter: " + caracterLeido + " --- " + nuevoCaracter + "(" + numeroNuevoCaracter + ")");
            }

            palabraCifrada = factor + palabraCifrada;

            fraseCifrada += palabraCifrada + " ";

            //System.out.println("------------------");
            //System.out.println("La palabra cifrada es: " + fraseCifrada);

        } //END FOR palabras[]

        //Devolver resultado
        System.out.println("La frase cifrada completamente es: " + fraseCifrada);

    }
    
}
