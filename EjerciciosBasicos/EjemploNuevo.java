import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class EjemploNuevo {

    public static void main(String[] args) {
        

    /*
     * Leemos de teclado un caracter
     * Segun ese caracter se realizará una operación u otra
     * 
     * Si el caracter es 's' entoces suma 2 elementos que debe de pedir
     * al usuario
     * 
     * Si es otro entonces saca el caracter ascii de  los dos numeros
     * introducidos
     * 
     */

     Scanner sc = new Scanner(System.in);
     //leo la cadena y cojo el primer elemento

     char opcion = sc.next().charAt(0); 

     System.out.println("Dime un numero entre el 32 y el 127");
     int numero1 = sc.nextInt();

     System.out.println("Dime otr numero entre el 32 y el 127");
     int numero2 = sc.nextInt();
     
     
     System.out.println((opcion == 's') ? numero1 + numero2 : (char)numero1 + "- " + (char) numero2 );

    }
}
