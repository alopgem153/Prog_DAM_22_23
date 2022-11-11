import java.util.Scanner;

public class MayoriaEdad {
    public static void main(String[] args) {
        
        final int MAYORIA_EDAD = 18;

        System.out.println("Introduce tu edad");

        Scanner sc = new Scanner(System.in);

        int edad = sc.nextInt();

        boolean esMayorEdad = (edad >= MAYORIA_EDAD);

        System.out.println("¿eL USUARIO ES mayor de edad? " + esMayorEdad);

        sc.close();
    }
}
