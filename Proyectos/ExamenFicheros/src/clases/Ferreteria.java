package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.Cliente;
import modelos.Linea;
import modelos.Producto;
import modelos.Venta;
import utiles.UtilesJSON;
import utiles.UtilesTXT;

public class Ferreteria {
    
    private List<Cliente> clientes;
    private List<Producto> productos;
    private List<Venta> ventas;

    public Ferreteria()
    {
        clientes = UtilesJSON.leerFicheroClientes();

        filtrarClientes();

        productos = UtilesTXT.leerFicheroProductos();

        ventas = UtilesJSON.leerFicheroVentas();
        
        filtrarLineasVenta();

    }

    /**
     * Quita las linea de venta de productos 
     * que no tengo dados de alta (no estan en productos)
     */
    private void filtrarLineasVenta() 
    {
        for (Venta venta : ventas) 
        {
            List<Linea> lineasFiltradas = new ArrayList<>();
            for (Linea linea : venta.getLineas()) {
                int codigoProductoActual = linea.getCodigoProducto();

                Producto pBuscado = buscarProductoByCodigo(codigoProductoActual);

                if (pBuscado != null)
                {
                    lineasFiltradas.add(linea);
                }
                else
                {
                    System.out.println("No se incluye la linea del producto "+ codigoProductoActual + "porque no existe ese codigo de producto");
                }
            }
            venta.setLineas(lineasFiltradas);
        }
    }

    private Producto buscarProductoByCodigo(int codigoProductoActual) {
        
        Producto pBuscado = null;

        for (Producto p : productos) {
            if (p.getCodigo()== codigoProductoActual)
            {
                pBuscado = p;
            }
        }

        return pBuscado;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    private void filtrarClientes()
    {
        List<Cliente> listaFiltrada = new ArrayList<>();

        for (Cliente cliente : clientes) 
        {
            if (!listaFiltrada.contains(cliente))
            {
                listaFiltrada.add(cliente);
            }    
        }

        clientes = listaFiltrada;
    }


    /**
     * calcula lo que cada cliente se ha gastado en la ferreteria en total 
     * y crea un fichero con dicha información
     */
    public void calculoFacturacionCliente() {

        Map<String, Double> dicClienteGasto = new HashMap<>();

        for (Cliente cliente : clientes) 
        {
            Double totalVendidoCliente = 0.0;
            //por cada cliente recorro las ventas buscando ventas suyas
            for (Venta venta : getVentas()) 
            {
                if (venta.getCodigoCliente().equals(cliente.getCodigo()))
                {
                    for (Linea linea : venta.getLineas()) 
                    {
                        Producto p = buscarProductoByCodigo(linea.getCodigoProducto());
                        totalVendidoCliente += (p.getPrecio() * linea.getCantidad());    
                    }
                }    
            } 
            
            dicClienteGasto.put(cliente.getNombre(), totalVendidoCliente);
        }

        crearFicheroGastoCliente(dicClienteGasto);

        crearFicheroVentasTotal(dicClienteGasto);
    }

    private void crearFicheroVentasTotal(Map<String, Double> dicClienteGasto) 
    {
        Double total = 0.0;

        for (Double valor : dicClienteGasto.values()) 
        {
            total += valor;    
        }

        crearFichero("src/recursos/TotalFacturado.txt", "TOTAL facturado= "+ total);
    }

    private void crearFichero(String path, String cadenaTotal)
    {
        try (FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw)) 
        {
            bw.write(cadenaTotal);    
        } catch (Exception e) {
            System.out.println("Error al crear el fichero " + path +" " +  e);
        }
    }

    private void crearFicheroGastoCliente(Map<String, Double> dicClienteGasto) 
    {
        //cremos el fichero
        String path = "src/recursos/ClientesFacturacion.txt";

        try (FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw)) 
        {
            
            for (String nombreCliente : dicClienteGasto.keySet()) 
            {
                String cadena = nombreCliente + " = "+ dicClienteGasto.get(nombreCliente);
                
                bw.write(cadena);
                bw.newLine();
            }

        } catch (Exception e) {
            System.out.println("Ocurrio un error en la escritura del fichero "+ path);
        }
    }

    public void calculoProductosVendidos() 
    {
        String cadenaTexto = "";
        Map<String, Integer> dicProductoCantidad = new HashMap<>();

        for (Producto prod : productos) 
        {
            int cantidad = 0;
            int codigoProd = prod.getCodigo();
            for (Venta venta : ventas) 
            {
                for (Linea linea : venta.getLineas()) 
                {
                    if (linea.getCodigoProducto().equals(codigoProd))
                    {
                        cantidad += linea.getCantidad();
                    }    
                }    
            }
            // if (dicProductoCantidad.containsKey(prod.getNombre()))
            // {
            //     dicProductoCantidad.put(prod.getNombre(), dicProductoCantidad.get(prod.getNombre())+cantidad);
            // } 
            // else
            // {
            //     
            // }
            dicProductoCantidad.put(prod.getNombre(), cantidad);
            
        }

        for (String productoNombre : dicProductoCantidad.keySet()) 
        {
            cadenaTexto += productoNombre + " -> " +dicProductoCantidad.get(productoNombre) + "\n";
        }
        
        crearFichero("src/recursos/ProductosVendidos.txt", cadenaTexto);
    }
}
