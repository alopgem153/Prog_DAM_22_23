import java.util.Scanner;

public class EjercicioStringBasicos6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String cadena = "En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite";
        
        System.out.println("Introduce el nombre de alguien y te digo si estaba en casa");
        String nombreBuscado = sc.nextLine();
/*
        int posicionEncontrada = cadena.indexOf(nombreBuscado);

        System.out.println((posicionEncontrada >= 0) ? nombreBuscado + " Se encuentra en la casa"
                                        : nombreBuscado + " No estaba en la casa");
*/
        String cadenaMinusculas = cadena.toLowerCase();
        String nombreBuscadoMinusculas = nombreBuscado.toLowerCase();                                

        int posicionEncontrada = cadenaMinusculas.indexOf(nombreBuscadoMinusculas);

        System.out.println((posicionEncontrada >= 0) ? nombreBuscado + " Se encuentra en la casa"
                                        : nombreBuscado + " No estaba en la casa");


        sc.close();
    }
}
