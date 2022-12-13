package Funciones;

import java.util.Random;

public class PartidoBaloncesto {
    
    //Variables de los equipos
    final static int E1_ACIERTO_2 = 70;
    final static int E2_ACIERTO_2= 75;
 
    final static int E1_ACIERTO_3 = 45;
    final static int E2_ACIERTO_3 = 35;
 
    final static int E1_JUEGA_DE_2 = 60;
    final static int E2_JUEGA_DE_2 = 70;
 
    final static int E1_REBOTE_DEF = 60;
    final static int E1_REBOTE_ATA = 30;
 
    final static int E2_REBOTE_DEF = 70;
    final static int E2_REBOTE_ATA = 40;


    public static void main(String[] args) {
        
        int puntosE1 = 0;
        int puntosE2 = 0;

        System.out.println("Empieza la simulación del partido de baloncesto");

        //salto Inicial
        String turno  = salto();
        System.out.println("Ataca el equipo: " + turno);

        //Un partido de baloncesto hay unas 150 posesiones de media.
        for(int posesion = 0; posesion < 150; posesion++)
        {
            int valorAtaque = canasta(turno);
            

            //Si hay canasta entonces el turno es del equipo que estaba defendiendo
            if (valorAtaque>0)
            {
                if (turno.equals("E1"))
                {
                    puntosE1 = actualizarPuntos(puntosE1, valorAtaque);
                }
                else
                {
                    puntosE2 = actualizarPuntos(puntosE2, valorAtaque);
                }

                System.out.println("Canasta de " + turno + " - de " + valorAtaque + " puntos");
                imprimirResultado(puntosE1, puntosE2);
                turno = siguienteTurno(turno);
                System.out.println("Ataca el equipo: " + turno);
            }
            else 
            {
                //no hay canasta, se  produce un rebote
                turno = rebote(turno);
                System.out.println("Rebote del equipo: " + turno);
            }

            //Si en la ultima posesión hay empate entonces añado 50 posesiones mas
            if(posesion== 149 && puntosE1 == puntosE2)
            {
                System.out.println(" --- PRORROGA ---");
                posesion = 100;
            }
        } //End For
        System.out.println("-------------------------");
        System.out.println("FIN de partido");
        imprimirResultado(puntosE1, puntosE2);


    }



        //Funciones que necesito programar
        /*
        salto() --> devuelve E1 si el salto lo gana E1 y E2 si el salto lo gana E2
       imprimirResultado rebote(String equipoAtaque) ---> devuelve E1 si el rebote lo gana E1 y E2 si el rebote lo gana E2
        rebote(int reboteAtaque, int reboteDefensa) ---> indica true si el rebote es de ataque y false si el rebote es de defensa
              El rebote del equipo atacante es de 0 a maximo y el rebote del equipo que defiende es de 30 al maximo.
        aleatorio(maximo)--> devuelve un numero aleatorio entre 0 y maximo
        aleatorio(minimo, maximo) ---> devuelve un número entre mínimo y máximo
        imprimirResultado(int valor1, int valor2) ---> imprime el resultado actual del partido.
        */

        static String rebote(String turno)
        {
            String resultado = turno;
            
            boolean rebAtaque = false;

            if (turno.equals("E1"))
            {
                rebAtaque = rebote(E1_REBOTE_ATA, E2_REBOTE_DEF);
                
            }
            else //turno de ataque es de E2
            {
                rebAtaque = rebote(E2_REBOTE_ATA, E1_REBOTE_DEF);
            }

            if(!rebAtaque)
            {
                resultado = siguienteTurno(turno);
            }

            return resultado;
        }

