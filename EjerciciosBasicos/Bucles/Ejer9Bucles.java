package Bucles;

import java.util.Scanner;

public class Ejer9Bucles {
    
    /*
     * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).
     */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numero = 0;
        long numDigitos = 0;

        System.out.println("Digite un numero: ");
        numero = sc.nextLong();
/*
        sc.close();
        do {
            numero = numero / 10;
            numDigitos++;
        } while (numero>0);

        System.out.println("El numero introducido tiene " + numDigitos + " digitos");
    */

        /*Otra forma con While */
        numDigitos = 1;
        while (numero > 10)
        {
            numero = numero / 10;
            numDigitos++;

        }
        System.out.println("El numero introducido tiene " + numDigitos + " digitos");
    }
}
