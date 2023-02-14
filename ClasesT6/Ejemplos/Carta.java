package ClasesT6.Ejemplos;

public class Carta {
    
    public enum Palo {ORO, COPA, ESPADA, BASTO};

    //Atributos
    private Palo palo;
    private int numero;

    //Constrcutor
    public Carta(Palo palo, int numero)
    {
        this.palo = palo;
        this.numero = numero;
    }
    //Metodos

    /**
     * Devuelve true si la carta que hace la invocacion es menor 
     * a la que se le pasa por parametros
     * @param c
     * @return
     */
    public boolean esMenor(Carta c)
    {
        boolean resultado = false;

        if (this.numero < c.getNumero())
        {
            resultado = true;
        }

        return resultado;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public  String toString()
    {
        return this.numero + " de " + this.palo.toString();
    }

    
    
}
