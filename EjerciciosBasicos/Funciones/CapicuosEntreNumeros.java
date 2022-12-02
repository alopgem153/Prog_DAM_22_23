package Funciones;

public class CapicuosEntreNumeros {
    
    public static void main(String[] args) {
        
        /*
         * Muestra los números capicúa que hay entre 1 y 99999.
         * 
         */

         int inicio = 0;
         int fin = 99999;

         while (inicio <= fin)
         {
            if (inicio > 9 && MathAlfonso.esCapicua(inicio))
            {
                System.out.println(inicio);
            }

            inicio++;
         }
    }
}
