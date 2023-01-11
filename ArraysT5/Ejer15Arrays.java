package ArraysT5;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Ejer15Arrays {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] mesas = new int[10];

        //rellenar con aleatorios entre 0 y 4 cada mesa
        rellenarMesas(mesas);
        pintarMesas(mesas);


        boolean salir = false;
        do{
            //preguntar cuantos son
            System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa):");
            int peticionMesa = sc.nextInt();

            //si son mas de 0 y menos o igual de 4 entonce Buscarmesa
            if (peticionMesa >= 0 && peticionMesa <=4)
            {
                buscarMesa(mesas, peticionMesa);
            }
            else if (peticionMesa == -1)
            {
                salir = true;
            }
            else 
            {
                System.out.println("No admitimos grupos de "+ peticionMesa + "personas");
            }

            pintarMesas(mesas);

        }while(!salir);

        System.out.println("Gracias, adios!!");
    }

    static void rellenarMesas(int[] array)
    {
        for (int i = 0; i < array.length; i++) 
        {
            int ocupantes = (int)(Math.random()*5);
            array[i] = ocupantes;    
        }
    }

    static void pintarMesas(int[] array)
    {
        System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
        System.out.println("│Mesa no  │ 1  │ 2  │ 3  │ 4  │ 5  │ 6  │ 7  │ 8  │ 9  │ 10 │");
        System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
        System.out.println("│Ocupación│" + ocupantes(array) );
        System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
    }

    static String ocupantes(int[] array)
    {
        String ocupantes = "";

        for (int i = 0; i < array.length; i++) 
        {
            ocupantes += " " +array[i] + "  |";     
        }

        return ocupantes;
    }
    

    static void buscarMesa(int[] mesas, int personas)
    {
        //hay mesa libre
        int mesaLibre =UtilesArrayAlfonso.buscar(mesas, 0);

        if(mesaLibre >= 0) //hay mesa vacia -> entoces se sientan ahí
        {
            mesas[mesaLibre] = personas;
            System.out.println("Por favor, siéntense en la mesa número "+ mesaLibre+1);
        }
        else
        {
            //No hay mesa libre -> buscamos para compartir mesa

            boolean huecoEncontrado = false;
            for (int i = 0; i < mesas.length; i++) {
             
                if (!huecoEncontrado && mesas[i] + personas <= 4)
                {
                    //el grupo nuevo cabe en esta mesa
                    huecoEncontrado = true;
                    mesas[i] = mesas[i] + personas;
                    System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número "+ i+1);
                }
            }

            if (!huecoEncontrado)
            {
                System.out.println("Lo siento, en estos momentos no queda sitio.");
            }

        }

    }
}
