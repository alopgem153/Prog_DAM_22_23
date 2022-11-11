package Bucles;

import java.util.Scanner;

public class Ejer7Bucles {
    
    public static void main(String[] args) {
        
        /*
         * Realiza el control de acceso a una caja fuerte. La combinación será un
            número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
    acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
    y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
    Tendremos cuatro oportunidades para abrir la caja fuerte.
         */
        int clave = 1234;
        int intento = 4;
        boolean encontrada = false;

        Scanner sc = new Scanner(System.in);

         do
         {
            System.out.println("Introduce la convinacion de  la caja fuerte");
            System.out.println("Tienes "+ intento + " intentos");
            int numero = sc.nextInt();

            if (clave == numero)
            {
                encontrada = true;
            }
            else {
                intento--;
            }

         }while(!encontrada && intento > 0);

         if (encontrada)
         {
            System.out.println("BIEN HECHO");
         }
         else
         {
            System.out.println("Te quedaste con las ganas");
         }

         sc.close();


         for (int intet = 1; intet <= 4 && encontrada; intet++)
         {
            /*
            if (clave == intento)
            {
                intet = 5;
            }
            */
            if (!encontrada)
            {
                System.out.println("Dime la clave, te quedan "+ (4-intet) + " intentos" );
            }

         }

    }
}
