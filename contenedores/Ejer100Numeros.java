package contenedores;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejer100Numeros {

    public static void main(String[] args) {
        
        /*
         * Crea una colección de 100 números (entre 1 y 10) que pueden estar repetidos. 
         * Después elimina todos los elementos que valen 5. 
         * Mostrar el antes y el después, indicando también el tamaño de la colección.
         */

         ArrayList<Integer> listaNumeros = new ArrayList<>();

         for (int i = 0; i < 100; i++) {
            int numero = (int)((Math.random()*10)+1);
            listaNumeros.add(numero);
         }

         System.out.println("La lista tiene: " + listaNumeros.size() + " elementos.");
         System.out.println(listaNumeros);

         //Eliminar los numeros 5
         for (int i = 0; i < listaNumeros.size(); i++) 
         {
            if (listaNumeros.get(i) == 5)
            {
                listaNumeros.remove(i);
            }
         }

         
         System.out.println("La lista ahora tiene: " + listaNumeros.size() + " elementos.");
         System.out.println(listaNumeros);

         //CON Iterator
         
         Iterator<Integer> listaIterada =  listaNumeros.iterator();
         while(listaIterada.hasNext())
         {
            Integer numero = listaIterada.next();
            if(numero == 4)
            {
                listaIterada.remove();
            }
         }

         System.out.println("La lista ahora tiene: " + listaNumeros.size() + " elementos.");
         System.out.println(listaNumeros);

    }
    
}
