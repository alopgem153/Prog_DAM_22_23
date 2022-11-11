package FechasBasicas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ManejoFechas {

    public static void main(String[] args) {

        // Obtener la fecha y hora actual
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());

        System.out.println(LocalDateTime.now());

        DateTimeFormatter miFormatoDeFecha = DateTimeFormatter.ofPattern("'Fecha mia:' dd/MM/yy E w ");

        LocalDateTime fechaActual = LocalDateTime.now();

        System.out.println(fechaActual.format(miFormatoDeFecha));

        //Crear fechas y horas

        LocalTime miHora = LocalTime.of(23,59);
        System.out.println(miHora);

        LocalDate miFecha = LocalDate.of(2024, 12, 31 );
        System.out.println(miFecha);

        LocalDateTime miFechaHora = LocalDateTime.of(miFecha, miHora);
        System.out.println(miFechaHora.format(miFormatoDeFecha));

        //Modificar una fecha

        miHora = miHora.withHour(23);
        miHora = miHora.withMinute(21);
        System.out.println(miHora);

        

        miFecha =miFecha.withMonth(5);
        miFecha =miFecha.withYear(2023);
        miFecha =miFecha.withDayOfMonth(10);

        System.out.println(miFecha);

        LocalDate diaSiguiente = miFecha.plusDays(1);
        System.out.println(diaSiguiente);
        LocalDate diaAnterior = miFecha.minusDays(1);
        System.out.println(diaAnterior);

        System.out.println("Actual: " + miFechaHora);
        LocalDateTime nuevaFecha = miFechaHora.plusMinutes(1);
        System.out.println("Nueva: " + nuevaFecha);
        

        // Tiempo transcurrido
        LocalDate finDeAno = LocalDate.of(2022, 12, 31);
        Period deHoyAFinDeAno = Period.between(LocalDate.now(), finDeAno);

        int numeroDias = deHoyAFinDeAno.getDays();
        int numeroMeses = deHoyAFinDeAno.getMonths();
        System.out.println(deHoyAFinDeAno.toString());
        System.out.println("Quedan para fin de año " + numeroMeses + " meses y " + numeroDias + " días");

        Period hastaFinAno = LocalDate.now().until(finDeAno);
        System.out.println("* " + hastaFinAno.toString());

        System.out.println(" Dias: " + ChronoUnit.DAYS.between(LocalDate.now(), finDeAno));

        // Pide al usuario que introduca su fecha de nacimiento 
        // muestrala en el formato dd-MM-yy
        // Muestra la edad que tienes
        // Indica cuantos días queda para cumplir otro año

    }
    
}
