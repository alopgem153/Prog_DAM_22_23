package interfaces.negocio_ejemplo;

import java.util.Comparator;

public class ClienteComparatorDineroMasAMenos implements Comparator<Cliente> {

    @Override
    public int compare(Cliente c1, Cliente c2) {
        
        //Devuelve primero el cliente con mas dinero
        // Cliente c1 = (Cliente)arg0;
        // Cliente c2 = (Cliente)arg1;

        //return  c1.getDinero()-c2.getDinero();

        int resultado = 0;

        if (c1.getDinero()>c2.getDinero())
        {
            resultado = 1;
        }
        else if (c1.getDinero() < c2.getDinero())
        {
            resultado = -1;
        }

        return resultado;
    }
    
}
