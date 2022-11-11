import java.util.Scanner;

public class CaracteresEspeciales {
    public static void main(String[] args) {
        //Pregunto por la base de la factura
        System.out.println("Introduzca su nombre");

        Scanner sc = new Scanner(System.in);

        String nombre =sc.nextLine();
        System.out.println("Introduzca su edad");

        int edad = sc.nextInt();

        System.out.println("Su nombre es \""+ nombre + "\" \n tu edad es \'" + edad + "\'");

        System.out.println();  //sout

    }
}
