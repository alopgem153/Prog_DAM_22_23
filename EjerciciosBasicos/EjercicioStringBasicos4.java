import java.util.Scanner;

public class EjercicioStringBasicos4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String cadena = "Hola gente de Mijas";
        System.out.println("Cadena inicial: " + cadena);

        System.out.println("Introduce el caracter que quieres reemplazar");
        char caracterBuscado = sc.nextLine().charAt(0);

        System.out.println("Dime el nuevo caracter");
        char caracterDeReemplazo = sc.nextLine().charAt(0);

        cadena = cadena.replace(caracterBuscado, caracterDeReemplazo);

        System.out.println("Resultado del reemplazo: " + cadena);
        sc.close();
    }
}
