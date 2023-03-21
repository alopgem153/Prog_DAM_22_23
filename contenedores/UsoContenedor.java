package contenedores;

import javax.swing.JSpinner.NumberEditor;

public class UsoContenedor {

    public static void main(String[] args) {
        
        Integer[] numerosArray = {3,6,2};

        Contenedor<Integer> numerosContenedor = new Contenedor<Integer>(numerosArray);

        System.out.println(numerosContenedor.toString());

        numerosContenedor.insertarAlFinal(1);

        numerosContenedor.insertarAlPrincipio(99);


        System.out.println(numerosContenedor.toString());

        // numerosContenedor.extraerDelFinal();

        // //numerosContenedor.extrsuperaerDelPrincipio();

        // System.out.println(numerosContenedor.toString());

        numerosContenedor.ordenar();

        System.out.println(numerosContenedor.toString());

        //-----------------------------------------------

        Persona[] personasArray = new Persona[0];
    
        Persona p1 = new Persona();
        p1.nombre = "PEPE";

        Persona p2 = new Persona();
        p2.nombre = "MARIO";

        Persona p3 = new Persona();
        p3.nombre = "Alfonso";

        Contenedor<Persona> contenedorPersonas = new Contenedor<Persona>(personasArray);
        contenedorPersonas.insertarAlFinal(p1);
        contenedorPersonas.insertarAlFinal(p2);
        contenedorPersonas.insertarAlFinal(p3);
        
        System.out.println(contenedorPersonas.toString());

        contenedorPersonas.ordenar();

        System.out.println(contenedorPersonas.toString());



    }
    
}
