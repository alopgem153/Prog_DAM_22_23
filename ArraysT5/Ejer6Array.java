package ArraysT5;

import java.util.Arrays;

public class Ejer6Array {
    
    public static void main(String[] args) {
        
        int[] arrayNumero = new int[15];
        
        rellenarConAleatorios(arrayNumero);

        System.out.println(Arrays.toString(arrayNumero));

        rotar(arrayNumero);

        System.out.println(Arrays.toString(arrayNumero));

        rotarXveces(arrayNumero, 5);

        System.out.println(Arrays.toString(arrayNumero));

    }


    static void rellenarConAleatorios(int[] array)
    {
        for (int i = 0; i < array.length; i++) 
        {
            int aleatorio = (int)(Math.random()*101);
            array[i] = aleatorio;
        }
    }

    static void rotar(int[] array)
    {
        int[] copia = Arrays.copyOfRange(array, 0, array.length);

        for (int i = 0; i < array.length; i++) 
        {
            if (i < array.length-1)
            {
                array[i+1] = copia[i];    
            }
            else //el ultimo elemento pasa a la posicion 0
            {
                array[0] = copia[i];
            }
        }
    }

    static void rotarXveces(int[] array, int rotaciones)
    {
        for (int i = 0; i < rotaciones; i++) 
        {
            rotar(array);    
        }
    }

}
