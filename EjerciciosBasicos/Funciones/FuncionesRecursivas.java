package Funciones;

public class FuncionesRecursivas {
    
    /**
     * Sumar los números naturales hasta N (se lo damos nosotros) 
     * de forma recursiva.

     * @param numero
     * @return
     */
    static int suma(int numero)
    {
        int resultado = numero;
        
        if(numero == 1) //caso base
        {
            return resultado;
        }
        else //caso recursivo
        {
            return numero + (suma(numero-1));
        }
        
    }

    /**
     * Factorial de un número (Factorial es el producto de todos 
     * los números enteros positivos desde 1 hasta n)

     * @param numero
     * @return
     */
    static int factorial(int numero)
    {

        if (numero == 1) // caso base
        {
            return numero;
        }
        else // caso recursivo
        {
            return numero * factorial(numero-1);

        }
    }

    /**
     * Imprime el numero de asteriscos necesarios 
     * @param numero
     */
    static void piramide(int numero)
    {
        if (numero == 1) //caso base
        {
            System.out.print("*");
        }
        else //caso recursivo
        {
            System.out.print("*"); 
            piramide(numero -1);
        }

    }

    static void pintaPiramide(int altura)
    {
        if(altura == 1) //caso base 
        {
            piramide(altura);
            System.out.println();
        }
        else //caso recursivo
        {
            piramide(altura);
            System.out.println();
            pintaPiramide(altura-1);
        }
    }

    static String recorrerArray(String[] palabras, int numero)
    {
        String resultado = "";

        if (numero == 0) //caso base numero 0
        {
            resultado =  palabras[numero];;
        }
        else 
        {
            //numero = numero-1;
            resultado = recorrerArray(palabras, numero-1) + " - " + palabras[numero];
        }

        return resultado;

    }
    


    public static void main(String[] args) {
        
        //suma recursiva
        System.out.println("Suma recursiva de 4: " + suma(4));

        //Factorial
        System.out.println("Factorial de 5: " + factorial(5));

        //Piramide
        int altura =4;
        pintaPiramide(altura);

        for(int aux = altura; aux > 0; aux-- )
        {
            piramide(aux);
            System.out.println();
        }


        //Piramide 2
        System.out.println("-----------------------");
        pintaPiramide(4);

        System.out.println("-----------------------");

        String cadena = "La vaca lola esta loca de la cabeza";
        String[] palabras = cadena.split(" ");
        System.out.println(recorrerArray(palabras, palabras.length-1));
    }
}
