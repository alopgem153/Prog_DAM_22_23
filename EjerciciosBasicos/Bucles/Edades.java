package Bucles;

import java.util.Scanner;

/*
 * Programa al que se le pasan edades, hasta que el usuario introduce -1
 * Al terminar debe mostrar la edad máxima y la edad mínima
 */

public class Edades {
    public static void main(String[] args) {
        
        //Declaro e inicializo las variables que necesito
        int maximo;
        int minimo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una edad");

        int edad = sc.nextInt();

        maximo = edad;
        minimo = edad;

        while (edad != -1)
        {
            //Zona de cáculo
            maximo=Math.max(maximo, edad);
            minimo= Math.min(minimo, edad);

            //Zona de actualización de condición
            System.out.println("Dime otra edad");
            edad = sc.nextInt();

        }

        if(maximo != -1)
        {
            System.out.println("La edad maxima es:" + maximo + " y la mínima es: " + minimo);
        }
        else
        {
            System.out.println("No has introducidio ninguna edad válida");
        }
    }
}
