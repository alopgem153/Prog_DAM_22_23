package MatematicasBasicas;

import java.util.Scanner;

public class Matematicas2 {
    /*
     * Realiza un programa que realice el 
     * exponencial de un número por otro número. 
     * Ambos números deben ser introducidos 
     * por teclado.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculo de potencial:");
        System.out.println("Dime la base");    
        int base = sc.nextInt();

        System.out.println("Dime el exponente");    
        int exponente = sc.nextInt();
        sc.close();

        double resultado = Math.pow(base, exponente);
        System.out.println("El resultado es: " + resultado);
    }
    


}
