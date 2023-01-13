package ArraysT5;

public class Bidimensional1 {
    
    public static void main(String[] args) {
        

        int[][] tabla = new int[5][5];

        //rellenar tabla 
        for (int i = 0; i < tabla.length; i++) {

            int[] fila = tabla[i];
            for (int j = 0; j < fila.length; j++) {
                fila[j] = i*10+j;  
            }
        }


        //imprimir tabla
        for (int i = 0; i < tabla.length; i++) {
            int[] filaArray = tabla[i];
            for (int j = 0; j < filaArray.length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
            
        }
    }
}
