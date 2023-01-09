package ArraysT5;

import java.util.Arrays;

public class UtilesArrayAlfonso {
    

    static int[] limpiar()
    {
        int[] array = new int[0];
        //int[] array = null;

        return array;
    }

    
    static int[] rellenar(int[]   array, int numeroElementos) //llena el array con el numero de elementos  indicados, valor de estos numeros será 0   
    {
        // int[] nuevo = new int[numeroElementos];
        // Arrays.fill(nuevo, 0);
        // return nuevo;
        return rellenar(array, numeroElementos, 0);
    }
    static int[] rellenar(int[] array, int numeroElementos, int valor) //llena el array con el numero de elementos indicados conel valor indicado
    {
        int[] nuevo = new int[numeroElementos];
        Arrays.fill(nuevo, valor);
        return nuevo;
    }

    static int[] insertarAlFinal(int[] array, int elemento)
    {
        
        int[] nuevo = Arrays.copyOf(array, array.length+1);
        nuevo[nuevo.length-1] = elemento;

        return nuevo;
    }
    
    static int[] insertarAlPrincipio(int[] array, int elemento)
    {
        int[] nuevo = new int[array.length+1];
        nuevo[0] = elemento;

        int indiceInsercion = 1;
        for(int aux = 0; aux < array.length ; aux++)
        {
            //nuevo[aux+1] = array[aux];
            nuevo[indiceInsercion] = array[aux];
            indiceInsercion++;
        }

        return nuevo;
    }
    static int[] insertarEnPosicion(int[] array, int elemento, int posicion)
    {
        //Controlo posibles errores en la posición de inserción
        if(posicion <0 || posicion > array.length)
        {
            System.out.println("ERROR - Posicion no valida");

            return array;
        }
        else
        {
            // int[] nuevo = new int[array.length+1];

            // //Copia hasta la posicion de inserción
            // for(int aux = 0; aux<posicion; aux++)
            // {
            //     nuevo[aux] = array[aux];
            // }
            // nuevo[posicion] = elemento;

            // for(int aux = posicion; aux < array.length; aux++)
            // {
            //     nuevo[aux+1]= array[aux];
            // }

            // return nuevo;

            //Otra opcion utilizando Arraycopy
            int[] nuevo = new int[array.length+1];
            System.arraycopy(array, 0, nuevo, 0, posicion);
            nuevo[posicion] = elemento;
            System.arraycopy(array, posicion, nuevo, posicion+1, array.length-posicion);
            return nuevo;
        }

    }
    
    
    static int[] insertarOrdenado(int[] array, int elemento)
    {
        //Presupongo que el array que nos pasan está ordenado

        //Buscamos la posición de insercion
        int posicionInsercion = 0;

        boolean encontrado = false;
        while(posicionInsercion<= array.length && !encontrado)
        {
            if (array[posicionInsercion] < elemento)
            {
                posicionInsercion++;
            }
            else
            {
                //La posicion que estoy leyendo es en la que quiero insertar
                encontrado = true;
            }
        }

        return insertarEnPosicion(array, elemento, posicionInsercion);
    }
    
    
    static int[] eliminarUltimo(int[] array)
    {
        return Arrays.copyOfRange(array, 0, array.length-1);
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(args));

        int[] array = {1,2,3,4,5};

        array =eliminarPrimero(array);

        System.out.println(Arrays.toString(array));

    }

    static int[] eliminarPrimero(int[] array)
    {
        return Arrays.copyOfRange(array, 1, array.length);
    }

    /**
     * Eliminamos el elemento del array
     * @param array
     * @param elemento
     */
    static int[] eliminar(int[] array, int elemento)
    {
        //Buscar si este elemento está en el array
        int posicionElemento = buscar(array, elemento);

        //Si esta elimino esa posicion del array
        if (posicionElemento >= 0)
        {
            array = eliminarPosicion(array, posicionElemento );
        }
        return array;
        
    }

    static int[] eliminarPosicion(int[] array, int posicion)
    {
        int[] nuevo = new int[array.length-1];
        
        //Copiamos en el nuevo array de 0 a la posición de borrado
        //Argumentos de arrayCopy:
        //  arg1: array original
        //  arg2: posicion desde la que empiezo a leer enel array original
        //  arg3: array destino
        //  arg4: posicion desde la que voy a insertar en el array destino
        //  arg5: el numero de elementos que voy a copiar del origen al destino
        System.arraycopy(array, 0, nuevo, 0, posicion);

        //Copiamos en el nuevo array de  la posicion de borrado+1 al final
        System.arraycopy(array, posicion+1, nuevo, posicion, array.length-posicion-1);

        return nuevo;
    }

    static int[] ordenar(int[] array)
    {
        Arrays.sort(array);

        return array;
    }
    // desordenar(int[]  array);

    /**
     * Invierte el array
     * @param array
     * @return
     */
    static int[] invertir(int[] array)
    {
        int[] invertido = new int[array.length];

        for(int aux = 0; aux < array.length; aux++)
        {
            invertido[aux] = array[array.length-1-aux];
        }

        //Otra forma sin crear otro array
        for(int aux = 0; aux< array.length/2; aux++)
        {
            int numero = array[aux];
            array[aux] = array[array.length-1-aux];
            array[array.length-1-aux] = numero; 
        }

        return invertido;

    }
    static void imprimir(int[]  array)
    {
        System.out.println(Arrays.toString(array));
    }
    
    /**
     * Devuelve true si el array está ordenado
     * @param array
     * @return
     */
    static boolean estaOrdenado( int[] array) //devuelve true si el array está ordendo, false en  caso contrario
    {
        boolean ordenado = true;

        int[] copia = Arrays.copyOf(array, array.length);

        copia = ordenar(copia);

        return sonIguales(array, copia);
    }
    
    /**
     * devuelve -1 si el elemento NO está en el array 
     * y en caso de estar DEVUELVE la posición en la que está 
     * @param array
     * @param elemento
     * @return
     */
    static int buscar(int[] array, int elemento) 
    {
        int posicionElemento = -1;

        int indice = 0;
        boolean encontrado = false;
        while(indice < array.length && !encontrado)
        {
            if(array[indice] == elemento)
            {
                encontrado = true;
                posicionElemento = indice;
            }
            else
            {
                indice++;
            }
        }

        return posicionElemento;

    }
    
    static int[] partirPor(int[]   array, int posicionInicial, int posicionCorte) // devuelve el array  resultante de partir el array original entre la posicionInical y la  posicionFinal (incluidas las 2)
    {
        if(posicionInicial< posicionCorte && posicionInicial < array.length-1)
        {
            //creo el nuevo array que tiene de tamaño la posicion final - poscion inicial +1 (para incluirlo)
            int[] nuevo = new int[posicionCorte-posicionInicial+1];

            int indiceNuevo = 0;
            for(int aux = posicionInicial; aux <= posicionCorte; aux++)
            {
                nuevo[indiceNuevo] = array[aux];
                indiceNuevo++;
            }

            return nuevo;

        }
        else
        {
            return array;
        }
    }
    
    static boolean sonIguales(int[]  array1, int[] array2)
    {

        if(array1.length == array2.length)
        {
            int indice = 0;
            boolean iguales = true;
            while(indice < array1.length && iguales)
            {
                if (array1[indice] != array2[indice])
                {
                    iguales = false;
                }
                else
                {
                    indice++;
                }
            }

            return iguales;
        }
        else
        {
            return false;
        }
    }
    // elementosIguales(int[]array1,  int[] array2, int posicionAComparar) //devuelve true si el elemento
    //    en ambos arrays son iguales

   
}
