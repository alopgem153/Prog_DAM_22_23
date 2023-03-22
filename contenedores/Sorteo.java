package contenedores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Sorteo<T> {

    //Atributos de Clase
    private HashSet<T> bolsa;

    //Constructor de la clase
    public Sorteo()
    {
        bolsa = new HashSet<T>();
    }

    public boolean add(T elemento)
    {
        return bolsa.add(elemento);
    }


    public Set<T> premiados(int numPremiados)
    {
        ArrayList<T> premiados = new ArrayList<T>();

        //Para conseguir los premiados voy a ordenar el arraylist 
        //y luego lo desordenare con shufle, los premiados serán los x primeros del arraylist
        premiados.addAll(this.bolsa);
        //Con Shuffle desordeno la lista
        Collections.shuffle(premiados);

        

        Set<T> bolsaPremiados = new HashSet<T>();
        for (int index = 0; index < numPremiados; index++) 
        {
            T elemento = premiados.get(index);
            bolsaPremiados.add(elemento);
            
        }

        return bolsaPremiados;

    }



    
}
