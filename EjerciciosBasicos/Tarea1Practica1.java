import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Tarea1Practica1 {
    public static void main(String[] args) {
        /*
         * Pide al usuario que introduzca su fecha de nacimiento, utilizando 3 preguntas: día, mes y año)

            Muéstrala en el formato dd-MM-yy
            Muestra la edad que tienes
            Indica cuantos días queda para cumplir otro año
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Dime el dia ");
         int dia = sc.nextInt();

         System.out.println("Dime el mes ");
         int mes = sc.nextInt();

         System.out.println("Dime el año ");
         int ano = sc.nextInt();

         sc.close();

         LocalDate miFecha = LocalDate.of(ano, mes, dia);

         //System.out.println(miFecha);

         DateTimeFormatter miFormatoEspecial = DateTimeFormatter.ofPattern("dd-LLLL-yy ' que es' EEEE");
         System.out.println(miFecha.format(miFormatoEspecial));
    
        //Muestra la edad que tienes
        Period periodoEdad = Period.between(miFecha, LocalDate.now());
        System.out.println("Tienes la edad de "+ periodoEdad.getYears());

        long edad = ChronoUnit.YEARS.between(miFecha, LocalDate.now());
        System.out.println("Tienes la edad de "+ edad);

        //Indica cuantos días queda para cumplir otro año
        LocalDate fechaProximoCumple = LocalDate.of(LocalDate.now().getYear(), mes, dia);

        /*
        fechaProximoCumple = (fechaProximoCumple.isAfter(LocalDate.now())) ? fechaProximoCumple 
                                    : fechaProximoCumple.plusYears(1);
        */
        System.out.println("Días que quedan: "+  ChronoUnit.DAYS.between(LocalDate.now(),  fechaProximoCumple));

    }   



    
}
