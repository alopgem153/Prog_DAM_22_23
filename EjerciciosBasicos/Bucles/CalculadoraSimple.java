package Bucles;

import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int operador1 = 0;
        int operador2 = 0;
        int resultado = 0;
        boolean salir = false;
        do 
        {
            System.out.println("=== CALCULADORA ===");
            System.out.println( "1- Suma");
            System.out.println( "2- Resta");
            System.out.println( "3- Multiplicación");
            System.out.println( "4- División");
            System.out.println( "0- Salir");
            System.out.println("");
            System.out.println("¿Que quieres hacer?...");

            int opcion = sc.nextInt();

            //Compruebo que la opcion es correcta para pedir los operadores
            if (opcion > 0 && opcion <= 4)
            {
                System.out.println("Dime el primer operador");
                operador1 = sc.nextInt();

                System.out.println("Dime el segundo operador");
                operador2 = sc.nextInt();
            }

            switch (opcion)
            {
                case 1:
                    
                    resultado = operador1 + operador2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    
                    resultado = operador1 + operador2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;

                case 3:

                    resultado = operador1 * operador2;
                    System.out.println("El resultado de la multiplicacion es: " + resultado);
                    break;

                case 4:

                    if (operador2 != 0)
                    {
                        resultado = operador1 / operador2;
                        System.out.println("El resultado de la multiplicacion es: " + resultado);
                    }
                    else
                    {
                        System.out.println("No se puede dividir por 0");
                    }
                    break;

                case 0:
                    //opcion para salir
                    salir = true;
                    break;

                default:
                    System.out.println("Opción incorrecta.../nIntroduzca una opción de las correctas");

            }

        } while (!salir);

        System.out.println("Hasta la proxima!");
        sc.close();
    }
}
