package ArraysT5;

import java.util.Arrays;

public class Bidimensional2 {
    
    public static void main(String[] args) {
        /*
         * Programa que no sindica si una matriz 4x4 es una matriz MÁGICA 
         * Matriz Magica : todas las filas y columnas suma lo mismo.
         */
        final int FILA = 4;
        final int COLUMNA = 4;

        int[][] matriz = new int[FILA][COLUMNA];

        //rellenar la matriz
        rellenarMatriz(matriz);

        System.out.println(Arrays.deepToString(matriz));
        
        //comprobar si es magica
        boolean esMagica = comprobacionEsMagica(matriz);

        if(esMagica)
        {
            System.out.println("---- ES MAGICA!!! ------");
        }
        else
        {
            System.out.println( " NO es magica :( ");
        }

    }

    static void rellenarMatriz(int[][] arrayBid)
    {
        for (int i = 0; i < arrayBid.length; i++) 
        {
            int[] fila = arrayBid[i];
            for (int j = 0; j < fila.length; j++) 
            {
                int numAleatorio = 3 ; //(int)(Math.random()*10)+1; // aleatorio de 1 a 10
                fila[j] = numAleatorio;    
            }    
        }
    }

    static boolean comprobacionEsMagica(int[][] matriz)
    {
        boolean resultado = true;

        int sumatorioFila0 = 0;
        int[] fila0 = matriz[0];
        for (int i = 0; i < fila0.length; i++) 
        {
            sumatorioFila0 += fila0[i];
        }

        //Compruebo que todos los otros sumatorios valen lo mismo

        //Comprobando el sumatorio de la filas
        int sumaFila = 0;
        for (int fila = 1; fila < matriz.length; fila++) 
        {
            sumaFila = 0;
            int[] filaArray = matriz[fila];
            for (int columna = 0; columna < filaArray.length; columna++) 
            {
                sumaFila += filaArray[columna];    
            }    
            if (sumaFila != sumatorioFila0)
            {
                resultado = false;
            }
        }

        //compruebo el sumatorio de las columnas
        if (resultado)
        {
            int sumaColumna = 0;

            //recorro cada columna
            for (int columna = 0; columna < matriz[0].length; columna++) 
            {
                sumaColumna = 0;
                //recorro cada fila
                for (int fila = 0; fila < matriz.length; fila++) 
                {
                    sumaColumna += matriz[fila][columna];
                }

                if(sumaColumna != sumatorioFila0)
                {
                    resultado = false;
                }
            }

            
        }

        return resultado;

    }
}
