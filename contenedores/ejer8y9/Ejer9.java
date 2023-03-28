package contenedores.ejer8y9;

import java.util.ArrayList;
import java.util.Collections;

public class Ejer9 {

    /*
     * Realiza un programa que escoja al azar 10 cartas de la baraja española
        (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
        almacenarlas y asegúrate de que no se repite ninguna.
     */

     public static void main(String[] args) {
        
        ArrayList<Carta> cartas = new ArrayList<>();

        while(cartas.size()<10)
        {
            Carta nuevaCarta = new Carta();
            if (!cartas.contains(nuevaCarta))
            {
                cartas.add(nuevaCarta);
            }
        }
        System.out.println(cartas);
        Collections.sort(cartas);
        System.out.println(cartas);
     }
    
}
