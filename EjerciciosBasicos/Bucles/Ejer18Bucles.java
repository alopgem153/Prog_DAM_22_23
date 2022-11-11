package Bucles;

import java.util.Scanner;

public class Ejer18Bucles {
    
    public static void main(String[] args) {
        /*
         * Escribe un programa que obtenga los números enteros comprendidos entre dos
            números introducidos por teclado y validados como distintos, el programa debe
            empezar por el menor de los enteros introducidos e ir incrementando de 7 en
            7.
         */

        Scanner sc = new Scanner(System.in);
        
        boolean iguales = false;
        int numero1;
        int numero2;

        do
        {
            System.out.println("Dime un numero:");
            numero1 = sc.nextInt();

            System.out.println("Dime otr numero:");
            numero2 = sc.nextInt();

            if (numero1 == numero2)
            {
                iguales = true;
                System.out.println("No pueden ser iguales, vuelve a decir los numeros");
            }
            else
            {
                iguales = false;
            }
            

        } while (iguales);

        //Si el numero 1 es mayor al 2, 
        //cambiamos el orden para que el recorrido sea de menor a mayor
        if (numero1> numero2)
        {
            int  aux = numero1;
            numero1 = numero2;
            numero2 = aux;

        }

        for(int aux = numero1; aux <= numero2; aux +=7)
        {
            System.out.println(aux);  
        }
        
    }
}
