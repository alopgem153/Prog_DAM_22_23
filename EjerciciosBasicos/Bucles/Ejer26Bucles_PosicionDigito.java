package Bucles;

import java.nio.channels.AlreadyBoundException;

public class Ejer26Bucles_PosicionDigito {
    
    public static void main(String[] args) {
        /*
         * Realiza un programa que pida primero un número y a continuación un dígito.
            El programa nos debe dar la posición (o posiciones) contando de izquierda a
            derecha que ocupa ese dígito en el número introducido.
         */

        System.out.print("Introduzca un número entero: ");

        int numeroIntroducido = Integer.parseInt(System.console().readLine());
        int numero = numeroIntroducido;

        System.out.println("Dime un número del 0 al 9 para buscarlo en el número anterior");
        int digitoBuscado = Integer.parseInt(System.console().readLine());
        int alReves = 0;

        while (numero > 0) {
            alReves = (alReves * 10) + (numero % 10);
            numero /= 10;
        } // while

        String apariciones = "";
        int posicionActual = 1;
        while(alReves > 0)
        {
            if (alReves % 10 == digitoBuscado)
            {
                apariciones += posicionActual + ", ";
            }

            alReves /= 10; // alReves = alReves / 10
            posicionActual++;
        }

        System.out.println("El dígito "+ digitoBuscado + " está en el numero: "+ numeroIntroducido + " en la(s) posicion(es) "+ apariciones);
    }
}
