package Bucles;

public class Ejer25_NumeroAlReves {


    public static void main(String[] args) {
        /*
        Realiza un programa que pida un número por teclado y que luego muestre ese
        número al revés.
        */   
        System.out.print("Introduzca un número entero: ");

        int numeroIntroducido = Integer.parseInt(System.console().readLine());
        int numero = numeroIntroducido;
        int alReves = 0;

        while (numero > 0) {
            alReves = (alReves * 10) + (numero % 10);
            numero /= 10;
        } // while
        
        System.out.println("Si le damos la vuelta al " + numeroIntroducido + " tenemos el " + alReves);

    }

}