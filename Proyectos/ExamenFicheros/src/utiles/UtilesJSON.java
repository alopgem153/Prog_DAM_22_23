package utiles;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import modelos.Cliente;
import modelos.Venta;

public class UtilesJSON {

    public static List<Cliente> leerFicheroClientes() {
        List<Cliente> resultado = new ArrayList<>();

        String path = "src/recursos/clientes.json";

        try {
            File fichero = new File(path);

            ObjectMapper mapper = new ObjectMapper();

            resultado = mapper.readValue(fichero, new TypeReference<List<Cliente>>() {});


        } catch (Exception e) {
            System.out.println("Ocurrio un error en leerFicheroClientes " + e);
        }

        return resultado;
    }
    


    public static List<Venta> leerFicheroVentas()
    {
        String path = "src/recursos/ventas.json";

        List<Venta> ventas = new ArrayList<>();

        try {
            
            File fichero = new File(path);

            ObjectMapper mapper = new ObjectMapper();

            ventas = mapper.readValue(fichero, new TypeReference<List<Venta>>() { });

        } catch (Exception e) {
            System.out.println("Error al leer fichero de ventas " + e);
        }


        return ventas;
    }
}
