package Bucles;

import java.util.Scanner;

public class TandaPenaltis {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //VARIABLES
        int golesJugador = 0;
        int golesCPU = 0;

        String resultadoPenaltisJugador = "- - - - -";
        String resultadoPenaltisCPU = "- - - - -";

        int turno = 10;
        //si el turno es par: tira el jugador
        //si el turno es impar: el jugador intenta parar

        //leer nombre de los equipos
        System.out.println("¿Como se llama el equipo1?");
        String equipo1 = sc.nextLine();

        System.out.println("¿Como se llama el equipo 2?");
        String equipo2 = sc.nextLine();

        //bucle para la tanda de penalties (while / do-while)
        //Mientras queden turnos y no haya empate
        while(turno>0 || golesCPU == golesJugador)
        {
            //Para cada turno tendremos:

            //pintar resultado penaltis
            System.out.println(equipo1 + ": " + resultadoPenaltisJugador + "(" + golesJugador + ")");
            System.out.println(equipo2 + ": " + resultadoPenaltisCPU + "(" + golesCPU + ")");

            //Eleccion CPU (le toque tirar o parar tiene que decidir entre 3)
            int eleccionNumericaCPU = (int)(Math.random()*3);
            String eleccionCPU = "";
            switch (eleccionNumericaCPU)
            {
                case 0:
                    eleccionCPU = "I";
                    break;
                case 1: 
                    eleccionCPU = "D";
                    break;
                case 2: 
                    eleccionCPU = "C";
                    break;
                default:
                    //no haria falta pero me curo en salud
                    eleccionCPU = "I";
                    break;
            }


            //Eleccion entre Tirar o detener del jugador 1
            if (turno%2 == 0)
            {
                //le toca tirar
                
                //eleccion de tiro
                System.out.println("¿Hacia donde lazas  I, D, C?");
                String direccionTiro = String.valueOf(sc.nextLine().toUpperCase().charAt(0));
                
                int posibilidadTirarMal = (int)(Math.random()*10);

                //resultado tiro
                //Si la posibilidad es mayor a 2 y la direccion no es igual a la parada -> hay gol
                if (posibilidadTirarMal > 2 && !direccionTiro.equals(eleccionCPU))
                {
                    System.out.println("-GOL-");
                    //gol jugador
                    golesJugador++;

                    //calculo la nueva cadena de resultados de penalties
                    resultadoPenaltisJugador = resultadoPenaltisJugador.replaceFirst("-", "X");

                }
                else
                {
                    //NO Gol
                    System.out.println("-Parada-");
                    //calculo la nueva cadena de resultados de penalties
                    resultadoPenaltisJugador = resultadoPenaltisJugador.replaceFirst("-", "O");
                }
            } else //es turno par
            {
                //le toca parar
                    //eleccion de portero

                    System.out.println("¿Hacia donde intentas parar I, D, C?");
                    String direccionParada = String.valueOf(sc.nextLine().toUpperCase().charAt(0));
                
                    //eleccion cpu tiro
                    int posibilidadTirarMal = (int)(Math.random()*10);

                    //resultado parada
                    if (posibilidadTirarMal > 2 && !direccionParada.equals(eleccionCPU))
                    {
                        //gol CPU
                        System.out.println("-GOL-");

                        golesCPU++;

                        //calculo la nueva cadena de resultados de penalties
                        resultadoPenaltisCPU = resultadoPenaltisCPU.replaceFirst("-", "X");

                    }
                    else
                    {
                        System.out.println("parada");
                        resultadoPenaltisCPU = resultadoPenaltisCPU.replaceFirst("-", "O");
                    }
            }

            //Decremento el turno
            turno--;

            if (turno == 0 && golesCPU == golesJugador)
            {
                //Si es el final de los 10 penaltis y hay empate entonces
                //añado 2 penaltis mas
                //y añado al string de resultado un guion - al final 
                turno = turno + 2;

                resultadoPenaltisJugador += " -";
                resultadoPenaltisCPU += " -";
            }

        }
        //muestra el resultado final de quien gana
        System.out.println();
        System.out.println("-------------------------");
        if (golesJugador>golesCPU)
        {
            System.out.println("GANA " + equipo1);
        }
        else
        {
            System.out.println("GANA " + equipo2);
        }

        sc.close();
    }
}
