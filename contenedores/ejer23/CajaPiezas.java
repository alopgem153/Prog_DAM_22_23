package contenedores.ejer23;

import java.util.ArrayList;
import java.util.Collections;

public class CajaPiezas {

    public enum Tipo { DAMA, TORRE, ALFIL, CABALLO, PEON};

    ArrayList<Tipo> piezas;

    public CajaPiezas()
    {
        piezas = new ArrayList<>();

        //Creo en piezas el total de piezas posibles.
        piezas.add(Tipo.DAMA);
        piezas.add(Tipo.TORRE);
        piezas.add(Tipo.TORRE);
        piezas.add(Tipo.ALFIL);
        piezas.add(Tipo.ALFIL);
        piezas.add(Tipo.CABALLO);
        piezas.add(Tipo.CABALLO);
        for (int index = 0; index < 8; index++) {
            piezas.add(Tipo.PEON);
        }
       

    }

    public ArrayList<Tipo> obtenerPiezasAleatorias(int cantidad)
    {
        Collections.shuffle(piezas);
        
    }

    
}
