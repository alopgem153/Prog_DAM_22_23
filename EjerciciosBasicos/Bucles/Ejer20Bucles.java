package Bucles;

public class Ejer20Bucles {
    public static void main(String[] args) {
        /*
        Realiza un programa que pinte una pirámide hueca por pantalla. 

        Altura 4

           *
          * *
         *   *    
        ******* 

         */

        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int alturaIntroducida = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el carácter de relleno: ");
        String relleno = System.console().readLine();
        
        int altura = 1;  
        int espaciosPorDelante = alturaIntroducida - 1;
        int espaciosInternos = 0;

        while (altura < alturaIntroducida) 
        {
            // inserta espacios delante
            for (int i = 1; i <= espaciosPorDelante; i++) 
            {
                System.out.print(" ");
            }
            // pinta la línea
            System.out.print(relleno);

            //Poner espacios internos
            for (int i = 1; i < espaciosInternos; i++) 
            {
                System.out.print(" ");
            }
            
            if (altura>1) 
            {
                System.out.print(relleno);
            }
            
            //salto de linea
            System.out.println();

            altura++;
            espaciosPorDelante--;
            espaciosInternos += 2;
        } // while ////////////////////////////
        
        // base de la pirámide
        for (int i = 1; i < altura*2; i++) 
        {
            System.out.print(relleno);
        }
            
    }


    
}
