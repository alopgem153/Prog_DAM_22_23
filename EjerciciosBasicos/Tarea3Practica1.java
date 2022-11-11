public class Tarea3Practica1 {
    public static void main(String[] args) {
        /*
         *     Mostrar la información del libro sabiendo que aparece despues del simbolo '(' : "Libro: Cien años de soledad. G. García Márquez"
    Busca un número random entre 0 y el número total de caracters  y muestralo por pantalla. El caracter en la posicion X es:
    Trocea
    el texto en palabras y devuelve la palabra que esté en la posición que
    indique un número aleatorio entre 0 y el número de palabras. La palabra
    en la posición x es: XXXX
    Preguntar
    ¿Como se llamaba el coronel? y si responde su nombre o su apellido o
    ambos, sin tener en cuenta las mayúsculas/minúsculas) indicar que se ha
    acertado la pregunta.
         */

         String cadena = "Muchos años después, " +
                "frente al pelotón de fusilamiento, el coronel Aureliano Buendia había de "+
                "recordar aquella tarde remota en que su padre lo llevó a conocer el "+
                "hielo. (Cien años de soledad. G. García Márquez).";

        String[] informacion = cadena.split("\\(");
        String infomacionLibro = informacion[1];
        System.out.println("Autor: "+ infomacionLibro.replace(")", ""));
        
        int posicion = (int)( Math.random() * cadena.length());

        System.out.println("Caracter en la posición: " + posicion + " = " +  cadena.charAt(posicion));

    }
    
}
