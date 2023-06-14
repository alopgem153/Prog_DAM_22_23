package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import exceptions.NoExisteDNIException;
import models.Alumno;
import models.Profesor;
import models.Profesores;

public class utils {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    public static Profesores leerFicheroJson ()
    {
        Profesores profesores = null;

        try  
        {
            ObjectMapper om = new ObjectMapper();

            profesores = om.readValue(new File("src/resources/profesores-alumnos-notas"), Profesores.class);

        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }

        return profesores;
    }

    public static void crearFicheroCSV (Profesores profesores)
    {
        List<Alumno> alumno = new ArrayList<>();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/salida/infoAlumnos.csv"))) 
        {
            alumno = devolverListaAlumnos(profesores);

            for (Alumno alumno2 : alumno) 
            {
                bw.write(alumno2.getNombre() + ";" + alumno2.getDni() + ";" + df.format(notaMedia(alumno2)));
                bw.newLine();    
            }

        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }

    public static List<Alumno> devolverListaAlumnos(Profesores profesores)
    {
        List<Alumno> alumno = new ArrayList<>();
        
            for (Profesor p : profesores.getProfesores()) {

                for (Alumno a : p.getAlumnos()) {
                    try {
                        if (!a.getDni().equals(""))
                        {
                            alumno.add(a);
                        }
                        else 
                        {
                            throw new NoExisteDNIException(a.getNombre());
                        }
                    }
                    catch (NoExisteDNIException n)
                    {
                        System.out.println(n.getMessage());
                    }  
                    catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } 
            }

            return alumno;
    }

    public static Double notaMedia(Alumno a) {
        int numNotas = 0;
        Double totalNota = 0.0;

        for (String asignatura : a.getNotas().keySet()) {
            totalNota += a.getNotas().get(asignatura);
            numNotas++;
        }

        return totalNota / numNotas;
    }

    public static void crearFicheroTxt(Profesores profesores)
    {
        List<Alumno> alumnos = devolverListaAlumnos(profesores);
        List<Alumno> alumnosBeca = new ArrayList<>();
        HashMap<String, Double> becas = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/resources/becas2023.txt"))) 
        {
            String linea = "";

            while((linea = br.readLine()) != null)
            {
                String [] trozos = linea.split("-");
                becas.put(trozos[0], Double.parseDouble(trozos[1]));
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/salida/AlumnosBeca2023.txt"))) {
            for (Alumno alumno : alumnos) 
            {
                for (String asignatura : alumno.getNotas().keySet()) 
                {
                    for (String asignatura2 : becas.keySet()) 
                    {
                        if (asignatura.equals(asignatura2) && alumno.getNotas().get(asignatura) >= becas.get(asignatura2))
                        {
                            alumnosBeca.add(alumno);
                        }    
                    }    
                }
            }

            for (String asignatura : becas.keySet()) 
            {
                bw.write("==" + asignatura + "==");
                bw.newLine();

                for (Alumno a : alumnosBeca) 
                {
                    for (String subject : a.getNotas().keySet()) 
                    {
                        if (subject.equals(asignatura))
                        {
                            bw.write(a.getNombre() + ":" + a.getNotas().get(subject));
                            bw.newLine();
                        }    
                    }    
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void crearJsonAlumnosDeProfesor (Profesor p)
    {
        try  
        {
            ObjectMapper om = new ObjectMapper();   
            om.configure(SerializationFeature.INDENT_OUTPUT, true);

            String [] trozos = p.getNombre().split(" ");
            String nombreProfesor = "";

            for (String string : trozos) {
                nombreProfesor += string;
            }

            File fileJson = new File("src/salida/AlumnosDe" + nombreProfesor + ".json");

            om.writeValue(fileJson, p.getAlumnos());
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
