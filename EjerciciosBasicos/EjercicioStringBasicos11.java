import java.util.Scanner;

public class EjercicioStringBasicos11 {
    public static void main(String[] args) {
        
        /*
         * Realiza un programa que lea un dígito del 0 al 9 
         * y muestre por pantalla el carácter  que ocupa dicha posición
         *  en una cadena interna.
            Debes comprobar que se ha introducido un dígito, 
            que no estamos buscando en una posición más grande 
            que la longitud de la cadena y si estoy mostrando 
            un espacio entonces mostrar la cadena “ESPACIO”

         */

        final String frase= "Hoy es feria en Fuengirola";

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número del 0 al 9");
        char posicionChar = sc.nextLine().charAt(0);

        boolean esDigito = Character.isDigit(posicionChar);

        //int posicionInt = (int)posicionChar; //ERROR me devuleve el codigo ASCII del caracter leido
        //int posicionInt = Integer.valueOf(posicionChar+"");
        int posicionInt = Character.getNumericValue(posicionChar);
        System.out.println((esDigito)? "Posicion leida " + posicionInt : "ERROR - no es un digito" );

        boolean dentroLimites = (posicionInt >= 0 && posicionInt < frase.length());

        char caracterEnPosicion = (esDigito && dentroLimites) ? frase.charAt(posicionInt) : '-' ;
        
        boolean esEspacio = (esDigito && dentroLimites) ? Character.isSpaceChar(caracterEnPosicion) : false;

        

        String mensajeResultado = (esEspacio) ? "-ESPACIO-": caracterEnPosicion+"";

        String mensajeTotal = (esDigito && dentroLimites) ? "El digito en la posicion "+ posicionInt + " es " + mensajeResultado : "ERROR ";

        System.out.println(mensajeTotal);

        sc.close();
        
    }
}
