package Bucles;

import java.util.Scanner;

public class EjemploWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una letra (s para terminar)");
        String condicion = sc.nextLine();

        while (!condicion.equals("s"))
        {
            System.out.println("Has escrito: " + condicion);

            System.out.println("Introduzca otra letra (s para terminar)");
            condicion = sc.nextLine();

        }
    }
    
}
