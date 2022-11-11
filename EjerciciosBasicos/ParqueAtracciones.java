import java.util.Scanner;

public class ParqueAtracciones {
        public static void main(String[] args) {
            /*
             * Empresa de un parque de atracciones quiere una aplicación 
             * que les ayude al cobro de entradas a las familias 
             * que sacan las entradas.
             * Existen las entradas infantiles a 15,50€ y de adultos a 20€.
             * En caso de que el importe 
             * sea mayor a 100€ se aplicará un descuento del 5%.
             */

             final float ENTRADA_INFANTIL = 15.5f;
             final float ENTRADA_ADULTO = 20f;

             Scanner sc = new Scanner(System.in);

             System.out.println("Nº entradas de adultos?");
             int entradasAdultos = sc.nextInt();

             System.out.println("Nº entradas infantiles?");
             int entradasInfantiles = sc.nextInt();

             float precioTotal = ENTRADA_ADULTO * entradasAdultos + ENTRADA_INFANTIL * entradasInfantiles;

             precioTotal = (precioTotal > 100) ? precioTotal - precioTotal*0.05f : precioTotal;

            System.out.println("Tiene que pagar= " + precioTotal);

            sc.close();

             
        }
}
