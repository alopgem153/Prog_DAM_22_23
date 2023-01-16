package ArraysT5;

import java.util.Arrays;

public class Bidimensional3 {

    public static void main(String[] args) {
        //crear el array bidimensional
        int[][] matriz = new int[4][5]; //4 filas y 5 columnas

        //rellenar el array con aleatorios
        rellenarTabla(matriz);

        //pintar el array -> dentro de este metodo pintaremos la suma de las columnas y las filas
        imprimirConSumatorios(matriz);
    }

    static void rellenarTabla(int[][] arrayBid)
    {
        //recorro cada una de las filas
        for (int i = 0; i < arrayBid.length; i++) 
        {
            int[] fila = arrayBid[i];

            //de cada fila recorro sus elementos/posiciones
            for (int j = 0; j < fila.length; j++) 
            {
                int aleatorio = (int)(Math.random()*10)+1; //aleatorio de 1 a 10
                fila[j] = aleatorio;     
            }    
        }
    }   
    
    static void imprimirConSumatorios(int[][] arrayBid)
    {
        System.out.println((Arrays.deepToString(arrayBid)));
        System.out.println();

        int sumaTOTAL = 0;

        int sumaFila = 0;

        //Imprimimos cada fila
        for (int i = 0; i < arrayBid.length; i++) 
        {
            int[] fila = arrayBid[i];
            //inicializo para cada fila su sumatorio
            sumaFila = 0;
            for (int j = 0; j < fila.length; j++) 
            {
                //System.out.println(fila[j]);    
                System.out.print(arrayBid[i][j] + " \t");
                sumaFila += fila[j];
            }    

            sumaTOTAL += sumaFila;

            //pongo el sumatorio de la fila
            System.out.println(" | " + sumaFila);

            //al terminar de imprimir una fila hago salto de linea
            System.out.println();
        }

        //tengo que imprimir una ultima fila con el sumatorio de cada columna
        System.out.println("-------------------------------------------");

        int sumaTotalColumna = 0;

        int sumaColumna = 0;
        //Quiero recorrer cada columna y de cada columna recorrer las filas
        for (int i = 0; i < arrayBid[0].length; i++) 
        {
            sumaColumna = 0;
            //Por cada una de las columns recorro sus filas
            for (int j = 0; j < arrayBid.length; j++) 
            {
                sumaColumna  += arrayBid[j][i] ;
            }
            System.out.print(sumaColumna + "\t");
            sumaTotalColumna += sumaColumna;;
            
        }
        sumaTOTAL += sumaTotalColumna;
        System.out.println( " | " + sumaTOTAL);

    }
}
