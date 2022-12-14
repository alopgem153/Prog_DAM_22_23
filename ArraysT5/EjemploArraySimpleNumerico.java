package ArraysT5;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploArraySimpleNumerico {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Se debe crear una array de numero de 10 posiciones y 
        //tendré que mostrar un menu con acciones que se deben realizar con el array

        int[] numeros = new int[10];

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
                case 0:
                    salir = true;
                    sc.close();
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

    }

}
