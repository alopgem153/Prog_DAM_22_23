package utiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import modelos.Producto;

public class UtilesTXT {

    public static List<Producto> leerFicheroProductos()
    {
        List<Producto> listaProductos = new ArrayList<>();

        String path = "src/recursos/productos.csv";

        try (FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr) ) 
        {
            String linea = br.readLine();
            
            while (linea != null)
            {
                try {
                    String[] trozos = linea.split(";");

                    Integer codigo = Integer.valueOf(trozos[0]);
                    String nombre = trozos[1];
                    String desc = trozos[2];
                    Double precio = Double.valueOf(trozos[3]);
                    Integer stock = Integer.valueOf(trozos[4]);

                    if (stock == 0)
                    {
                        throw new ExcepcionProductoSinStock(codigo, nombre);
                    }
                    else
                    {
                        Producto p = new Producto(codigo, nombre, desc, precio, stock);

                        listaProductos.add(p);
                    }

                } catch (ExcepcionProductoSinStock e) {
                    System.out.println(e.getMessage());

                } catch (Exception e) {
                    System.out.println("Error al leer la linea "+ linea + " " + e.getMessage());
                }

                linea = br.readLine();
            }

        } catch (Exception e) {
            // TODO: handle exception
        }


        return listaProductos;
    }
    
}
