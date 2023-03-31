package contenedores;

import java.util.ArrayList;
import java.util.HashMap;

import contenedores.ejer8y9.Carta;
import contenedores.ejer8y9.Carta.ValorCarta;

public class Ejer12 {

    public static void main(String[] args) {
        HashMap<ValorCarta, Integer> valores = new HashMap<>();

        valores.put(ValorCarta.as, 11);
        valores.put(ValorCarta.tres, 10);
        valores.put(ValorCarta.sota, 2);
        valores.put(ValorCarta.caballo, 3);
        valores.put(ValorCarta.rey, 4);

        ArrayList<Carta> cartasRepartidas = new ArrayList<>();

        for (int i = 0; i < 5; i++) 
        {
            Carta cartaNueva = new Carta();
            cartasRepartidas.add(cartaNueva);   
        }

        System.out.println(" Cartas ---> " + cartasRepartidas);

        System.out.println("--- PUNTOS ---");
        Integer totalPuntos = 0;
        for (Carta carta : cartasRepartidas) 
        {
            if (valores.containsKey(carta.getNumero()))
            {
                System.out.println(carta +" - vale: " + valores.get(carta.getNumero()));
                totalPuntos += valores.get(carta.getNumero());
            }
        }
        System.out.println("-----------------------");
        System.out.println("Total de puntos: " + totalPuntos);
    }
    
}
