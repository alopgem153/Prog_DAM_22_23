package Funciones;

import java.util.Scanner;

public class MenuFuncionesBasicas {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        do 
        {
            System.out.println(" --- FUNCIONES ---");
            System.out.println("A- Capicua");
            System.out.println("B- Es primo");

            String opcion = sc.nextLine();

            int operador1;

            switch(opcion)
            {
                case "A":
                    System.out.println("Dime un numero");
                    operador1 = sc.nextInt();
                    boolean esCapicua = MathAlfonso.esCapicua(operador1);
                    if (esCapicua)
                    { 
                        System.out.println("El numero SI es capicuo");
                    }
                    else 
                    {
                        System.out.println("El numero NO es capucuo");
                    }
                    break;
                case "B":
                    System.out.println("Dime un numero");
                    operador1 = sc.nextInt();
                    boolean esPrimo = MathAlfonso.esPrimo(operador1);
                    break;
                case "C":
                    MathAlfonso.posicionDeDigito(563654657, 7);
            }

        }  while (!salir);
    }
}
