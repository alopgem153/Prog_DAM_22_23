public class ClaseMath {
    public static void main(String[] args) {
        //ABS
        System.out.println(Math.abs(-3));

        //Min y Max
        double num1 = 12.35634;
        double num2 = 12.356234; 
        double num3 = 12.6234;

        double minimo = Math.min(num1, num2);
        minimo = Math.min(minimo, num3);
        System.out.println("El minimo es: " + minimo);

        double maximo = Math.max(num1, num2);
        System.out.println("El maximo es: " + maximo);

        //Potencia - pow
        System.out.println("2 elevado a 4 = " +Math.pow(2, 4));
        System.out.println("15 elevado a 5000 = " +Math.pow(15, 5000));

        //Redondeo - round
        System.out.println(num1 + " -> " + Math.round(num1));
        System.out.println(num3 + " -> " + Math.round(num3));

        System.out.println(num1 + " floor ->" + Math.floor(num1));
        System.out.println(num3 + " floor ->" + Math.floor(num3));

        System.out.println(num1 + " ceil ->" + Math.ceil(num1));
        System.out.println(num3 + " ceil ->" + Math.ceil(num3));

        //Aleatorio - random - entre 0 y 1
        System.out.println(Math.random());

        //entre 0 y 100
        System.out.println(Math.random()*100);

        //entre 50 y 100
        System.out.println((Math.random()*(100-50)+(100-50)));

        System.out.println(Math.PI);


        /*
         * Hacer programa que pida un numero de segundos y nos indique 
         * en que minuto estamos.
         */

    }
}
