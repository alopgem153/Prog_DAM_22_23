package Bucles;

import java.util.Scanner;

public class MostrarNumeros {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hasta que numero quieres que imprima??");
        int numero = sc.nextInt();

        System.out.println("De cuanto es el incremento?");
        int incremento = sc.nextInt();


        
        for(int aux = 0; aux<= numero; aux += incremento)
        {
            System.out.println(aux);
        }
    }
}
