package contenedores;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 {

    public static void main(String[] args) {
        

        int cantidadNumeros = (int)(Math.random()*11)+10;

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < cantidadNumeros; i++) 
        {
            listaNumeros.add((int)(Math.random()*101));    
        }

        System.out.println(listaNumeros);

        //suma
        System.out.println("Suma= " + suma(listaNumeros));
        //media
        System.out.println("Media= " + media(listaNumeros));
        //maximo
        System.out.println("Max= " + max(listaNumeros));
        //minimo
        System.out.println("Min= " + min(listaNumeros));
    }

    public static int suma(ArrayList<Integer> lista)
    {
        int total = 0;
        for (Integer numer : lista) 
        {
            total += numer;
        }

        return total;
    }

    public static int media(ArrayList<Integer> lista)
    {
        return suma(lista)/lista.size();   
    }

    public static int max(ArrayList<Integer> lista)
    {
        return Collections.max(lista);
    }
    
    public static int min(ArrayList<Integer> lista)
    {
        return Collections.min(lista);
    }
}
