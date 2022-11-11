import java.util.Scanner;

public class EjercicioStringBasicos9 {
    public static void main(String[] args) {
        
        final String frase = "En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite";

        Scanner sc = new Scanner(System.in);

        
        System.out.println("¿Quien más estaba en la casa");
        String nuevaPersona = sc.nextLine();

        nuevaPersona = ", " + nuevaPersona;

        sc.close();

        int posicionInsercion = frase.indexOf("y");

        //Hay 2 opciones
        //Usando StringBuffer
        StringBuffer sBuffer = new StringBuffer(frase);

        sBuffer.insert(posicionInsercion-1, nuevaPersona);

        System.out.println(sBuffer);

        //usando String
        String primeraParte = frase.substring(0, posicionInsercion-1);
        String segundaParte = frase.substring(posicionInsercion-1);

        String fraseNueva = primeraParte + nuevaPersona + segundaParte;

        System.out.println(fraseNueva);


    }
}
