package ArraysT5;

import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class RelacionandoArrays {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        String[] nombres = new String[0];
        int[] edades = new int[0];

        boolean salir = false;
        do
        {
            System.out.println("a) Añadir alumno");
            System.out.println("b) Mostrar todos los alumnos");
            System.out.println("c) Mostrar alumno con mayor edad");
            System.out.println("X) Salir");

            String opcion = sc.nextLine().toLowerCase();

            switch (opcion) {
                case "a":
                    nombres = insertarNombre(nombres);
                    edades = insertarEdades(edades);
                    
                    break;
                case "b":
                    mostrarInformacion(nombres, edades);
                    break;

                case "c":
                    mostrarAlumnoMasEdad(nombres, edades);
                    break;

                case "x":
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }

        }while(!salir);
    }

    static String[] insertarNombre(String[] nombres)
    {
        System.out.println("Dime el nuevo nombre...");
        String nuevoNombre = sc.nextLine();

        //creo el nuevo array con una posicion más
        String[] nuevoArray = new String[nombres.length+1];

        //Copio el array original en el array nuevo
        for (int i = 0; i < nombres.length; i++) 
        {
            nuevoArray[i] = nombres[i];    
        }

        //en la ultima posición del nuevo inserto el nuevo nombre
        nuevoArray[nuevoArray.length-1] = nuevoNombre;

        return nuevoArray;
    }

    static int[] insertarEdades(int[] arrayAntiguio)
    {
        System.out.println("Dime su edad...");
        int nuevEdad = sc.nextInt();

        int[] nuevoArray = UtilesArrayAlfonso.insertarAlFinal(arrayAntiguio, nuevEdad);
        //limpiar buffer
        sc.nextLine();

        return nuevoArray;
    }

    static void mostrarInformacion(String[] nombres, int[] edades)
    {
        if (nombres.length == edades.length)
        {
            for (int i = 0; i < nombres.length; i++) 
            {
                System.out.print(nombres[i] + "\t - " + edades[i]);
                System.out.println();
            }
        }
        else
        {
            System.out.println("Error en los datos, diferente numero de nombres y de edades");
        }
    }

    static void mostrarAlumnoMasEdad(String[] nombres, int[] edades)
    {
        int edad = 0;
        int posicion = -1;

        for (int i = 0; i < edades.length; i++) 
        {
            if (edades[i] > edad)
            {
                edad = edades[i];
                posicion = i;
            }    
        }

        if (posicion > -1) //existe alguna edadas
        {
            System.out.println(nombres[posicion] + " - " + edades[posicion]);
        }
        else
        {
            System.out.println("No hay elementos");
        }
    }
}
