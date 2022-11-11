import java.util.Scanner;

public class EjercicioStringBasicos3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto");
        String cadena = sc.nextLine();

        System.out.println("Dime una posición por el cual partir la cadena:");
        int posicion = sc.nextInt();

        boolean noSobrepasa = (posicion <= cadena.length()) ? true : false;


        String parteIzquierda = (noSobrepasa) ? cadena.substring(0, posicion): "";
        String parteDerecha = (noSobrepasa) ? cadena.substring(posicion, cadena.length()): "";

        System.out.println((noSobrepasa) ? "Parte Izquierda = "+ parteIzquierda : "FUERA DE RANGO");
        System.out.println((noSobrepasa)? "Parte Derecha = "+ parteDerecha : "");

        sc.close();
    }
}
