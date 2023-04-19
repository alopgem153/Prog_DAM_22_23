package contenedores.ejer17;

import java.util.ArrayList;
import java.util.HashSet;

public class Carrito {

    HashSet<Elemento> bolsacompra;
    //ArrayList<Elemento> bolsacompra;

    public Carrito()
    {
        bolsacompra = new HashSet<>();
        //bolsacompra = new ArrayList<>();
    }

    public void agrega(Elemento elemento)
    {
        //Si no está ya en la bolsa lo agrego 
        if (!bolsacompra.contains(elemento))
        {
            bolsacompra.add(elemento);
        }
        else 
        {
            //Si ya está en la bolsa -> modifico la cantidad
            for (Elemento elem : bolsacompra) 
            {
                if (elem.equals(elemento))
                {
                    elem.setCantidad(elem.getCantidad() + elemento.getCantidad());
                }    
            }
        }
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
