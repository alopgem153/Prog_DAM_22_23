package contenedores;

import java.util.Arrays;

public class UsoPersona {

    public static void main(String[] args) {
        
        Notas<Alumno> notas = new Notas<>();
        AlumnoBecado alumno1 = new AlumnoBecado();
        alumno1.nombre = "KiKE";
        alumno1.importeBeca = 200;
        notas.alumno = alumno1;

        System.out.println(notas.sacarNota());

        //Notas<Profesor_Tutor> notas2 = new Notas<Profesor_Tutor>(); ERROR Profesor_Tutor no implementa Alumno


        decirHola();

        Alumno[] arrayAlumnos = new Alumno[0];

        arrayAlumnos = insertarElemento(arrayAlumnos, alumno1);


    }

    public static <T> T[] insertarElemento(T[] array, T nuevo)
    {
        //T[] array = new T[10]; //error
        T[] nuevoArray = Arrays.copyOf(array, array.length+1);

        nuevoArray[nuevoArray.length-1] = nuevo;

        return nuevoArray;

    }


    public static void decirHola()
    {
        System.out.println("HOLA");
    }



    
}
