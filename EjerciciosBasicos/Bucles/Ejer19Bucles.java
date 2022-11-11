package Bucles;

public class Ejer19Bucles {
    public static void main(String[] args) {
        /*
        Realiza un programa que pinte una pirámide por pantalla. La altura se debe
        pedir por teclado. El carácter con el que se pinta la pirámide también se debe
        pedir por teclado.

        Altura 4

           *
          ***
         *****    
        ******* 

         */

        int alturaPiramide = 4;

         for(int altura = 1; altura<= alturaPiramide; altura++)
         {
            //Creamos los espacios que hay en cada fila
            for(int numeroEspacios = 0; numeroEspacios<alturaPiramide-altura; numeroEspacios++)
            {
                System.out.print("_");
            }

            //Creo la parte izquierda de la piramide
            for(int aux=0; aux<altura; aux++)
            {
                System.out.print("*");
            }

            //Creo la parte derecha de la piramide
            for(int aux = 1; aux<altura; aux++)
            {
                System.out.print("M");
            }


            System.out.println("");
            
         }


    }
}
