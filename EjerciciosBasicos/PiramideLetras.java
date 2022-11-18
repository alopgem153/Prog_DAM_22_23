import java.util.Scanner;

public class PiramideLetras {

    public static void main(String[] args) {
         /*
          * Crea un programa que pida una altura para una pirámide 
            y cree una pirámide de letras de esta forma:
            Altura= 4

            A
            AB
            ABC
            ABCD

            Ten en cuenta que el máximo de altura que puedes introducir es 25

          */

          Scanner sc = new Scanner(System.in);

          System.out.println("Dime la altura de la pirámide...");
          int altura = sc.nextInt();
          //Limpio buffer
          sc.nextLine();
          System.out.println("Dime el caracter inicial");
          char caracterInicial = sc.nextLine().toUpperCase().charAt(0);

          //char caracterInicial = 'A';
          //Creo la pirámide
          
          //pinto la fila
          for(int alturaActual = 1; alturaActual <= altura; alturaActual++)
          {

            System.out.print("Altura: " +alturaActual + "  ");

            //pinto los caracteres que van dentro de la fila
            for(int caracterFila = 0; caracterFila < alturaActual; caracterFila++)
            {
                //System.out.print(caracterFila);
                //char nuevoCaracter = (char)((int)caracterInicial + caracterFila);

                //Para que la piramide sea ciclica y cuando llegue a Z siga con la A
                //Tengo que hacer el modulo de 25 (numero de caracteres del alfabeto) y 
                //sumar 65 que es el valor de A
                int codigoCaracterInial = (int)caracterInicial + caracterFila;
                int numero = codigoCaracterInial - 65;
                int posicionnumero = numero % 25;
                int nuevoCodigo = posicionnumero + 65;
                char nuevoCaracter = (char)nuevoCodigo;
                // int codigoAsciiCaracter = (((int)caracterInicial + caracterFila) % 25) + 65;
                // char nuevoCaracter = (char)codigoAsciiCaracter;
                 System.out.print(nuevoCaracter);
            }

            System.out.println();
          }


          
    }
    
}
