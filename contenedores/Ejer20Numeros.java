package contenedores;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ejer20Numeros {


    public static void main(String[] args) {
        
        
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

        TreeSet<Integer> elementosSinRepetir = new TreeSet<Integer>();
        TreeSet<Integer> elementosRepetidos = new TreeSet<Integer>();
       
        //Creo los numeros de listaNumeros
        for (int i = 0; i < 20; i++) 
        {
            int numero = (int)((Math.random()*10)+1);
            listaNumeros.add(numero);
        }

        System.out.println(listaNumeros);

        //En elementosSinRepetir guardo los elementos que solo están 1 vez en listanumeros
        // y en elementosRepetidos los numeros que están repetidos en listanumeros
        for (Integer numero : listaNumeros) {

            //Si el numero NO está en elemento repetido y tampoco está en elementoSinRepetir 
            //entonces lo inserto en elementoSInRepetir
            if(!elementosSinRepetir.contains(numero) && !elementosRepetidos.contains(numero))
            {
                elementosSinRepetir.add(numero);
            }
            else //Si el numero está en alguno de los conjuntos entoces lo borro del SINREPETIR y lo añadio al de repetidos 
            {
                elementosSinRepetir.remove(numero);
                elementosRepetidos.add(numero);
            }

        }

        System.out.println("Elementos Sin repetir: " + elementosSinRepetir);
        System.out.println("Elementos repetidos: " + elementosRepetidos);



        //----------------------------------------------
        //Utilizamos iterator con SET
        Iterator<Integer> iteratorElementosRepetidos = elementosRepetidos.iterator();

        while(iteratorElementosRepetidos.hasNext())
        {
            Integer numeroLeido = iteratorElementosRepetidos.next();
            System.out.print(" Numero: " + numeroLeido);
        }


        elementosRepetidos.ad


    }
    
}
