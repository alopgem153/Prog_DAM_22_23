package Bucles;

import java.util.Scanner;

public class EstadisticaIES {

    /*
     * Programa que pide las edades de los alumnos de un instituto
     * Para cuando se introduce -1
     * 
     * Debe mostgrar la suma de las edades, la media, 
     * el total de alumnos y total alumnos mayores de edad
     */

     public static void main(String[] args) {
       
        int totalAlumnos = 0;
        int sumaEdades = 0;
        double mediaEdades = 0;
        int alumnosMayoresEdad = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una edad");
        int edad = sc.nextInt();
        
        while (edad != -1)
        {
            sumaEdades += edad;
            totalAlumnos++;

            if (edad >= 18)
            {
                alumnosMayoresEdad++;
            }
  
            //Actualizo la condición
            System.out.println("Introduce otra edad");
            edad = sc.nextInt();

        }

        mediaEdades = (double)sumaEdades / (double)totalAlumnos;

        System.out.println("Total alumnos: " + totalAlumnos);
        System.out.println("Suma de las edades: " + sumaEdades);
        System.out.println("Media de las edades: " + mediaEdades);
        System.out.println("Alumnos mayores de edad: " + alumnosMayoresEdad );
    
        sc.close();

     }
    
}
