package contenedores.ejer8y9;

import java.util.ArrayList;
import java.util.Collection;

public class Carta implements Comparable<Carta> {

    public enum Palo {BASTOS, COPAS, ESPADAS, ORO};

    //private String[] arrayValoresCarta  = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
    //Cambio el array de valores de carta por un enumerado porque el enumerado me respeta el orden que tienen los valores dentro del el 
    // y en el array el oden me lo da el tipo del array en este caso String por lo que el cinco de basto me lo ponía antes que el dos de bastos
    public enum ValorCarta {as, dos, tres, cuatro, cinco, seis, siete, sota, caballo, rey };

    private ValorCarta numero;
    private Palo palo;

    public Carta()
    {
        this.numero = ValorCarta.values()[(int)(Math.random()*ValorCarta.values().length)];  //arrayValoresCarta[(int)(Math.random()*arrayValoresCarta.length)];
        
        Palo[] palos =Palo.values();

        
        //this.palo = palos[(int)(Math.random()*palos.length)];

        int random =(int)(Math.random()*Palo.values().length);
        this.palo = Palo.values()[random];
    }

    public Carta(Palo palo, ValorCarta valor)
    {
        this.palo = palo;
        this.numero = valor;
    }

    public ValorCarta getNumero() {
        return numero;
    }

    public void setNumero(ValorCarta numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public boolean equals(Object obj) {
        Carta carta = (Carta)obj;
        return this.numero.equals(carta.getNumero()) &&  (this.palo == carta.getPalo());
    }

    @Override
    public String toString() {
        return this.numero + " de " + this.palo;
    }

    @Override
    public int compareTo(Carta o) {
        if (this.palo.equals(o.palo))
        {
            return this.numero.compareTo(o.getNumero());
        }
        else {
            return this.palo.compareTo(o.getPalo()); 
        }
    }


    public Collection<Carta> crearBaraja()
    {
        Collection<Carta> baraja = new ArrayList<>();

        for (Palo palo : Palo.values()) 
        {
            for (ValorCarta valor : ValorCarta.values()) {
                Carta nuevaCarta = new Carta(palo, valor);
            }
        }

        return baraja;
    }

    
    
}
