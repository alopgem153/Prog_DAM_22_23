package Bucles;

public class Ejer23Bucles {
    
    public static void main(String[] args) {
        
        /*
         * Escribe un programa que permita ir introduciendo una serie indeterminada
            de números mientras su suma no supere el valor 10000. Cuando esto último
            ocurra, se debe mostrar el total acumulado, el contador de los números
            introducidos y la media.

            Añadir mostrar el maximo y el minimo

            Lo haré con un random
         */

         int sumaTotal = 0;
         int cantidadNumero = 0;

         int maximo = 0;
         int minimo = 10000;

        do
        {
            
            int numeroNuevo = (int)(Math.random() * 1000);

            maximo = Math.max(maximo, numeroNuevo);
            minimo = Math.min(minimo, numeroNuevo);

            cantidadNumero++;
            sumaTotal += numeroNuevo;

        } while (sumaTotal < 10000);

        System.out.println("Suma total= " + sumaTotal);
        System.out.println("Cantidad de numeros: " + cantidadNumero);
        System.out.println("Media "+ sumaTotal/(double)cantidadNumero);
        System.out.println("Maximo: " + maximo);
        System.out.println("minimo: "+ minimo);

    }
}
