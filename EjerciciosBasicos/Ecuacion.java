import java.util.Scanner;

public class Ecuacion {
    public static void main(String[] args) {
        /*
         * Dada la siguiente función:     y = ax2 + bx + c
         * Crea un programa que pida los coeficientes a, b y c, 
         * así como el valor de x y calcule el valor resultante de y.
         */
        float coefA;
        float coefB, coefC;

        Scanner puerta = new Scanner(System.in);

        System.out.println("Coeficente a?");
        coefA = puerta.nextFloat();

        System.out.println("Coeficente b?");
        coefB = puerta.nextFloat();

        System.out.println("Coeficente c?");
        coefC = puerta.nextFloat();

        System.out.println("Coeficente X?");
        float coefX = puerta.nextFloat();

        puerta.close();

        float resultado = (coefA * (coefX * coefX)) + coefB * coefX + coefC;

        System.out.println("\n\tResultado= " + resultado);
        

    }
}
