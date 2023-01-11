package ArraysT5;

import java.util.Arrays;

public class Ejer11Arrays {
        public static void main(String[] args) {
            int[] numeros = new int[10];

            rellenarArray(numeros);
            System.out.println(Arrays.toString(numeros));
            System.out.println("------------------------");
            int[] primos = buscarPrimos(numeros);
            int[] noPrimos = buscarNoPrimos(numeros);

            System.out.println(Arrays.toString(primos));
            System.out.println(Arrays.toString(noPrimos));
            numeros =concatenarArrays(primos, noPrimos);

            System.out.println(Arrays.toString(numeros));

        }

        static int[] concatenarArrays(int[] array1, int[] array2)
        {

            int[] resultado = UtilesArrayAlfonso.concatenarArrays(array1, array2);
            return resultado;
        }

        static void rellenarArray(int[] array)
        {
            for (int i = 0; i < array.length; i++) 
            {
                int aleatorio = (int)(Math.random()*14);
                array[i] = aleatorio;
            }
        }

        static int[] buscarPrimos(int[] array)
        {
            int[] primos = new int[0];

            for (int i = 0; i < array.length; i++) 
            {
                int numero = array[i];
                if (Funciones.MathAlfonso.esPrimo(numero))
                {
                    primos = UtilesArrayAlfonso.insertarAlFinal(primos, numero);
                }    
            }

            return primos;
        }

        static int[] buscarNoPrimos(int[] array)
        {
            int[] noPrimos = new int[0];

            for (int i = 0; i < array.length; i++) 
            {
                int numero = array[i];
                if (!Funciones.MathAlfonso.esPrimo(numero))
                {
                    noPrimos = UtilesArrayAlfonso.insertarAlFinal(noPrimos, numero);
                }    
            }

            return noPrimos;
        }
}
