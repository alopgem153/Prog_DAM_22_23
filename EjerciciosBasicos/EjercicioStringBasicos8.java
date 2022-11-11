import java.util.Scanner;

public class EjercicioStringBasicos8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Introduce el caracter que quieras");
        char caracter = sc.nextLine().charAt(0);

        int codigoCaracter = (int)caracter;

        boolean esDigito = codigoCaracter >= 48 && codigoCaracter <= 57;

        boolean esUnEspacio = (codigoCaracter == 32);

        boolean esMayuscula = codigoCaracter >= 65 && codigoCaracter <= 90;

        System.out.println((esDigito) ? "Es un digito": "No es un digito");
        System.out.println((esUnEspacio) ? "Es un espacio": "No es un espacio");
        System.out.println((esMayuscula) ? "Esta en mayuscula": "No esta en mayuscula");

        

        sc.close();
    }
}
