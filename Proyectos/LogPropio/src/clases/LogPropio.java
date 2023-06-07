package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogPropio {



    public enum TipoMensaje {ERROR, INFORMACION};


    public static void NuevaEntradaALog(String mensaje, TipoMensaje tipoMensaje)
    {
        String rutaAficheroLog = "src/log.txt";

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try 
        {
            fileWriter = new FileWriter(rutaAficheroLog, true);
            bufferedWriter = new BufferedWriter(fileWriter);

            

            String cadena = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME) 
                                + " - " + tipoMensaje.toString() 
                                + " - " + mensaje;
                                
            bufferedWriter.write(cadena);
            bufferedWriter.newLine();

        }
        catch(IOException ioException)
        {
            System.out.println(ioException.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
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
            }
            catch(IOException ioException)
            {
                System.out.println(ioException);
            }
        }

    }

    
    
}
