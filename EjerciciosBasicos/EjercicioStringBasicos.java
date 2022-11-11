import java.util.Scanner;

public class EjercicioStringBasicos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto y te digo su longitud");
        String cadena = sc.nextLine();

        System.out.println("La cadena tiene una longitud de: " + cadena.length() + " dígitos");

        sc.close();
    }
}
