package contenedores;

import java.util.HashMap;
import java.util.Scanner;

public class ExistenciasRepuestos {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        

        //Estructura donde voy a guardar el código alfanumerioco de la pieza 
        //y el número de existencias
        HashMap<String, Integer> existencias = new HashMap<>();
        boolean salir = false;
        do 
        {
            //Muestro el menu
            int opcion = menu();

            //Segun opcion llamo al metodo que sea
            switch(opcion)
            {
                case 1:
                    System.out.println("Indique el codigo del nuevo producto");
                    String codigoProducto = sc.nextLine();
                    insertarProducto(existencias, codigoProducto);
                    // if (!existencias.containsKey(codigoProducto))
                    // {
                    //     existencias.put(codigoProducto, 0);
                    // }
                    // else {
                    //     System.out.println("Producto ya insertado");
                    // }
                    break;

                case 2:
                
                    System.out.println("Indique el codigo del producto a borrar");
                    codigoProducto = sc.nextLine();
                    borrarProducto(existencias, codigoProducto);
                    // if (existencias.containsKey(codigoProducto))
                    // {
                    //     existencias.remove(codigoProducto);
                    // }
                    // else {
                    //     System.out.println("Producto con código " + codigoProducto + " no encontrado");
                    // }
                    break;

                

                case 3:
                    System.out.println("Indique el codigo del producto al que desea cambiar el stock");
                    codigoProducto = sc.nextLine();
                    if (existencias.containsKey(codigoProducto))
                    {
                        System.out.println("Indique la nueva cantidad");
                        int nuevaCantidad = sc.nextInt();
                        existencias.put(codigoProducto, nuevaCantidad);
                    }
                    else {
                        System.out.println("Producto " + codigoProducto + " no existe");
                    }
                    break;

                case 4:
                    System.out.println(existencias);

                    break;

                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("opcion NO valida");
                    break;
            }

        }while (!salir);

    }

    //Metodo imprimir menú 
    public static int menu()
    {
        int opcion = -1;
        System.out.println("---- Tienda de repuestos ----");
        System.out.println("1- Insertar producto");
        System.out.println("2- Eliminar producto");
        System.out.println("3- Cambiar stock producto");
        System.out.println("4- Mostrar productos");
        System.out.println("0- Salir");

        opcion = sc.nextInt();
        sc.nextLine(); //limpio buffer

        return opcion;
    }

    //Método insertar producto
    public static void insertarProducto(HashMap<String, Integer> existencias, String codigo)
    {
        if (!existencias.containsKey(codigo))
        {
            existencias.put(codigo, 0);
        }
        else {
            System.out.println("Producto ya insertado");
        }
    }


    //Método eliminar producto
    public static void borrarProducto(HashMap<String, Integer> existencias, String codigo)
    {
         if (existencias.containsKey(codigo))
        {
            existencias.remove(codigo);
        }
        else {
            System.out.println("Producto con código " + codigo + " no encontrado");
        }
    }
    //Método cambiar stock


    //Método imprimir existencias de cada referencia (producto)


    
}
