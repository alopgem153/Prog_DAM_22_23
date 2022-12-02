package Funciones;

public class RecursivaBasica {
    

    public static void main(String[] args) {
        
        int numero = 10;

        int resultado = funcionRecursiva(numero);

        System.out.println("REsultado = " + resultado);

    }


    static int funcionRecursiva(int n)
    {

        int resultado = n;

        if (n == 1)
        {
            resultado = 1;
        }
        else
        {
            System.out.println("--" + resultado + " + " + (n-1));
            resultado = resultado + funcionRecursiva(n+1);
        }

        return resultado;
    }
}
