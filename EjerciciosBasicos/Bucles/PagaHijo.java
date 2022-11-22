package Bucles;

import java.time.LocalDate;

public class PagaHijo {
    public static void main(String[] args) {
        /*
         * Javier tiene un hijo al que le quiere dar de paga 0.05€, 
         * al ver la cara de tristeza de su hijo le promete 
         * que cada semana le dará de paga el doble de la anterior semana.
            El hijo le parece genial y sueña con comprarse un bicicleta nueva de 2000 €.
            ¿Cuantas semanas tardará en poder comprarse la bici?
         */

         final double PAGA_INICIAL = 0.05;
         final double PRECIO_BICICLETA = 2000;

         double importePaga = PAGA_INICIAL;
         int numeroSemanas = 0;

         double ahorroHijo = 0;

         while (ahorroHijo < PRECIO_BICICLETA)
         {
            //ahorroHijo += PAGA_INICIAL;

            ahorroHijo += importePaga;
            importePaga = importePaga * 2.0;
             
            numeroSemanas++;
         }

         LocalDate fecha = LocalDate.now();
         fecha = fecha.plusDays(numeroSemanas*7);
         System.out.println("Semanas para ahorar para la bici: " + numeroSemanas);
         System.out.println("TE puedes comprar la bici en: " + fecha);

    }
}
