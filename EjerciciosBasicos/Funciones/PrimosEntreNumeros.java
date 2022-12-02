package Funciones;

public class PrimosEntreNumeros {
    public static void main(String[] args) {
        
        /*
         * Muestra los números primos que hay entre 1 y 1000.
         */
        int inicio = 0;
        int fin = 1000;
        while(inicio <= fin )
        {

            if (MathAlfonso.esPrimo(inicio))
            {
                System.out.println(inicio);
            }
            inicio++;

        }

    }
}
