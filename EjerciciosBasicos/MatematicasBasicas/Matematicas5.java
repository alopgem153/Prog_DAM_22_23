package MatematicasBasicas;

import java.util.Scanner;

public class Matematicas5 {
    /*
     * Vamos a realizar un programa que pregunte por un número de segundos y nos diga en que minuto estamos.
Por ejemplo: 50 segundos -> minuto 1
                     130 segundos -> minuto 3

     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el número de segundos");
        int segundos=sc.nextInt();
        sc.close();
        System.out.println("Han pasado "+(int) Math.ceil((float) segundos/60)+" minutos aproximadamente");
    }
}
