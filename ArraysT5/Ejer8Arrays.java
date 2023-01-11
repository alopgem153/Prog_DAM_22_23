package ArraysT5;

import java.util.Scanner;

public class Ejer8Arrays {
    
    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {
        
        double[] temperaturaMeses = new double[12];
        String[] meses = { "Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Octubre", "Nov", "Dic"};

        leerTemperaturasMedias(temperaturaMeses, meses);

        imprimirTemperaturas(temperaturaMeses, meses);
    }

    static void leerTemperaturasMedias(double[] temperaturas, String[] meses)
    {
        for (int i = 0; i < meses.length; i++) {
            double temperatura = PreguntarTemperatura(meses[i]);
            temperaturas[i] = temperatura;
        }

    }

    static double PreguntarTemperatura(String mes)
    {
        System.out.println("Dime la temperatura media de " + mes+"...");
        double temp = sc.nextDouble();
        return temp;
    }

    static void imprimirTemperaturas(double[] temperaturas, String[] meses)
    {
        for (int i = 0; i < meses.length; i++) 
        {
            System.out.print(meses[i]+ "(" + temperaturas[i] + "): \t");
            PintarAsteriscos(temperaturas[i]);    
            System.out.println();
        }
    }

    static void PintarAsteriscos(double temperatura)
    {
        int temp = (int)temperatura;
        for (int i = 0; i < temp; i++) {
            System.out.print("*");
        }
    }


}
