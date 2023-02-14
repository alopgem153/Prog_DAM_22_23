package ClasesT6.Usos;

import java.util.Arrays;
import java.util.Scanner;

import ClasesT6.Ejemplos.Carta;
import ClasesT6.Ejemplos.Carta.Palo;

/*
 * Vamos a similar una pila (Stack) para apilar cartas y jugar a ver cuantas
 * veces puedo sacar una carta mayor o igual a la anterior
 * 
 * Debo de generar la baraja -> barajar y empezar a jugar
 * 
 * Al terminar preguntar si se quiere jugar otra vez
 */

public class JuegoCartas {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean finPrograma = false;
        do
        {
            //crear baraja
            Carta[] baraja = new Carta[0];

            for (Palo palo : Palo.values()) 
            {
                for (int i = 1; i <= 12; i++) 
                {
                    Carta cartaNueva = new Carta(palo, i);

                    baraja = push(baraja, cartaNueva);
                }    
            }

            //System.out.println(Arrays.toString(baraja));

            //Barajar
            barajar(baraja);
            System.out.println(Arrays.toString(baraja));

            //jugar
            boolean fin = false;

            Carta cartaSacada1 = baraja[baraja.length-1];
            baraja = pop(baraja);
            System.out.println(cartaSacada1);

            while(!fin && baraja.length>0)
            {
                //sacar carta y comparar
                Carta cartaSacada2 = baraja[baraja.length-1];
                baraja = pop(baraja);
                System.out.println(cartaSacada2);

                if (cartaSacada2.esMenor(cartaSacada1))
                {
                    fin = true;
                    System.out.println("La carta sacada es menor -> Fin del juego");
                }
                else
                {
                    cartaSacada1 = cartaSacada2;
                }
            }

            System.out.println("¿Quiere jugar otra vez? (0 para salir)");
            int opcion = sc.nextInt();
            if (opcion == 0)
            {
                finPrograma = true;
            }

        } while (!finPrograma);



        
    }

    /**
     * Pongo en la baraja una carta nueva arriba del todo del mazo de cartas
     * @param barajaOriginal
     * @param cartaNueva
     * @return
     */
    public static Carta[] push(Carta[] barajaOriginal, Carta cartaNueva)
    {
        Carta[] barajaNueva = new Carta[barajaOriginal.length+1];

        for (int i = 0; i < barajaOriginal.length; i++) 
        {
            barajaNueva[i] = barajaOriginal[i];    
        }

        barajaNueva[barajaNueva.length-1] = cartaNueva;

        return barajaNueva;
    }


    /**
     * Las cartas de deben de barajar 
     * ( recorriendo cada una de las cartas e intercambiando su posición con otra carta del mazo al azar)

     * @param baraja
     */
    public static void barajar(Carta[] baraja)
    {        
        for (int i = 0; i < baraja.length; i++) 
        {
            Carta cartaACambiar =  baraja[i];
            
            int posicionNueva = (int)(Math.random()*baraja.length-1)+1;

            //Intercambio las cartas
            Carta cartaAuxiliar = baraja[posicionNueva];
            baraja[posicionNueva] = cartaACambiar;
            baraja[i] = cartaAuxiliar;
        }
    }

    public static Carta[] pop(Carta[] baraja)
    {
        Carta[] barajaNueva = new Carta[baraja.length-1];

        for (int i = 0; i < barajaNueva.length; i++) 
        {
            barajaNueva[i] = baraja[i];
        }

        return barajaNueva;
    }
    
}
