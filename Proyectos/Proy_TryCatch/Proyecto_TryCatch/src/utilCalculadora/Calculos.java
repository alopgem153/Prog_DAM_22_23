package utilCalculadora;

public class Calculos {

    public int division(int x, int y)
    {
        int resultado = 0;

        try 
        {
            resultado = (x / y);

            System.out.println("DESPUES DE DIVISION");
        }
        catch (ArithmeticException errorAritmetico)
        {
            System.out.println("No puedes dividir por 0 - " + errorAritmetico.getMessage() 
                        + " " + errorAritmetico.getCause());

            System.out.println(errorAritmetico);
        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }
        finally
        {
            System.out.println("Finally");
            
        }

        
        return resultado;
    }

    public int division2 (int x, int y) throws ArithmeticException
    {
        return x / y;
    }

    public int multiplicacion(int x, int y)
    {
        return (x * y);
    }
    
}
