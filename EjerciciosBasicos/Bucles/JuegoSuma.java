package Bucles;

import java.util.Scanner;

import javax.management.openmbean.OpenDataException;

public class JuegoSuma {
    /*
     * Programa que genera 2 numero aleatorioas (1 a 100) y pide al usuario que indique su suma
     * 
     * Le indica al usuario si la suma ha sido correcta y le pregunta si quiere jugar otra vez
     */

     public static void main(String[] args) {
        
        Scanner sc =   new Scanner(System.in);

        boolean seguir = true;
        do 
        {
            int numero1 = (int)(Math.random()*100 + 1);
            int numero2 = (int)(Math.random()*100 + 1);

            System.out.println("Dime el resultado de " + numero1 + " + " + numero2);
            int resultadoUsuario = sc.nextInt();
            if (resultadoUsuario == numero1+numero2)
            {
                System.out.println("Muy bien");
            }
            else
            {
                System.out.println("ERROR es " + (numero1+numero2));
            }

            System.out.println("Quieres probar otra vez?? (s/otro para terminar)");
            sc.nextLine();
            String opcion = sc.nextLine();
            seguir = opcion.equals("s");
            
        } while (seguir);

        System.out.println("Hasta otra!!");
     }
    
}
