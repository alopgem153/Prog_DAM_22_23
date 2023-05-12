import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelo.Coche;
import modelo.Employee;
import modelo.Grupo;
import modelo.Grupo2;
import modelo.Persona;
import utils.jsonUtils;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, JSon!");

        // //Leer Json que contiene 1 objeto y convertirlo en objeto 
        // Employee emp1 =jsonUtils.LeerEmpleadoFromJsonFile("src/recursos/empleado_object.txt");

        // System.out.println("==============================================");



        // //Leer Json que contiene 1 array de objetos y convertirlo en un list<objeto> 
        // List<Employee> listaEmpleados = jsonUtils.LeerListEmpleadoFromJsonFile("src/recursos/employeeArray.txt");
        // System.out.println("====== ARRAY EMPLEADOS ========================");

        // for (Employee employee : listaEmpleados) {
        //     System.out.println(employee);
        // }

        // System.out.println("==============================================");

        // //Convertir objeto a Json
        // jsonUtils.convertToJson();


        Coche coche = jsonUtils.leerJsonCoche("src/recursos/coche.json");

        System.out.println(coche.getModelo());


        List<Coche> lista = jsonUtils.leerArrayCochesFromJson("src/recursos/cochesArray.json");
        

        lista.add(coche);

        jsonUtils.CrearJsonCoches(lista);

        System.out.println("=====   GRUPO de Persona2===========================");

        Grupo2 grupo2 = jsonUtils.LeerFicheroPersonas2();

        System.out.println(grupo2.toString());




        System.out.println("=====   GRUPO ===================================");

        Grupo grupo = jsonUtils.LeerFicheroPersonas();

        System.out.println(grupo.toString());

        Grupo grupoDe24 = new Grupo();

        ArrayList<Persona> personasDe24 = new ArrayList<>();

        for (Persona persona : grupo.getPeople()) 
        {
            if(persona.getAge().equals(24))
            {
                personasDe24.add(persona);
            }    
        }

        grupoDe24.setPeople(personasDe24);

        System.out.println("=====   GRUPO de 24===================================");

        System.out.println(grupoDe24.toString());

        jsonUtils.GuardarFicheroGrupo(grupoDe24);

        //PRACTICA 3 

        //Creamos un MAP de tipo <String, Persona>
        // Map<String, Persona> diccionarioPersonas = new HashMap<>();

        // //Introducimos varios valores
        // diccionarioPersonas.put("12345678P",grupo.getPeople().get(0) );
        // diccionarioPersonas.put("98765432X",grupo.getPeople().get(1) );
        // diccionarioPersonas.put("67879323H",grupo.getPeople().get(2) );

        // System.out.println(diccionarioPersonas);

        // //Guardamos ese MAP en un JSON
        // jsonUtils.crearFicheroDiccionario(diccionarioPersonas);

        Map<String, Persona> diccionarioPersonas2 = 
            jsonUtils.leerFicheroDiccionarioPersona("src/recursos/diccinarioPersonas.json");

            Persona yoMismo = new Persona();
            yoMismo.setFirstName("Alfonso");
            yoMismo.setLastName("lópez");
            yoMismo.setGender("Hombre");

        diccionarioPersonas2.put("11111111J", yoMismo);
            
        jsonUtils.crearFicheroDiccionario(diccionarioPersonas2);

        //calcula la media de la edad de las personas en diccionarioPersonas2
        Double mediaEdad = calcularMedia(diccionarioPersonas2.values());
        System.out.println("Media Edad: " + mediaEdad);
    }

    private static Double calcularMedia(Collection<Persona> values) {
        Double resultado = 0.0;

        List<Persona> listaPersonas = new ArrayList<>(values);

        Integer totalEdades = 0;
        Integer totalPersonas = 0;
        for (int i = 0; i < listaPersonas.size(); i++) {
            Persona persona = listaPersonas.get(i);

            if (persona.getAge() != null)
            {
                totalEdades += persona.getAge();
                totalPersonas ++;
            }

        }

        resultado = (double)totalEdades/totalPersonas;

        return resultado;
    }
}
