import java.net.SocketImpl;
import java.util.Scanner;

public class EjercicioStringBasicos2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto y te digo su longitud");
        String cadena = sc.nextLine();

        System.out.println("Dime una posición:");
        int posicion = sc.nextInt();

        boolean noSobrepasa = (posicion <= cadena.length()-1) ? true : false;

        System.out.println((noSobrepasa)? cadena.charAt(posicion) : " Posición fuera de Rango");

        sc.close();
    }
}
