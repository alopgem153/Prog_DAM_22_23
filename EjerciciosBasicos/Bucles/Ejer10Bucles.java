package Bucles;
import java.util.Scanner;

public class Ejer10Bucles {

    public static void main(String[] args) {
        /*
         * Escribe un programa que calcule la media de un conjunto de números positivos
            introducidos por teclado. A priori, el programa no sabe cuántos números se
            introducirán. El usuario indicará que ha terminado de introducir los datos
            cuando meta un número negativo.
        */

            
        Scanner sc = new Scanner(System.in);
        
        int num;
        int suma = 0;
        int contador = 0;

         do{
            System.out.println("Introduce un numero positivo, introduce un numero negativo para salir");
            num = sc.nextInt();
            
            if (num>0)
            {
                suma +=num;
                contador++;
            }
         }while(num  >=0);

         float media = suma/(float)contador;
         System.out.println("La media es: " + media);

         sc.close();
    }
    
}
