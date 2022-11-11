package Bucles;

import java.util.Scanner;

public class TablasMultiplicar {
    public static void main(String[] args) {
        
/*         Scanner sc = new Scanner(System.in);

        System.out.println("De que número quieres la tabla de multiplicar");
        int numero = sc.nextInt();
 */

        for(int numero = 1; numero <= 10; numero++)
        {
            System.out.println("TABLA del "+ numero);

            for(int aux = 0; aux <= 10; aux++)
            {
                System.out.println(aux+"*"+numero+"="+(aux*numero));
            }
 
        }
    }
}
