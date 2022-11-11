package Bucles;

import java.util.Scanner;

public class Pedir10Numeros {
    public static void main(String[] args) {
        
        final int NUMERO_REPETICIONES = 10;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce " + NUMERO_REPETICIONES + " números");

        int sumaTotal = 0;

        for(int aux = 1; aux <= NUMERO_REPETICIONES; aux++)
        {
            System.out.println("Introduce el numero "+ aux);
            int numero = sc.nextInt();
            sumaTotal += numero;

        }

        System.out.println("Suma total: "+ sumaTotal);
        System.out.println("Media: " +  sumaTotal/NUMERO_REPETICIONES);
    }
}
