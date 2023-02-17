package ClasesT6.Usos;

import java.util.Arrays;
import java.util.Scanner;

import ClasesT6.Ejemplos.Baraja;
import ClasesT6.Ejemplos.Carta;

/**
 * Nueva implementación del juego de cartas que simila una pila pero esta vez
 * utilizamos la clase carta y la clase Baraja
 */
public class JuegoCartas2 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        boolean finPrograma = false;
        do
        {
            //crear baraja
            Baraja baraja = new Baraja();

             //Barajar
             baraja.barajar();
             
             System.out.println(Arrays.toString(baraja.getMazo()));

             //jugar
            boolean fin = false;

            Carta cartaSacada1 = baraja.pop();
            
            System.out.println(cartaSacada1);

            while(!fin && baraja.getMazo().length>0) //mientras NoFin y haya cartas voy sacando
            {
                //sacar carta y comparar
                Carta cartaSacada2 = baraja.pop();
               
                System.out.println(cartaSacada2);

                if (cartaSacada2.esMenor(cartaSacada1)) //si la segunda es menor entonces fin de juego
                {
                    fin = true;
                    System.out.println("La carta sacada es menor -> Fin del juego");
                }
                else
                {
                    //la carta 2 es mayor por lo que la guardo en la cartasacada1 y vuelvo a sacar una carta
                    cartaSacada1 = cartaSacada2;
                }
            }  //end while

            System.out.println("¿Quiere jugar otra vez? (0 para salir)");
            int opcion = sc.nextInt();
            if (opcion == 0)
            {
                finPrograma = true;
            }

        }while(!finPrograma);

        sc.close();
    }
    
}
