package ArraysT5;

import java.util.Scanner;

public class Bingo {
    
    static Scanner sc = new Scanner(System.in);

    

    public static void main(String[] args) {
        
        //Declaracion de variables
        
        // int[] col0 = new int[3];
        // int[] col1 = new int[3];
        // int[] col2 = new int[3];
        // int[] col3 = new int[3];
        // int[] col4 = new int[3];
        // int[] col5 = new int[3];
        // int[] col6 = new int[3];
        // int[] col7 = new int[3];
        // int[] col8 = new int[3];

        int[] col0 = {5, 8, 9};
        int[] col1 = {15, 18, 19};
        int[] col2 = {25, 28, 29};
        int[] col3 = {35, 38, 39};
        int[] col4 = {45, 48, 49};
        int[] col5 = {55, 58, 59};
        int[] col6 = {65, 68, 69};
        int[] col7 = {75, 78, 79};
        int[] col8 = {85, 88, 89};
        
        int[][] carton = {col0, col1, col2, col3, col4, col5, col6, col7, col8};
        
        int[] numerosGenerados = new int[0];


        //variable para controlar si salimos del programa o jugamos otro cartón
        boolean salir = true;

        do 
        {
            //Crear/restaurar carton vacio y vaciado de los numeros generados en eljuego anterior
            
            
            //Coloco los 12 espacios en blanco, distribuidos en 4 por cada fila al azar en las columnas
            //ponerBlancos(carton);

            //introduzco los numeros de cada columna
            //rellenarNumerosCarton(carton);

            //pinto el cartón ;
            pintarCarton(carton, numerosGenerados);

        //     //pregunto si quiero sacar otra bola o terminar este juego
        //     boolean jugar = false;

        //     while(jugar)
        //     {

        //         //saco numero aleatorio - no se debe repetir
                
        //         //pinto el carton con numeros sacados
        //         int numeroAciertos = pintarCarton(carton, numerosGenerados);


        //         //Eres ganador??
        //         if (numeroAciertos >= 15)
        //         {
        //             System.out.println("-----------------------------");
        //             System.out.println("--------  BINGO -------------");
        //             System.out.println("-----------------------------");
        //         }

        //         //pregunto si quiero sacar otra bola o terminar este juego
                

               
        //     }

        //     //Pregunto si quiero jugar otro cartón o salir definitivamente del programa
           
            
         } while(!salir);
    }


    static void pintarCarton(int[][] matriz, int[] numeroGenerados)
    {
        // int[][] carton = {col0, col1, col2, col3, col4, col5, col6, col7, col8};

        //Quiero recorrer el valor 0 de cada una de las columnas 
        //y luevo el valor 1 de cada una de las columnas 
        //y luego el valor 2
        for (int i = 0; i < matriz[0].length; i++) // matriz[0].length = 3 Numero de elementos que tiene cada columna
        { 
            for (int j = 0; j < matriz.length; j++)  //matriz.length = 9 -> nnumero de columnas en el carton
            {
                int columna = i;
                int fila = j ;

                System.out.print(matriz[fila][columna] + "\t ");
            }

            System.out.println();
        }
    }

}
