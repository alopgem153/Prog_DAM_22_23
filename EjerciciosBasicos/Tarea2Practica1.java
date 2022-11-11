import java.util.Scanner;

public class Tarea2Practica1 {

    public static void main(String[] args) {
        
        /*
         * Vamos a simular un 1 contra 1 en baloncesto para ello necesitamos saber:

    Nombre del jugador atacante y del jugador defensor
    El % de acierto de 2  y de 3 del jugador atacante.
    El numero de veces que el jugador defensor logra hacer que su atacante falle (número de 0 a 10)
    Y si el jugador atacante decide tirar de 2 o de 3.



Para saber si mete canasta utilizaremos esta fórmula:

(numeroAlAzar * %AciertoTipoSeleccionado) > (numeroAlAzar * EficaciaDefensa * 10)

    Debes mostrar al finalizar el siguiente mensaje:



El jugador "XXXXXXX" ha encestado de 2 (xxx > yyyy)

El jugardor "XXXXXX" NO ha encestado  (xxxx< yyyyy)

         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Dime el nombre del atacante ");
         String atacante = sc.nextLine();
         
         System.out.println("Dime el nombre del defensor ");
         String defensor = sc.nextLine();

         System.out.println("Dime el % de 2");
         long porcentaje2 = sc.nextLong();

         System.out.println("Dime el % de 3");
         long porcentaje3 = sc.nextLong();

         System.out.println("Como defiende (0 a 10)");
         int porcentajeDefensa = sc.nextInt();

         System.out.println("tipo de jugada (2/3)");
         int tipoJugada = sc.nextInt();

         sc.close();

         long porcentajeTipo = (tipoJugada == 2) ? porcentaje2 : porcentaje3;

         double azarAtaque = Math.random();
         double azarDefensa = Math.random();

         //(numeroAlAzar * %AciertoTipoSeleccionado) > (numeroAlAzar * EficaciaDefensa * 10)
         double ataque = azarAtaque * porcentajeTipo;
         double defensa = azarDefensa * porcentajeDefensa * 10;

         System.out.println("Ataque: " + ataque);
         System.out.println("Defensa: " + defensa);

         String mensaje = ataque > defensa ? "Canasta" : "Tapón";
         System.out.println(mensaje);



         

    }
    
}
