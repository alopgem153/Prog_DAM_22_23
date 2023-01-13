package ArraysT5;

import java.util.Arrays;

public class ArrayBidimensional {
    
    public static void main(String[] args) {
        
        int fila = 3;
        int columna = 2;

        int[][] datos = new int[fila][columna];  //3 filas y 2 columnas
                                    //equivalente a 3 arrays de 2 elementos

        datos[0][0] = 0; 
        datos[0][1] = 1;
        datos[1][0] = 2; 
        datos[1][1] = 3;
        datos[2][0] = 4;
        datos[2][1] = 5;
        
        System.out.println(Arrays.deepToString(datos));

        System.out.println(datos.length);

        for (int i = 0; i < datos.length; i++) {
            int[] filaArray = datos[i];
            for (int j = 0; j < filaArray.length; j++) {
                System.out.print(datos[i][j] + " ");
            }
            System.out.println();
            
        }
    }
}
