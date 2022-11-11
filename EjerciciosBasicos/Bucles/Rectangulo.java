package Bucles;

import java.util.Scanner;

public class Rectangulo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Altura del rectángulo");
        int altura = sc.nextInt();


        System.out.println("Anchura del rectángulo");
        int anchura = sc.nextInt();

        for(int contadorAltura = 0; contadorAltura < altura; contadorAltura++)
        {
            for(int contadorAnchura = 0; contadorAnchura<anchura; contadorAnchura++)
            {
                System.out.print("x");
            }
            //salto de linea
            System.out.println("");
        }
    }
    
}
