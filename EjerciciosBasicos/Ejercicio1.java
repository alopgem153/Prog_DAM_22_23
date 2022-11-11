

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        
        System.out.println("Dime un numero decimal");
        float decimal = sc.nextFloat();
        //Cuando leo un float no termina de ller el buffer de teclado
        //completamente y tengo que limpiarlo haciendo un nextLine
        sc.nextLine();

        System.out.println("Dime un a fecha (HH:MM)");
        String fecha = sc.nextLine();

        System.out.println("El numero es" + decimal + " la fecha es "+ fecha );

    }
}
