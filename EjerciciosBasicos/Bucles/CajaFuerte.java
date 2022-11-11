package Bucles;

import java.util.Scanner;

public class CajaFuerte {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contrasena = 1842;
        int intentosRestantes = 4;
        Boolean contrasenaCorrecta = false;

        do {
            System.out.println("Introduce la contraseña:");
            int userInput = sc.nextInt();
            intentosRestantes--;
            if (userInput != contrasena) {
                System.out.println("ERROR - Contraseña equivocada intentalo otra vez. Intentos restantes - " + intentosRestantes);
            } else if (userInput == contrasena) {
                contrasenaCorrecta = true;
                System.out.println("Bienvenido!");
            }
            
        } while (contrasenaCorrecta == false && intentosRestantes > 0);
        sc.close();
    }
}
