package ArraysT5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer7Arrays {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[] arrayNumeros = new int[100];

        generarAleatorios(arrayNumeros);

        imprimirArray(arrayNumeros);

        //leer numero a modificar (numeroBuscado) y el nuevo numero (numeroNuevo)
        System.out.println("¿que numero desea modificar?...");
        int numeroBuscado = sc.nextInt();

        System.out.println("¿cual será el número nuevo?...");
        int numeroNuevo = sc.nextInt();
        

        //Modficar array
        boolean[] posicionesModificadas = modificarArray(arrayNumeros, numeroBuscado, numeroNuevo);

        //System.out.println(Arrays.toString(posicionesModificadas));

        imprimirArray(arrayNumeros, numeroNuevo, posicionesModificadas);

    }

    static void generarAleatorios(int[] array)
    {
        for (int i = 0; i < array.length; i++) 
        {
            int aleatorio = (int)(Math.random()*21);
            array[i] = aleatorio;
        }
    }

    static void imprimirArray(int[] array)
    {
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i] + " ");    
        }
    }

    static void imprimirArray(int[] array, int valorEspecial, boolean[] posiciones)
    {
        for (int i = 0; i < array.length; i++) 
        {
            if(array[i] == valorEspecial && posiciones[i] == true )
            {
                System.out.print("\"" + array[i] + "\" ");    
            }
            else
            {
                System.out.print(array[i] + " ");    
            }
        }
    }

    static boolean[] modificarArray(int[] array, int buscado, int nuevo)
    {
        boolean[] posicionesModificadas = new boolean[100];

        for (int i = 0; i < array.length; i++) 
        {
            if(array[i] == buscado)
            {
                array[i] = nuevo;
                posicionesModificadas[i] = true;
            }    
        }

        return posicionesModificadas;
    }
}
