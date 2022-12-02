package Funciones;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

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
        int digitoAlReves = voltea(numero);

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
            for(int aux = 1; aux < exponente; aux++)
            {
                resultado = resultado * base;
            }   
        }

        return resultado;
    }


    /**
     * Cuenta el número de dígitos de un número entero.
     * @param numero
     * @return
     */
    static int digitos(int numero)
    {
        int contador = 0;

        //Controlo que el numero 0 tiene 1 digito
        if (numero == 0)
        {
            contador = 1;
        }
        else 
        {
            while(numero > 0)
            {
                contador++;
                numero = numero / 10;
            }
        }
        return contador;
    }

    /**
     * Le da la vuelta a un número.
     * @param numero
     * @return
     */
    static int voltea(int numero)
    {
        int numeroAlReves = 0;
        int numeroCalculos = numero;

        while(numeroCalculos > 0)
        {
            int resto = numeroCalculos % 10;
            numeroCalculos  = numeroCalculos / 10;

            numeroAlReves = (numeroAlReves * 10) + resto;


        }

        return numeroAlReves;
    }

    static long voltea(long numero)
    {
        long numeroAlReves = 0;
        long numeroCalculos = numero;

        while(numeroCalculos > 0)
        {
            int resto = (int)(numeroCalculos % 10);
            numeroCalculos  = numeroCalculos / 10;

            numeroAlReves = (numeroAlReves * 10) + resto;


        }

        return numeroAlReves;
    }
    
    /**
    * Devuelve el dígito que está en la posición n de un número entero.
        Se empieza contando por el 0 y de izquierda a derecha.
     * @param numero
     * @param posicion
     * @return
     */
    static int digitoN(int numero, int posicion)
    {
        int resultado = -1;

        int numeroAlReves = voltea(numero);

        //comprobamos que estamos pidiendo una posicion válida
        int numeroDigitos = digitos(numero);

        if (numeroDigitos > posicion)
        {
            System.out.println("Posición no válida");
            resultado = -1;
        }
        else
        {
            //recorro el numero alreves
            for(int aux = 0; aux <= posicion; aux++)
            {
                resultado = numeroAlReves % 10;
                numeroAlReves = numeroAlReves / 10;
            }
        }

        return resultado;

    }

    /**
     * Da la posición de la primera ocurrencia de un dígito
        dentro de un número entero. Si no se encuentra, devuelve -1.
     * @param numero
     * @param digito
     * @return
     */
    static int posicionDeDigito(int numero, int digito)
    {
        int numeroAlReves = voltea(numero);
        int contadorPosicion = 0;

        int resto = numeroAlReves % 10;
        //LocalDateTime tiempoInicio = LocalDateTime.now();

        int numeroDigitos = digitos(numero);

        while (resto != digito && digitos(numero)<= contadorPosicion)
        {
            numeroAlReves = numeroAlReves / 10;
            resto = numeroAlReves % 10;
            contadorPosicion++;

        }

        //LocalDateTime tiempoFin = LocalDateTime.now();

        //System.out.println("Tiempo trancurrido " + ChronoUnit.NANOS.between(tiempoInicio, tiempoFin));

        //Si he llegado al final sin encontrarlo devuelve -1
        if (contadorPosicion > digitos(numero))
        {
            contadorPosicion = -1;
        }

        return contadorPosicion;
    }

    /**
     * Le quita a un número n dígitos por detrás (por la derecha).
     * @param numero Numero al que se le van a quitar posiciones por la derecha
     * @param posicionesAQuitar Numero de posiciones a quitar
     * @return el nuevo número creado
     */
    static int quitaPorDetras(int numero, int posicionesAQuitar)
    {
        int resultado = 0;

        //Si voy a a quitar x posiciones entonces lo que tengo que hacer es:
        // dividir por 10 elevado al numero de posiciones que quiero quitar 
        int divisor = potencia(10, posicionesAQuitar);

        resultado = numero / divisor;

        return resultado;

    }

    /**
     * Le quita a un número n dígitos por delante (por la izquierda).
     * @param numero
     * @param posicionesAQuitar
     * @return
     */
    static int quitaPorDelante(int numero, int posicionesAQuitar)
    {
        int numeroalReves = voltea(numero);
        int numeroNuevo = quitaPorDetras(numeroalReves, posicionesAQuitar);
        numeroNuevo = voltea(numeroNuevo);

        return numeroNuevo;
    }

    /**
     * Pega dos números para formar uno.
     * @param numero1
     * @param numero2
     * @return
     */
    static int juntaNumeros(int numero1, int numero2)
    {
        //Para juntar 2 numeros multiplico el 1º por
        // la potencia de 10 elevada al numero de dígitos del 2º
        // Al resultado le sumo el 2º
        // 57 y 231
        // 57 * 10 ³ = 57000 
        // 57000 + 231 = 57231
        int numeroNuevo = numero1 * (potencia(10, digitos(numero2)));
        numeroNuevo += numero2;

        return numeroNuevo;
    }

    static long juntaNumeros(long numero1, long numero2)
    {
        //Para juntar 2 numeros multiplico el 1º por
        // la potencia de 10 elevada al numero de dígitos del 2º
        // Al resultado le sumo el 2º
        // 57 y 231
        // 57 * 10 ³ = 57000 
        // 57000 + 231 = 57231
        long numeroNuevo = numero1 * (potencia(10, digitos((int)numero2)));
        numeroNuevo += numero2;

        return numeroNuevo;
    }

    static long juntaNumeros(long numero1, int numero2)
    {
        //Para juntar 2 numeros multiplico el 1º por
        // la potencia de 10 elevada al numero de dígitos del 2º
        // Al resultado le sumo el 2º
        // 57 y 231
        // 57 * 10 ³ = 57000 
        // 57000 + 231 = 57231
        long numeroNuevo = numero1 * (potencia(10, digitos(numero2)));
        numeroNuevo += numero2;

        return numeroNuevo;
    }



    /**
     * Añade un dígito a un número por detrás.
     * @param numero1
     * @param numero2
     * @return
     */
    static int pegaPorDetras(int numero1, int numero2)
    {
        return juntaNumeros(numero1, numero2);

    }

    static long pegaPorDetras(long numero1, int numero2)
    {
        return juntaNumeros(numero1, numero2);
    }

    static long pegaPorDetras(long numero1, long numero2)
    {
        return juntaNumeros(numero1, numero2);
    }

    /**
     * Añade un dígito a un número por delante.
     * @param numero1
     * @param numero2
     * @return
     */
    static int pegaPorDelante(int numero1, int numero2)
    {
        return juntaNumeros(numero2, numero1);
    }

    /**
     * Toma como parámetros las posiciones inicial y final
        dentro de un número y devuelve el trozo correspondiente.
     * @param numero
     * @param posInicio
     * @param posFinal
     * @return
     */
    static int trozoDeNumero(int numero, int posInicio, int posFinal)
    {

        int numeroNuevo = quitaPorDelante(numero, posInicio);
        numeroNuevo = quitaPorDetras(numeroNuevo, digitos(numero)- posFinal);

       return numeroNuevo;
    }
}
