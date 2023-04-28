import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

import clases.LogPropio;
import clases.LogPropio.TipoMensaje;

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
            LogPropio.NuevaEntradaALog("Se ha leido fichero.txt ", TipoMensaje.INFORMACION);
        }
        catch(IOException ioexception)
        {
            System.out.println("Fichero no encontrado");
            LogPropio.NuevaEntradaALog("fichero no encontrado ", TipoMensaje.ERROR);
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
            //fr = new FileReader("src/recursos/fichero.txt"); 
            fr = new FileReader("src/recursos/ficheroAlumnos"); 
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
            fr = new FileReader("src/recursos/ficheroNumerosxx.txt"); 
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
            LogPropio.NuevaEntradaALog(ioExceptio.getMessage(), TipoMensaje.ERROR);
            LogPropio.NuevaEntradaALog(ioExceptio.toString(), TipoMensaje.ERROR);
        }
        finally
        {
            if (bufferReader != null)
            {
                bufferReader.close();
            }
        }


        //---------------------------------------------------
        System.out.println("-- Suma de números con Scanner---------------");
        // --- Trabajamos con BufferedReader y  Scanner ----------------
        try
        {
            fr = new FileReader("src/recursos/ficheroNumerosReales.txt"); 
            bufferReader = new BufferedReader(fr);

            //leo la primera linea del fichero
            String lineaFichero = bufferReader.readLine();

            //ddeclaro las variables que voy a necesitar
            Scanner sc = null;
            double total = 0;
            int numeroLinea = 1;

            while(lineaFichero != null)
            {

                try
                {
                    total = 0;
                    sc = new Scanner(lineaFichero).useLocale(Locale.US);
                    System.out.println("Linea: "+ numeroLinea + " = " + lineaFichero);

                    while(sc.hasNextDouble())
                    {
                        total += sc.nextDouble();
                    }

                    System.out.println("Total linea " + numeroLinea + ": " + total);

                }
                catch(Exception ex)
                {
                    System.out.println("Error de lectura en la linea: " + numeroLinea);
                }


                //Leo la siguiente línea 
                lineaFichero = bufferReader.readLine();
                numeroLinea++;
            }

            System.out.println("Hemos llegado al final del fichero");


        }
        catch(IOException ioException)
        {
            System.out.println(ioException.getMessage());
        }
        finally
        {
            if (bufferReader != null)
            {
                bufferReader.close();
            }
        }

        System.out.println("Fin suma numeros con Scanner");
        

        //---------------------------------------------------
        System.out.println("--------Lectura fichero Alumnos-----------------------------");
        

        try
        {
            
            fr = new FileReader("src/recursos/ficheroAlumnos"); 
            bufferReader = new BufferedReader(fr);
            //Es equivalente
            //BufferedReader buufer = new BufferedReader(new FileReader("src/recursos/fichero.txt"));
            int numeroLinea = 1;
            String lineaFichero = bufferReader.readLine();

            while(lineaFichero != null)
            {
                if (numeroLinea != 1)
                {
                    System.out.println(lineaFichero);
                    String[] trozos = lineaFichero.split("\t");
                    System.out.println(Arrays.toString(trozos));

                    double altura = Double.valueOf(trozos[2].replace(",", "."));
                    System.out.println(altura);
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



        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        System.out.println("-------  ESCRITURA EN FICHEROS    --------");
        System.out.println("------------------------------------------");

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try 
        {
            fileWriter = new FileWriter("src/recursos/salida.txt", true);

            fileWriter.append('f');

            

            // File newFile = new File("src/recursos/salida2.txt");
            // FileWriter fileWriter2 = new FileWriter("src/recursos/salida2.txt", true);
            // fileWriter2.append('f');
            // fileWriter2.close();

            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("HOLA");
            bufferedWriter.newLine();
            bufferedWriter.write(LocalTime.now().toString());

        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        finally
        {
            if(bufferedWriter != null)
            {
                //bufferedWriter.flush();
                bufferedWriter.close();
            }
            if (fileWriter != null)
            {
                fileWriter.close();
            }
        }

        

        System.out.println("Fin de escritura en fichero");

        EscrituraEnFichero();

        LogPropio.NuevaEntradaALog("FINAL programa", TipoMensaje.INFORMACION);



    }


    /**
     * Escribe un texto en un fichero de texto, linea a linea, 
     * las cuales leereas de teclado hasta que se introduzca la palabra fin.
     */
    public static void EscrituraEnFichero() 
    {
        Scanner sc = new Scanner(System.in);
        String nuevoFichero = "ficheroNuevo";
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src/recursos/"+nuevoFichero);
            bufferedWriter = new BufferedWriter(fileWriter);
            
            //Leo la primera linea
            System.out.println("Dime la primera linea:....");
            String linea = sc.nextLine();

            while(!linea.equals("fin"))
            {
                bufferedWriter.write(linea);
                bufferedWriter.newLine();
                System.out.println("Dime otra linea:....");
                linea = sc.nextLine();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        finally
        {
            try
            {
                if (bufferedWriter != null)
                {
                    bufferedWriter.close();
                }
                if (fileWriter != null)
                {
                    fileWriter.close();
                }
            }catch(IOException ioException)
            {
                System.out.println(ioException);
                
                LogPropio.NuevaEntradaALog(ioException.getLocalizedMessage(), TipoMensaje.ERROR);
                
            }
        }
        sc.close();


        

    }
}
