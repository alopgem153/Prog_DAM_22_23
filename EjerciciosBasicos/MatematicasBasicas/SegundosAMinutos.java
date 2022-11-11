package MatematicasBasicas;
import java.util.Scanner;


public class SegundosAMinutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el número de segundos:");
        int segundos = sc.nextInt();

        float minutos = segundos/60;

        System.out.println("está en el minuto " + Math.round(minutos));
        sc.close();
    }
}
