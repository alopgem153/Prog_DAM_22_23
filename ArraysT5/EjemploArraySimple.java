package ArraysT5;

import java.util.Scanner;

public class EjemploArraySimple {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Se debe crear una array de nombres de 10 posiciones y 
        //tendré que mostrar un menu con acciones que se deben realizar con el array

        String[] nombres = new String[10];

        boolean salir = false;
        do
        {
            int opcion = menu();

            switch (opcion)
            {
                case 1:
                    limpiarArray(nombres);
                    break;
                case 2:
                    sc.nextLine(); //limpio buffer
                    System.out.println("¿Que nombre desea insertar?");
                    String nombre = sc.nextLine();
                    System.out.println("¿en que posicion?");
                    int posicion = sc.nextInt();
                    insertar(nombres, nombre, posicion);
                    break;
                case 3:
                    imprimir(nombres);
                    break;
                case 4:
                    borrar(nombres);
                    break;
                case 5:
                    llenar(nombres);
                    break;
                case 6:
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
        System.out.println("2- Almacenar nuevo nombre");
        System.out.println("3- Imprimir Array");
        System.out.println("4- Borrar Elemento");
        System.out.println("5- Llenar con valores fijos");
        System.out.println("6- Salir");

        System.out.println("____________________________");
        System.out.println("Indica una opción...");
        int opcion = sc.nextInt();

        return opcion;
    }

    /**
     * Borra todos los valores del array que se le pasa
     * @param tabla
     */
    static void limpiarArray(String[] tabla)
    {
        for(int i = 0; i< tabla.length; i++)
        {
            tabla[i] = null;
        }
    }


    /**
     * Inserta en la tabla y en la posicicion indicada el nombre nuevo 
     * @param tabla
     * @param nuevoNombre
     * @param posicion
     */
    static void insertar(String[] tabla, String nuevoNombre, int posicion)
    {
        if(tabla.length>posicion && posicion >=0)
        {
            tabla[posicion] = nuevoNombre;
        }
        else
        {
            //La posicion que me indican no es posible
            System.out.println("Posicion no válida, debe indicar un numero entre 0 y " + (tabla.length-1));
        }
    }

    static void imprimir(String[] tabla)
    {
        int indice = 0;
        for (String nombre : tabla) {
            System.out.println(" [" + indice + "] -> " + nombre );
            indice++;
        }
    }

    /**
     * Borra de un array una posición en concreto
     * @param tabla
     */
    static void borrar(String[] tabla)
    {
        System.out.println("¿Qué posición quieres borrar?...");
        int posicion  = sc.nextInt();

        
        if(tabla.length> posicion && posicion >=0)
        {
            tabla[posicion] = null;
            System.out.println("Nombre borrado correctamente");
        }
        else
        {
            //hay error de posicion
            System.out.println("ERROR - posicion fuera de rango");
        }
    }

    /**
     * Lleno la tabla con valores fijos
     * @param tabla
     */
    static void llenar(String[] tabla)
    {
        for (int i = 0; i < tabla.length; i++) {
            tabla [i] = "Posicion " + i;
        }
    }



}
