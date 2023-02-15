package ClasesT6.Ejemplos;

import ClasesT6.Ejemplos.Carta.Palo;

/*
 * Clase que simula una baraja de cartas apiladas (como si fuera una pila)
 */

public class Baraja {

    //Atributos
    Carta[] mazo;

    //Constructor
    public Baraja()
    {
        this.mazo = new Carta[0];
        //Crea un mazo de cartas española
        //de los 4 palos y del 1 al 12
        for (Palo palo : Palo.values()) 
        {
            for (int i = 1; i <= 12; i++) 
            {
                Carta cartaNueva = new Carta(palo, i);
                
                push(cartaNueva);
            }    
        }

    }


    public void push(Carta cartaNueva)
    {
        Carta[] barajaNueva = new Carta[this.mazo.length+1];

        for (int i = 0; i < mazo.length; i++) 
        {
            barajaNueva[i] = mazo[i];    
        }

        barajaNueva[barajaNueva.length-1] = cartaNueva;
        this.mazo = barajaNueva;
    }

    public Carta pop()
    {
        Carta[] barajaNueva = new Carta[this.mazo.length-1];

        for (int i = 0; i < barajaNueva.length; i++) 
        {
            barajaNueva[i] = this.mazo[i];
        }

        Carta carta = this.mazo[this.mazo.length-1];
        this.mazo = barajaNueva;

        return carta;

    }

    /**
     * Las cartas de deben de barajar 
     * ( recorriendo cada una de las cartas e intercambiando su posición con otra carta del mazo al azar)

     * @param baraja
     */
    public void barajar()
    {        
        for (int i = 0; i < this.mazo.length; i++) 
        {
            Carta cartaACambiar =  this.mazo[i];
            
            int posicionNueva = (int)(Math.random()*this.mazo.length-1)+1;

            //Intercambio las cartas
            Carta cartaAuxiliar = this.mazo[posicionNueva];
            this.mazo[posicionNueva] = cartaACambiar;
            this.mazo[i] = cartaAuxiliar;
        }
    }


    public Carta[] getMazo() {
        return mazo;
    }

    

    
}
