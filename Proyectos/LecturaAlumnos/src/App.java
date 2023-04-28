import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

import Clases.Alumno;
import Clases.comparadores.ComkparadorEdadAltura;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br=null;
        try {
            br=new BufferedReader(new FileReader("src/recursos/ficheroAlumnos"));
            String lineas=br.readLine();
            lineas=br.readLine();
            ArrayList<Alumno> alumnos=new ArrayList<>();
            while (lineas!=null) {
                
                String[] linea=lineas.split(" ");
                
                try {
                    String sexo=linea[0].trim();
                    int edad=Integer.valueOf(linea[1].trim());
                    double estatura=Double.valueOf(linea[2].trim().replaceAll(",", "."));
                    int puntuación1=Integer.valueOf(linea[3].trim());
                    int puntuación2=Integer.valueOf(linea[4].trim());
                    String calificacion=linea[5].trim();
                    alumnos.add(new Alumno(sexo, edad, puntuación1, puntuación2, estatura, calificacion));    
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                lineas=br.readLine();
            }
            System.out.println(ordenar(alumnos));
            System.out.println(alumnos);
            System.out.println("-----------------");
            Collections.sort(alumnos, new ComkparadorEdadAltura());
            System.out.println(alumnos);



            //me piden buscar un alumno con edad 28 y altura 1.79
            int posicionAlumnoBuscado = Collections.binarySearch(alumnos, new Alumno(null, 28, 55, 0, 1.5, ""), new ComkparadorEdadAltura());
            Alumno alumnoBuscado = alumnos.get(posicionAlumnoBuscado);
            System.out.println("Alumno buscado= " + alumnoBuscado);

            // System.out.println(media(alumnos));
            // System.out.println(tot(alumnos));
            // System.out.println(contarSuspenso(alumnos));
            // System.out.println(contarMujer(alumnos));
            // System.out.println(contarHombre(alumnos));
            System.out.println(contarMujerSuspensa(alumnos));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            if (br!=null) {
                br.close();
            }
        }
    }
    public static ArrayList<Alumno> ordenar(ArrayList<Alumno> alumnos) {
        Collections.sort(alumnos);
        return alumnos;
    }
    public static double media(ArrayList<Alumno> alumnos) {
        double tot=0;
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno a=alumnos.get(i);
            tot+=a.getEdad();
        }
        return tot/alumnos.size();
    }
    public static int tot(ArrayList<Alumno> alumnos) {
        return alumnos.size();
    }
    public static int contarSuspenso(ArrayList<Alumno> alumnos) {
        int tot=0;
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno a=alumnos.get(i);
            if (a.getCalificación().equals("Suspenso")) {
                tot++;
            }
        }
        return tot;
    }
    public static int contarMujer(ArrayList<Alumno> alumnos) {
        int tot=0;
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno a=alumnos.get(i);
            if (a.getSexo().equals("Mujer")) {
                tot++;
            }
        }
        return tot;
    }
    public static int contarHombre(ArrayList<Alumno> alumnos) {
        int tot=0;
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno a=alumnos.get(i);
            if (a.getSexo().equals("Hombre")) {
                tot++;
            }
        }
        return tot;
    }
    public static int contarMujerSuspensa(ArrayList<Alumno> alumnos) {
        int tot=0;
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno a=alumnos.get(i);
            if (a.getSexo().equals("Mujer") && a.getCalificación().equals("Suspenso")) {
                tot++;
            }
        }
        return tot;
    }
}
