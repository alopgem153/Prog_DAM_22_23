package interfaces.negocio_ejemplo;

import java.util.Comparator;

public class ClienteComparatorEdad implements Comparator<Cliente> {

    // public ClienteComparatorEdad()
    // {}

    @Override
    public int compare(Cliente c1, Cliente c2) {
        
        // Cliente c1 = (Cliente)arg0;
        // Cliente c2 = (Cliente)arg1;

        //comparamos por la edad
        return c1.getEdad()-c2.getEdad();


    }
    
}
