package ArraysT5;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploArraySimpleNumerico {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Se debe crear una array de numero de 10 posiciones y 
        //tendré que mostrar un menu con acciones que se deben realizar con el array

        int[] numeros = new int[10];
        int[] copiaNumeros = null;

        boolean salir = false;
        do
        {
            int opcion = menu();

            switch (opcion)
            {
                case 1:
                    limpiarArray(numeros);
                    break;
                case 2:
                    sc.nextLine(); //limpio buffer
                    System.out.println("¿Que número desea insertar?");
                    int numero = sc.nextInt();
                    System.out.println("¿en que posicion?");
                    int posicion = sc.nextInt();
                    insertar(numeros, numero, posicion);
                    break;
                case 3:
                    imprimir(numeros);
                    break;
                case 4:
                    borrar(numeros);
                    break;
                case 5:
                    llenar(numeros);
                    break;
                case 6:
                    llenarConAleatorios(numeros);
                    break;
                case 7:
                    int posicionBusqueda = buscar(numeros);
                    System.out.println("EL numero está en la posición: "+ posicionBusqueda);
                    break;
                case 8:
                    ordenar(numeros);
                    break;
                case 9:
                    posicionBusqueda = buscarEnTablaOrdenada(numeros);
                    System.out.println("EL numero está en la posición: "+ posicionBusqueda);
                    break;
                case 10:
                    desordenarTabla(numeros);
                    break;
                case 0:
                    salir = true;
                    sc.close();
                    break;
                case 11:
                    copiaNumeros = copiarArray(numeros);
                    imprimir(copiaNumeros);
                    break;
                case 12:
                    imprimir(copiaNumeros);
                    break;
                case 13:
                    numeros = insertarArrayCompleto(numeros);
                    break;
                case 14: 
                    numeros = eliminarUltimoArrayCompleto(numeros);
                    break;
                case 15:
                    numeros = insertarEnPosicionArrayCompleto(numeros);
                    break;
                default:
                    System.out.println("Opción no Valida");
                    break;

            }

        }while(!salir);
    }


    static int menu()
    {
        System.out.println("---------");
        System.out.println("1- Limpiar Array");
        System.out.println("2- Almacenar nuevo número");
        System.out.println("3- Imprimir Array");
        System.out.println("4- Borrar Elemento");
        System.out.println("5- Llenar con valores fijos (10) ");

        System.out.println("6- Llenar con valores aleatorios");
        System.out.println("7- Buscar un valor- devuelve la posición en la que esta -1 si no está");
        System.out.println("8- Ordenar");
        System.out.println("9- Busqueda en tabla ordenada");
        System.out.println("10- Desordenar");
        System.out.println("11- Copiar en CopiaNumero");
        System.out.println("12- Imprimir CopiaNumero");
        System.out.println("____________________________");
        System.out.println("13- Insertar al final en array Completo (no ordenado)");
        System.out.println("14- Eliminar ultima posicion en Completo (no ordenado");
        System.out.println("15- Insertar en posicion de Array Completo(no ordenado)");
        System.out.println("0- Salir");

        System.out.println("____________________________");
        System.out.println("Indica una opción...");
        int opcion = sc.nextInt();

        return opcion;
    }

    /**
     * Borra todos los valores del array que se le pasa
     * @param tabla
     */
    static void limpiarArray(int[] tabla)
    {
        for(int i = 0; i< tabla.length; i++)
        {
            tabla[i] = 0;
        }
    }


    /**
     * Inserta en la tabla y en la posicicion indicada el nombre nuevo 
     * @param tabla
     * @param nuevoNombre
     * @param posicion
     */
    static void insertar(int[] tabla, int nuevoNumero, int posicion)
    {
        if(tabla.length>posicion && posicion >=0)
        {
            tabla[posicion] = nuevoNumero;
        }
        else
        {
            //La posicion que me indican no es posible
            System.out.println("Posicion no válida, debe indicar un numero entre 0 y " + (tabla.length-1));
        }
    }

    static void imprimir(int[] tabla)
    {
        // int indice = 0;
        // for (String nombre : tabla) {
        //     System.out.println(" [" + indice + "] -> " + nombre );
        //     indice++;
        // }

        System.out.println(Arrays.toString(tabla));
    }

    /**
     * Borra de un array una posición en concreto
     * @param tabla
     */
    static void borrar(int[] tabla)
    {
        System.out.println("¿Qué posición quieres borrar?...");
        int posicion  = sc.nextInt();

        
        if(tabla.length> posicion && posicion >=0)
        {
            tabla[posicion] = 0;
            System.out.println("numero borrado correctamente");
        }
        else
        {
            //hay error de posicion
            System.out.println("ERROR - posicion fuera de rango");
        }
    }

    /**
     * Lleno la tabla con valores fijos - el valor 10
     * @param tabla
     */
    static void llenar(int[] tabla)
    {
        // for (int i = 0; i < tabla.length; i++) {
        //     tabla [i] = "Posicion " + i;
        // }

        Arrays.fill(tabla, 10);

    }

    /**
     * Llena el array que se le pasa con valores aleatorios de 0 a 99
     * @param tabla
     */
    static void llenarConAleatorios(int[] tabla)
    {
        for(int aux = 0; aux<tabla.length; aux++)
        {
            int aleatorio = (int)(Math.random()*100);
            tabla[aux] = aleatorio;
        }
    }

    /**
     * Buscar un valor- devuelve la posición en la que esta -1 si no está
     * @param tabla
     * @return
     */
    static int buscar(int[] tabla)
    {
        int resultado = -1;

        System.out.println("¿Que valor quieres buscar?...");
        int numeroBuscado = sc.nextInt();

        int indiceBusqueda = 0;
        while(resultado == -1 &&  indiceBusqueda < tabla.length)
        {
            int numeroEnPosicion = tabla[indiceBusqueda];
            if (numeroBuscado == numeroEnPosicion)
            {
                //si lo he encontrado entoces el resultado es la 
                //posicion de busqueda en la que estoy
                resultado = indiceBusqueda;
            }
            indiceBusqueda++;
        }

        return  resultado;
    }

    static void ordenar(int[] tabla)
    {
        Arrays.sort(tabla);
    }

    static int buscarEnTablaOrdenada(int[] tabla)
    {
        System.out.println("¿Que valor quieres buscar?...");
        int valorBuscado = sc.nextInt();

        int resultado = Arrays.binarySearch(tabla, valorBuscado);

        return resultado;
    }

    /**
     * Desordena el array
     * @param tabla
     */
    static void desordenarTabla(int[] tabla)
    {
        //recorrer toda la tabla/array
        for(int aux = 0; aux< tabla.length; aux++)
        {
            //en cada posición genero un numero aleatorio de 0 a longitud-1
            int nuevaPosicion = (int)(Math.random()*(tabla.length));

            //intercambio la posicion aux por la posición nuevaPosicion
            int valorNuevaPosicion = tabla[nuevaPosicion];
            tabla[nuevaPosicion] = tabla[aux];
            tabla[aux] = valorNuevaPosicion;
        }
    }


    static int[] copiarArray(int[] original)
    {

        //Forma Manual

        // int[] copia = new int[original.length];

        // int indice = 0;
        // for (int i : original) {
        //     copia[indice] = i;
        //     indice++;
        // }

        // return copia;

        //Utilizado metodos de la clase Arrays
        int[] copia = Arrays.copyOf(original, original.length);
        return copia;

    }

    /**
     * Crea un nuevo array con una posición mas e inserta al final un nuevo valor
     * @param original
     * @return
     */
    static int[] insertarArrayCompleto(int[] original)
    {
        System.out.println("¿Que número quieres insertar?...");
        int nuevoNumero = sc.nextInt();

        //creo la copia del array original con una posición más
        int[] copia = Arrays.copyOf(original, original.length+1);

        //Inserto en la última posición del array copia el nuevo valor
        copia[copia.length-1] = nuevoNumero;

        return copia;
    }

    /**
     * Elimina del array el ultimo elemento y elimina esta posición
     * @param numeros
     * @return
     */
    static int[] eliminarUltimoArrayCompleto(int[] numeros)
    {
        if(numeros.length >0)
        {
            int[] copia = Arrays.copyOf(numeros, numeros.length-1);
            return copia;
        }
        else
        {
            System.out.println("El array está vacio");
            return numeros;

        }
        
    }


    static int[] insertarEnPosicionArrayCompleto(int[] original)
    {
        //Este mismo algoritmo lo teneis en los apuntes utilizando el metodo Arrays.arrayCopy

        System.out.println("¿que nuevo valor quieres insertar?...");
        int nuevoNumero = sc.nextInt();
        System.out.println("¿en que posición?...");
        int posicionInsercion = sc.nextInt();

        //necesito un array de longitud +1 que el original
        int[] copia = new int[original.length+1];
        //recorro todo el array original yvoy copiando sus valores 
        int indiceCopia = 0;
        for(int aux = 0; aux< original.length; aux++)
        {
            //hasta llegar a la posicion en la que quiero insertar el nuevo valor
            if(aux != posicionInsercion)
            {
                copia[indiceCopia] = original[aux];
                indiceCopia++;
            }
            else //estoy en la posicion de copia
            {
                //copio el nuevo valor en el nuevo array
                copia[indiceCopia] = nuevoNumero;
                indiceCopia++;
                //y copio el el valor que estaba en esa posición 
                //en una posicion mas adelantada
                copia[indiceCopia] = original[aux];
                indiceCopia++;
            }

            //inserto en nuevo valor
            //sigo insertando los valores antiguos en el nuevo
        }

        return copia;

        

    }


}
