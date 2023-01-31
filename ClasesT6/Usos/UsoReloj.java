package ClasesT6.Usos;

import java.util.Scanner;

import ClasesT6.Ejemplos.Horas;

public class UsoReloj {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique una hora");
        int hora = sc.nextInt();

        System.out.println("Indique un numero de segundos");
        int segundos = sc.nextInt();

        Horas horas = new Horas(hora);  
        
        for (int i = 0; i <= segundos; i++) 
        {
            System.out.println(horas.impresion());
            horas.addSegundo();    
        }
        System.out.println("-FIN-");
    }
}
