package Bucles;

import java.util.Scanner;

public class FrasesPalindromas {

    public static void main(String[] args) {
        
        /*
         * Crea un programa que lea frases y nos indique si dicha frase es un palindromo 
         * (se lee igual de izquierda a derecha que de derecha a izquierda) .
         *  Ten en cuenta que los espacios no se tienen en cuenta.
         *  El programa debe de pedir frases hasta que el usuario escriba "SALIR"
         */
        Scanner sc = new Scanner(System.in);

        String frase = "";

         do
         {
            System.out.println("Dime la frase para que yo vea si es palíndroma...(SALIR para terminar)");
            frase = sc.nextLine();

            //Quito los espacios en blanco de la frase
            frase = frase.replace(" ", "");

            //opcion 1 Comparando inicio y final 
            int apuntadorInicio = 0;
            int apuntadorFinal = frase.length()-1;

            boolean esPalindromoOpcion1 = true;

            while(apuntadorInicio <= apuntadorFinal)
            {
                if (frase.charAt(apuntadorInicio) != frase.charAt(apuntadorFinal))
                {
                    esPalindromoOpcion1 = false;
                }
                apuntadorInicio++;
                apuntadorFinal--;
            }

            if (esPalindromoOpcion1)
            {
                System.out.println("SON PALINDROMAS");
            }
            else
            {
                System.out.println(" NO lo Son");
            }

            System.out.println();

            System.out.println("\n----------------------------------------------------------- \n");
            //opcion 2 dandole la vuelta a la frase y comparando


            String fraseInvertida = "";
            for(int apuntador = frase.length()-1; apuntador >= 0; apuntador--)
            {
                char caracterApuntado = frase.charAt(apuntador);
                fraseInvertida = fraseInvertida + caracterApuntado;
            }

            boolean esPalindromo = frase.equals(fraseInvertida);

            if (esPalindromo)
            {
                System.out.println("SON PALINDROMAS");
            }
            else
            {
                System.out.println(" NO lo Son");
            }

            System.out.println();

         } while (!frase.toUpperCase().equals("SALIR"));
    }
    
}
