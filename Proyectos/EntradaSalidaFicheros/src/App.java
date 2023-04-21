import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Leemos un fichero de texto");

        FileReader fr = null;
        
        try 
        {
            fr = new FileReader("src/recursos/fichero.txt"); 
            //fr = new FileReader("/home/alfonso/Escritorio/fichero2.txt"); 


            int caracterLeido = fr.read();
            while(caracterLeido != -1)
            {
                System.out.print((char)caracterLeido);
                caracterLeido = fr.read();
            }

            System.out.println("Hemos llegado al final del fichero");
        }
        catch(IOException ioexception)
        {
            System.out.println("Fichero no encontrado");
        }
        finally
        {
            if (fr != null)
            {
                fr.close();
            }
        }


        //---------------------------------------------------
        System.out.println("-------------------------------------");
        // --- Trabajamos con BufferedReader ----------------

        BufferedReader bufferReader = null;
        try
        {
            fr = new FileReader("src/recursos/fichero.txt"); 
            bufferReader = new BufferedReader(fr);
            //Es equivalente
            //BufferedReader buufer = new BufferedReader(new FileReader("src/recursos/fichero.txt"));

            String lineaFichero = bufferReader.readLine();

            while(lineaFichero != null)
            {
                System.out.println(lineaFichero);
                lineaFichero = bufferReader.readLine();
            }

            System.out.println("Hemos llegado al final del fichero con bufferredREader");
        }
        catch(IOException ioExceptio)
        {
            System.out.println("BufferedReader: Fichero no encontrado");
        }
        finally
        {
            if (bufferReader != null)
            {
                bufferReader.close();
            }
        }


        //---------------------------------------------------
        System.out.println("-- Suma de números---------------");
        // --- Trabajamos con BufferedReader ----------------

        try
        {
            fr = new FileReader("src/recursos/ficheroNumeros.txt"); 
            bufferReader = new BufferedReader(fr);

            String lineaFichero = bufferReader.readLine();

            int total = 0;
            int numeroLinea = 1;
            while(lineaFichero != null)
            {
                total = 0;
                String[] lineaToceada = lineaFichero.split(" ");
                try 
                {
                    for (String trozo : lineaToceada) {
                        int numero = Integer.valueOf(trozo);
                        total += numero;
                    }
                    System.out.println("Total linea " + numeroLinea + ": " + total);
                }
                catch(Exception ex)
                {
                    System.out.println("Linea " + numeroLinea + " vacia");
                    total = 0;
                }
                finally
                {
                }
                lineaFichero = bufferReader.readLine();
                numeroLinea++;
            }

            System.out.println("Hemos llegado al final del fichero con bufferredREader");
        }
        catch(IOException ioExceptio)
        {
            System.out.println("BufferedReader: Fichero no encontrado");
        }
        finally
        {
            if (bufferReader != null)
            {
                bufferReader.close();
            }
        }

        

    }
}
