import models.Profesor;
import models.Profesores;
import utils.utils;

public class App {
    public static void main(String[] args) throws Exception {
        Profesores profesores = utils.leerFicheroJson();

        System.out.println(profesores);

        utils.crearFicheroCSV(profesores);

        utils.crearFicheroTxt(profesores);

        Profesor profesor = new Profesor();

        for (Profesor p : profesores.getProfesores()) 
        {
            if (p.getNombre().equals("Ana Garcia"))
            {
                profesor = p;
            }    
        }

        utils.crearJsonAlumnosDeProfesor(profesor);
    }
}
