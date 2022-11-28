package Funciones;

public class MathAlfonso {
    
    /**
     * Devuelve verdadero si el numero es capicuo
     * @param numero
     * @return
     */
    static boolean esCapicua(int numero)
    {
        boolean resultado = false;

        //Calculo si es capicua
        int digitoAlReves = 0;
        int numeroCalculos = numero;

        while(numeroCalculos > 0)
        {
            int resto = digitoAlReves % 10;
            numeroCalculos  = numeroCalculos / 10;

            digitoAlReves = (digitoAlReves * 10) + resto;


        }

        if (digitoAlReves == numero)
        {
            resultado = true;
        }

        return resultado;
    }

    /**
     * Devuelve verdadero si el numero es primo
     * @param numero
     * @return
     */
    static boolean esPrimo(int numero)
    {
        boolean resultado = true;

        //un numero es primo si solo es divisible por el mismo y por 1
        for(int i = 2; i<numero; i++)
        {
            if (numero % i == 0)
            {
                resultado = false;
            }
        }

        return resultado;
    }


    static int siguientePrimo(int numero)
    {
        int resultado = numero+1;

        boolean encontrado = false;
        while(!encontrado)
        {
            //Utilizo la función anterior esPrimo para calcular y buscar el siguiente
            if (esPrimo(resultado))
            {
                encontrado = true;
            }
            else
            {
                resultado++;
            }
        }

        return resultado;
    }

    static int potencia(int base, int exponente)
    {
        int resultado = base;
        if (exponente == 0)
        {
            resultado = 1;
        }
        else 
        {
            for(int aux = 1; aux <= exponente; aux++)
            {
                resultado = resultado * base;
            }   
        }

        return resultado;
    }

}
