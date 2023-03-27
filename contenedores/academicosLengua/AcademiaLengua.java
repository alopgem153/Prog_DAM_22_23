package contenedores.academicosLengua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class AcademiaLengua {

    public static void main(String[] args) {
        
        HashMap<Character, Academico> academia = new HashMap<>();


        //Insercion de academicos
        
        nuevoAcademico(academia, new Academico("Perez", 2001), 'G');
        nuevoAcademico(academia, new Academico("Galdos", 1754), 'Z');
        nuevoAcademico(academia, new Academico("Francisco Rico Manrique", 1954), 'p');
        nuevoAcademico(academia, new Academico("Luis Goytisolo Gay", 2010), 'C');
        nuevoAcademico(academia, new Academico("Antonio Muñoz Molina", 1980), 'u');
        nuevoAcademico(academia, new Academico("Víctor Gacía de la Concha", 1999), 'c');

        nuevoAcademico(academia, new Academico("No debe entrar", 2023), 'c'); //No debe netrar pq ya está ocupado el sillon 'c'

        //Listado de academicos ordenados por nombre sin letra
        ArrayList<Academico> listadoAcademicos = new ArrayList<>();
        listadoAcademicos.addAll(academia.values());

        Collections.sort(listadoAcademicos);
        System.out.println(listadoAcademicos);


        //Listado de academicos ordenados por año de ingreso sin letra
        Collections.sort(listadoAcademicos, new AcademicosComparaYear());
        System.out.println(listadoAcademicos);

        //Listado con letra de los academicos, ordenado por letra
        ArrayList<Character> listaLetras = new ArrayList<>(academia.keySet());
        Collections.sort(listaLetras);

        for (Character letra : listaLetras) {
            Academico academicoLeido = academia.get(letra);
            System.out.println("Letra: " + letra + " - " + academicoLeido.getNombre());
        }


        TreeMap<Character, Academico> arbolAcademia = new TreeMap<>(academia);
        System.out.println(arbolAcademia);




    }


    public static boolean nuevoAcademico(HashMap<Character, Academico> academia, Academico nuevo, Character letra)
    {
        boolean resultado = false;

        //comprobamos si la letra está ya ocupada
        if (academia.containsKey(letra))
        {
            System.out.println("El sillón con la letra " + letra + " ya está ocupada por "+ academia.get(letra));
        }
        else 
        {
            academia.put(letra, nuevo);
            resultado = true;
        }

        return resultado;
    }
    
}
