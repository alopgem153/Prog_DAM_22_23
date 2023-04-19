import java.util.Scanner;

import utilCalculadora.Calculos;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos a probar como capturar excepciones");

        Calculos cal = new Calculos();

        int resultadoMultiplicacion = cal.multiplicacion(0, 6);

        int resultadoDivision = cal.division(100, resultadoMultiplicacion);

        System.out.println("Resultado: "+resultadoDivision);


        ///-----------------------------------------------------
        try 
        {
            int resultado2 =cal.division2(100, resultadoDivision);
            System.out.println("Resultado2 " +resultado2);
        }
        catch(ArithmeticException error)
        {
            System.out.println(error.getMessage());
        }

        Scanner sc = new Scanner(System.in);
        try {
            Double.valueOf("100");

            
            Double.valueOf("100.5");

            Double.valueOf("100,5");


             Integer.parseInt("fhgldfhsglh")
             Integer.valueOf(null)
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally
        {
            if (sc != null)
            {
                sc.close();
            }
            
        }
    }
}
