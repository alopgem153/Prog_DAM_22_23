import java.util.Scanner;

public class NotaFinal {
    public static void main(String[] args) {
        /*
         * Realiza un programa que calcule la nota que hace falta sacar 
         * en el segundo
            examen de la asignatura Programación para obtener 
            la media deseada. Hay
            que tener en cuenta que la nota del primer examen 
            cuenta el 40% y la del segundo examen un 60%.

         */

         final float PONDERACION_NOTA1 = 0.4F;
         final float PONDERACION_NOTA2 = 0.6F;

         Scanner sc = new Scanner(System.in);

         System.out.println("Nota del primer examen?");
         float nota1 = sc.nextFloat();

         System.out.println("Que nota quieres conseguir en el trimestre?");
         float notaFinal = sc.nextFloat();

         float nota2 = (notaFinal - (nota1 * PONDERACION_NOTA1)) / PONDERACION_NOTA2;

         System.out.println("Debes sacar " + nota2 + " para conseguir un "+ notaFinal);




         


    }
}