        /**
         * Devuelve true si hay rebote en ataque y false si hay rebote en defensa
         *  El rebote del equipo atacante es de 0 a maximo y el rebote del equipo que defiende es de 30 al maximo.
         * @param porcentajeAtaque
         * @param porcentaDefensa
         * @return
         */
        static boolean rebote(int porcentajeAtaque, int porcentaDefensa)
        {
            int reboteAtaque = aleatorio(porcentajeAtaque);
            int reboteDefensa = aleatorio(30, porcentaDefensa);

            return (reboteAtaque > reboteDefensa);
        }

        static String siguienteTurno(String turnoAnterior)
        {
            String turnoSiguiente = "E1";
            if (turnoAnterior.equals("E1"))
            {
                turnoSiguiente = "E2";
            }

            return turnoSiguiente;
        }

        static void imprimirResultado(int valor1, int valor2)
        {
            System.out.println("---------------------");
            System.out.println("  E1= " + valor1 + "- E2= " + valor2);
            System.out.println();

        }

        static int actualizarPuntos(int valorInicial, int incremento)
        {
            return valorInicial + incremento;
        }

        /**
         * devuelve E1 si el salto lo gana E1 y E2 si el salto lo gana E2
         * @return
         */
        static String salto()
        {
            String resultado = "E1";

            int numero = aleatorio(100);
            if (numero>=50)
            {
                resultado = "E2";
            }
            return resultado;
        }

        /**
         * devuelve un numero aleatorio entre 0 y maximo
         * @param maximo
         * @return
         */
        static int aleatorio(int maximo)
        {
            //return (int)Math.random()*maximo;
            return aleatorio(0, maximo);
        }

        /**
         * devuelve un número entre mínimo y máximo
         * @param minimo
         * @param maximo
         * @return
         */
        static int aleatorio(int minimo, int maximo)
        {
            return (int)(Math.random()*(maximo-minimo)+ minimo);
        }

        /**
         * devuelve el valor de la canasta realizada (0, 2 o 3) 
         * @param turno
         * @return
        */
        static int canasta(String turno)
        {
            //presuopnemos que no hay canasta
            int resultado = 0;
            int tipoTiro = 2;

            tipoTiro = tipoTiro(turno);

            if(turno.equals("E1"))
            {
                if(tipoTiro == 2)
                {
                    resultado = canasta(2, E1_ACIERTO_2 );
                }
                else if (tipoTiro == 3)
                {
                    resultado = canasta(3, E1_ACIERTO_3);
                }

            }
            else //turno es E2
            {
                if(tipoTiro == 2)
                {
                    resultado = canasta(2, E2_ACIERTO_2 );
                }
                else if (tipoTiro == 3)
                {
                    resultado = canasta(3, E2_ACIERTO_3);
                }
            }


            return resultado;
        }


        /**
         * Devuelve "valor" si el aleatorio esta dentro del porcentaje y devuelve 0 si el aleatorio no está dentro
         * @param valor
         * @param porcentajeAcierto
         * @return
         */
        static int canasta(int valor, int porcentajeAcierto)
        {
            int resultado = valor;

            int random = aleatorio(100);

            if (random > porcentajeAcierto)
            {
                //entonces no la he metido en la canasta- fallo 
                resultado = 0;
            }

            return resultado;

        }

        /**
         * Devuelve el tipo de tiro (2 o 3) según el equipo que tiene el turno
         * @param turno
         * @return
         */
        static int tipoTiro(String turno)
        {
            int tipoTiro = 2;

            if(turno.equals("E1"))
            {
                tipoTiro = tipoTiro(E1_JUEGA_DE_2);
            }
            else //Turno es E2
            {
                tipoTiro = tipoTiro(E2_JUEGA_DE_2);
            }

            return tipoTiro;
            
        }

        /**
         * Devuelve el tipo de tiro según el porcentaje de la elección de tiro del equipo
         * @param porcentaje2
         * @return
         */
        static int tipoTiro(int porcentaje2)
        {
            int tipoTiro = 2;

            int random = aleatorio(100);

            if (random >= porcentaje2)
            {
                tipoTiro = 3;
            }

            return tipoTiro;

        }
    
}