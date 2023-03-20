package contenedores;

import java.util.Arrays;

public class Contenedor<T> {

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

    public T extraerDelPrincipio()
    {

    }

    public T extraerDelFinal()
    {

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public void ordenar()
    {
        
    }


    
}
