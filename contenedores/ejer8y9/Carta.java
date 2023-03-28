package contenedores.ejer8y9;

public class Carta implements Comparable<Carta> {

    public enum Palo {BASTOS, COPAS, ESPADAS, ORO};

    private String[] arrayValoresCarta  = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};

    private String numero;
    private Palo palo;

    public Carta()
    {
        this.numero = arrayValoresCarta[(int)(Math.random()*arrayValoresCarta.length)];
        
        Palo[] palos =Palo.values();

        
        //this.palo = palos[(int)(Math.random()*palos.length)];

        int random =(int)(Math.random()*Palo.values().length);
        this.palo = Palo.values()[random];
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
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
        return this.numero.equalsIgnoreCase(carta.getNumero()) &&  (this.palo == carta.getPalo());
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

    
    
}
