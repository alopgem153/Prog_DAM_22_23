package Bucles;

import java.util.Scanner;

public class Multiplos7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hasta que numero quieres que imprima??");
        int numero = sc.nextInt();


        System.out.flush();  
        
        for(int aux = 0; aux<= numero; aux += 7)
        {
            System.out.println(aux);
        }
    }
}
