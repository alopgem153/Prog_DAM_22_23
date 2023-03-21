package contenedores;

import java.util.Arrays;

public class Contenedor<T extends Comparable<T> > {

    private T[] tabla;

    public Contenedor(T[] array)
    {
        //tabla = new T[0]; //NO SE PUEDE con los genéricos

        tabla = array;
    }

    public void insertarAlPrincipio(T nuevo)
    {
        T [] nuevoArray = Arrays.copyOf(tabla, tabla.length + 1);

        // for (int i = 1; i < nuevoArray.length; i++) {
        //     nuevoArray [i]= tabla[i-1]; 
        // }
        System.arraycopy(tabla, 0, nuevoArray, 1, tabla.length);

        nuevoArray[0] = nuevo;

        tabla = nuevoArray;
    }

    public void insertarAlFinal(T nuevo)
    {
        T [] nuevoArray = Arrays.copyOf(tabla, tabla.length + 1);
        nuevoArray[nuevoArray.length-1] = nuevo;

        tabla = nuevoArray;

    }

    public T extrsuperaerDelPrincipio()
    {
        T element = tabla[0];

        T [] newTabla = Arrays.copyOfRange(tabla, 1, tabla.length);

        tabla = newTabla;

        return element;
    }

    public T extraerDelFinal()
    {
        T aux = tabla[tabla.length-1];

        T[] copiaTabla = Arrays.copyOf(tabla, tabla.length-1);

        tabla = copiaTabla;

        return aux;
    }

    @Override
    public String toString() {
        
        return Arrays.toString(tabla); // [ , , , , ]
    }

    public void ordenar()
    {
        Arrays.sort(tabla);
    }


    
}
