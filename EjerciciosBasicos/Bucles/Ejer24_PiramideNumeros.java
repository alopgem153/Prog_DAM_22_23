package Bucles;

public class Ejer24_PiramideNumeros {
    
    /**
* Escribe un programa que lea un número N e imprima una pirámide de números con N filas como
* en la siguiente figura:

*   1
*  121
* 12321
*1234321

*/ 

    public static void main(String[] args) 
    {
        System.out.println("Este programa pinta una pirámide hecha a base de números.");
        System.out.print("Por favor, introduzca la altura de la pirámide:");
        int alturaIntroducida = Integer.parseInt(System.console().readLine());
        int altura = 1;
        int i = 0;
        int espacios = alturaIntroducida - 1;
    
        while (altura <= alturaIntroducida) {
            // inserta espacios
            for (i = 1; i <= espacios; i++) 
            {
                System.out.print(" ");
            }
            // pinta la línea de números hasta la mitad
            for (i = 1; i < altura; i++) 
            {
                System.out.print(i);
            }
            //pinta la linea de numeros de la mitad +1 al final
            for (i = altura; i > 0; i--) 
            {
                System.out.print(i);
            }
            
            System.out.println();
            altura++;
            espacios--;

        } // while
    }
}
