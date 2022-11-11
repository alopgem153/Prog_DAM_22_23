import java.util.Scanner;

public class EjercicioStringBasicos7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Introduce el caracter que quieras");
        char caracter = sc.nextLine().charAt(0);

        boolean esDigito = Character.isDigit(caracter);

        boolean esUnEspacio = Character.isSpaceChar(caracter);

        boolean esMayuscula = Character.isUpperCase(caracter);

        System.out.println((esDigito) ? "Es un digito": "No es un digito");
        System.out.println((esUnEspacio) ? "Es un espacio": "No es un espacio");
        System.out.println((esMayuscula) ? "Esta en mayuscula": "No esta en mayuscula");

        

        sc.close();
    }
}
