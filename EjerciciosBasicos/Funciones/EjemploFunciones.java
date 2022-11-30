package Funciones;

import java.util.Scanner;

public class EjemploFunciones {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("inicio");

        // for(int i=0; i<5; i++)
        // {
        //     System.out.println("HOLA");
        // }
        imprimir5Veces();
            
        System.out.println("en mitad");

        // for(int i=0; i<5; i++)
        // {
        //     System.out.println("HOLA");
        // }
        imprimir5Veces();

        System.out.println("al final");


        // for(int i=0; i<5; i++)
        // {
        //     System.out.println("HOLA");
        // }
        imprimir5Veces();

        System.out.println("----------------------------------");
        imprimirXVeces(3);

        System.out.println("----------------------------------");
        imprimirCadenaXVeces("Que tal", 10);


        System.out.println("----------------------------------");
        int a = 5;
        int b = 8;
        int maximo = numeroMaximo(a, b);
        System.out.println("Maximo: " + maximo);
        

        System.out.println("----------------------------------");
        System.out.println("Aleatorio(100, 25): " + aleatorio(100, 25));

    }

    static void imprimir5Veces()
    {
        
        for(int i=0; i<5; i++)
        {
            //System.out.println("HOLA");
            imprimirAlgo("hola");
        }
    }

    static void imprimirXVeces(int repeticiones)
    {
        for(int i=0; i<repeticiones; i++)
        {
            imprimirAlgo("hola " + i);
        }
    }

    static void imprimirAlgo(String cadena)
    {
        System.out.println("Imprimimos la cadena: " + cadena);
    }

    static void imprimirCadenaXVeces(String cadena, int repeticiones)
    {
        for (int i = 0; i< repeticiones; i++)
        {
            System.out.println(" * " + cadena);
        }
    }

    static int numeroMaximo(int num1, int num2)
    {
        num2 = num2 +2;
        int maximo = num1;
        if (num1< num2)
        {
            maximo = num2;
        }
        
        return maximo;
    }

    static int suma(int a, int b)
    {
        return a + b;
    }

    //Sobrecargamos la funcion/metodo suma
    static int suma(int a, int b, int c)
    {
        return a + b + c;
    }

    /**
     * Devuelve un numero aleatorio entre 0 y 1
     * @return
     */
    static double aleatorio()
    {
        return Math.random();
    }

    /**
     * Devuelve un numero aleatorio entre 0 y maximo
     * @param maximo
     * @return
     */
    static double aletorio(int maximo)
    {
        return  Math.random() * maximo;
    }

    /**
     * Devuelve un numero aleatorio entre minimo y maximo
     * @param maximo
     * @param minimo
     * @return
     */
    static double aleatorio(int maximo, int minimo)
    {
        return (Math.random()*(maximo-minimo)) + minimo;
    }

}
