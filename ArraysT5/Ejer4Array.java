package ArraysT5;

import java.util.Arrays;

public class Ejer4Array {
    
    public static void main(String[] args) {
        
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        rellenarConAleatorios(numero);

        System.out.println(Arrays.toString(numero));

        //rellenarConElCuadrado(numero, cuadrado);
        rellenarConExponente(numero, cuadrado, 2);
        //rellenarConElCubo(numero, cubo);
        rellenarConExponente(numero, cubo, 3);


        imprimir(numero, cuadrado, cubo);

    }

    static void rellenarConAleatorios(int[] array)
    {
        for (int i = 0; i < array.length; i++) 
        {
            int aleatorio = (int)(Math.random()*101);
            array[i] = aleatorio;
        }
    }

    static void rellenarConElCuadrado(int[] arrayOrigen, int[] arrayDestino)
    {
        for (int i = 0; i < arrayDestino.length; i++) 
        {
            int valor = arrayOrigen[i];
            int nuevoValor = (int)Math.pow(valor, 2);
            arrayDestino[i] = nuevoValor;    
        }
    }

    static void rellenarConElCubo(int[] arrayOrigen, int[] arrayDestino)
    {
        for (int i = 0; i < arrayDestino.length; i++) 
        {
            int valor = arrayOrigen[i];
            int nuevoValor = (int)Math.pow(valor, 3);
            arrayDestino[i] = nuevoValor;    
        }
    }

    static void rellenarConExponente(int[] arrayOrigen, int[] arrayDestino, int exponente)
    {
        for (int i = 0; i < arrayDestino.length; i++) 
        {
            int valor = arrayOrigen[i];
            int nuevoValor = (int)Math.pow(valor, exponente);
            arrayDestino[i] = nuevoValor;    
        }
    }

    static void imprimir(int[] array1, int[] array2, int[] array3)
    {
        for (int i = 0; i < array2.length; i++) 
        {
            System.out.println(array1[i] + "\t" + array2[i]+ "\t" + array3[i]);    
        }
    }
}
