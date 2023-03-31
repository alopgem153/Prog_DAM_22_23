package contenedores.ejer17;

import java.util.HashSet;

public class Carrito {

    HashSet<Elemento> bolsacompra;

    public Carrito()
    {
        bolsacompra = new HashSet<>();
    }

    public void agrega(Elemento elemento)
    {
        bolsacompra.add(elemento);
    }

    public int numeroDeElementos()
    {
        return bolsacompra.size();
    }

    public double importeTotal()
    {
        double total = 0;

        for (Elemento elemento : bolsacompra) 
        {
            total += elemento.getPrecio()* elemento.getCantidad();    
        }

        return total;
    }


    @Override
    public String toString() {
        String cadena = "";
        for (Elemento elemento : bolsacompra) {
            cadena += elemento + "\n";
        }

        return cadena;
    }



}
