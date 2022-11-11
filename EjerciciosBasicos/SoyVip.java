import java.util.Scanner;

public class SoyVip {
    public static void main(String[] args) {
        /*
         * Diseñar el algoritmo que indique el tipo de usuario 
         * (normal o vip) que eres de una discoteca, según una serie de 
         * premisas. Para ser vip debes de ser socio y haber pagado 
         * las cuotas. También puedes ser vip si estás recomendado por 
         * otro usuario vip y además estás dentro del periodo de prueba.
         * El programa debe preguntar si el usuario es usuario vip, 
         * si tiene las cuotas al día, si está recomendado 
         * por alguien vip y si está dentro del periodo de prueba.  
         * Indicando si por pantalla si el usuario es vip o no.
         */

         Scanner puerta = new Scanner(System.in);

         System.out.println("¿eres VIP?");
         boolean esVip = puerta.nextBoolean();

         System.out.println("¿Tienes las cuotas al día?");
         boolean cuotasAlDia = puerta.nextBoolean();

         System.out.println("¿Estas recomendado?");
         boolean recomendado = puerta.nextBoolean();


         System.out.println("¿Estas en periodo de prueba?");
         boolean enPrueba = puerta.nextBoolean();

        puerta.close();

        boolean soyVip = (esVip && cuotasAlDia) || (recomendado && enPrueba);

        String mensaje = soyVip ? "ERES VIP, entra!!!" : "FUERA DE AQUÍ, ALIMAÑA!!";

        System.out.println(mensaje);
         
    }
}
