package contenedores;

import java.util.ArrayList;
import java.util.HashMap;

public class EjemploDiccionario {


    public static void main(String[] args) {
        
        HashMap<Integer, Persona> agenda = new HashMap<>();
        
        Persona p1 = new Persona();
        p1.setNombre("PEPE");

        Persona p2 = new Persona();
        p2.setNombre("MARIA");

        Persona p3 = new Persona();
        p3.setNombre("JOSE");

        agenda.put(1, p1);
        agenda.put(2, p2);
        agenda.put(3, p3);

        System.out.println("Contenido agenda: " + agenda.toString());

        Persona personaBuscada = agenda.get(2);

        System.out.println("La persona con clave 2 es: " +personaBuscada);

        Persona personaBuscada2 = agenda.get(8);

        System.out.println("La persona con clave 8 es: " +personaBuscada2);

        //Hay que tener cuidado porque puede ser que la clave no exista y nos devuelva nulo.
        if (personaBuscada2 != null)
        {
            String cadena = "La edad de la persona con clave 8  es: " + personaBuscada2.edad;
            System.out.println(cadena);
        }
        else
        {
            System.out.println("No existe persona con clave 8");
        }

        //ArrayList<Integer> listaClaves = new ArrayList<>(agenda.keySet());
        ArrayList<Integer> listaClaves = new ArrayList<>();
        listaClaves.addAll(agenda.keySet());

        System.out.println("Lista de Claves: " + listaClaves.toString());

        System.out.println("Lista de valores: " + agenda.values().toString());

    }
    
}
