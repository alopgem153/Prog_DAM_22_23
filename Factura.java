import java.util.Scanner;

public class Factura {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        
        /*
         * esto es un ciomentario muy largo
         * y que tiene varia linea
         */

        final int IVA = 21;

        //Pregunto por la base de la factura
        System.out.println("Introduzca la base de la factura y pulse ENTER");

        Scanner sc = new Scanner(System.in);

        float cantidadBase =sc.nextFloat();

        //Cálculo  del total del iva de factura
        
        float totalIVA = (cantidadBase / 100) * IVA;

        float totalFactura = cantidadBase + totalIVA;

        System.out.println("El total de la factura es " + totalFactura + "€");
        
        sc.close();

        System.out.printf("El total de la factura es %.2f \n", totalFactura);
        String cadena = "EDAD";
        System.out.printf("%-10s - esto es una cadena \n ", cadena);

        System.out.println("4 \\ 2 = 2");
        System.out.println("Tu nombre es \"JUAN\" ");

    }
}
