package MatematicasBasicas;

import java.util.Scanner;

public class Matematicas1 {
    //Realiza un programa que dado un número 
    //decimal escriba su valor absoluto.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero decimal (utiliza la , para separar la parte decimal de la entera");    
        float numeroDecimal = sc.nextFloat();
        sc.close();
        System.out.println("El valor absoluto es: " + Math.abs(numeroDecimal));
    }
    


}
