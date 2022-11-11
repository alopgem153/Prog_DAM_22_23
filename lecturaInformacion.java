import java.util.Scanner;

public class lecturaInformacion {
    
    public static void main(String[] args ) {
        
        Scanner puertaLectura = new Scanner(System.in);
        
        System.out.println("Introduzca su nombre y pulse enter");

        String nombreUsuario = puertaLectura.nextLine();

        System.out.println("Nombre Introducido es:" + nombreUsuario);

        int edad = puertaLectura.nextInt();

        float altura = puertaLectura.nextFloat();

        "Tu nombre es Alfonso, tu estatura es 1,70 y tu edad es 89";

    }
}
