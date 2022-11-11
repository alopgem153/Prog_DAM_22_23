package Bucles;

import java.util.Scanner;

public class NumeroSecreto {
    /*
     * EL programa genera un número aleatorio de 1 a 100
     * Debe preguntar por ese número e indicar si el numero generado es mayor o menor
     * 
     * Se termina cuando:
     * El usuario se rinde introduciendo -1
     * El usuario acierta el número.
     * 
     * Mejora:
     * Al terminar la partida pregunta ¿quieres jugar otra vez? (si/no)?
     * 
     * Si responde que no entonces muestra:
     *          Numero partidas ganadas
     *          Partida más rápida: xx numero introducidos 
     */

     public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        //JUEGO
        boolean seguirJugando = true;
        
        while(seguirJugando)
        { 
            //Partida

            //Genero numero Secreto
            int numeroSecreto = (int)((Math.random() * 100) + 1);

            

            System.out.println("Trata de adivinar el número secreto (-1 para rendirse)");

            int intento = sc.nextInt();
            boolean encontrado = false;


            while (intento != -1 && !encontrado)
            {

                if (intento < numeroSecreto)
                {
                    System.out.println("El numero secreto es mayor");
                }

                if (intento > numeroSecreto)
                {
                    System.out.println("El numero secreto es menor");
                }

                if (intento == numeroSecreto)
                {
                    
                //Actualizo la condición 2º
                    encontrado = true;
                }

                if (!encontrado)
                {
                    //Actualizo la condición 1º
                    System.out.println("Intentalo otra vez");
                    intento = sc.nextInt();
                }
        } //end While

        if (encontrado)
        {
            System.out.println("ENHORABUENA lo has Encontrado");
        }
     
        //limpio buffer
        sc.nextLine();

        //ACtualizo la condición del while del juego
        System.out.println("Quieres jugar otra vez?? (s/n)");
        String quiereSeguir = sc.nextLine();

        if (quiereSeguir.equals("n"))
        {
            seguirJugando = false;
        }


    } //END WHILE JUEGO

    sc.close();

    }
     
}
