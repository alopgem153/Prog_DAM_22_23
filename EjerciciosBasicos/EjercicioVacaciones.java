//package EjerciciosBasicos;

import java.util.Scanner;

public class EjercicioVacaciones {
        public static void main(String[] args) {
            /*
             * Si tienes dinero entonces puedes ir de vacaciones, 
             * la otra opción para poder ir de vacaciones es
             *       tener reserva y tener pasaporte en regla.
            
             *  Para saber donde irás de vacaciones es sencillo: 
             *  Puedes ir a la playa o la montaña y siempre iréis
             *  a la playa a no ser que tus 3 hijos quieran
             *  ir a la montaña.

             */

             Scanner sc = new Scanner(System.in);

             System.out.println("Tienes dinero??");
             boolean tengoDinero = sc.nextBoolean();

            System.out.println("Tienes reserva??");
            boolean tengoReserva = sc.nextBoolean();

            System.out.println("Tienes pasaporte??");
            boolean tengoPasaporte = sc.nextBoolean();

            boolean voyDeVacaciones = tengoDinero || (tengoReserva && tengoPasaporte);

            System.out.println("Hijo1: Montaña (true)/Playa(false)");
            boolean hijo1Montaña = sc.nextBoolean();

            System.out.println("Hijo2: Montaña (true)/Playa(false)");
            boolean hijo2Montaña = sc.nextBoolean();

            System.out.println("Hijo3: Montaña (true)/Playa(false)");
            boolean hijo3Montaña = sc.nextBoolean();

            boolean voyALaMontana = hijo1Montaña && hijo2Montaña && hijo3Montaña;

            boolean  voyALaPlaya = !voyALaMontana;

            System.out.println(voyALaPlaya ? "Vas a la playa" : "Vas a la montaña");

            //---------------------------------------------------------------------------

            boolean esPar = true;

            System.out.println(esPar ? "El numero es Par" : "El numero es Impar" );

            

        }
}
