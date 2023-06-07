package Clases.comparadores;

import java.util.Comparator;

import Clases.Alumno;

public class ComkparadorEdadAltura implements Comparator<Alumno> {

    /**
     * Comparo los alumnos por edad y a igual edad por estatura de menor a mayor
     */
    @Override
    public int compare(Alumno arg0, Alumno arg1) {

        if (arg0.getEdad() == arg1.getEdad())
        {
            //en este caso comparo por estatura (de menor a mayor)
            Double estatura1 = Double.valueOf(arg1.getEstatura());
            Double estatura0 = Double.valueOf(arg0.getEstatura());

            return estatura1.compareTo(estatura0);
        }
        else
        {
            return arg0.getEdad() - arg1.getEdad();
        }
        
    }


    
}
