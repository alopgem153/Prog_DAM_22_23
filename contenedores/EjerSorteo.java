package contenedores;

import java.util.Arrays;
import java.util.HashSet;

public class EjerSorteo {

    public static void main(String[] args) {
        
        Sorteo<Integer> sorteoCamiseta = new Sorteo<>();

        sorteoCamiseta.add(100);
        sorteoCamiseta.add(101);
        sorteoCamiseta.add(99);
        sorteoCamiseta.add(80);
        sorteoCamiseta.add(50);
        sorteoCamiseta.add(150);

        HashSet<Integer> ganadores = new HashSet<>(sorteoCamiseta.premiados(2));

        System.out.println(Arrays.toString(ganadores.toArray()));


        Sorteo<String> sorteoAlumno = new Sorteo<>();

        sorteoAlumno.add("MARIA");
        sorteoAlumno.add("Kique");
        sorteoAlumno.add("Jesus");
        sorteoAlumno.add("MARISA");
        sorteoAlumno.add("Juanjo");
        sorteoAlumno.add("Sofia");
        sorteoAlumno.add("Andrés");
        sorteoAlumno.add("Javi");
        sorteoAlumno.add("Sara");

        HashSet<String> ganadoresAlumnos = new HashSet<>(sorteoAlumno.premiados(3));

        System.out.println(Arrays.toString(ganadoresAlumnos.toArray()));

        

    }
    
}
