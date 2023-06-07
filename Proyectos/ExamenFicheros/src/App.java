import com.fasterxml.jackson.annotation.JsonFormat.Feature;

import clases.Ferreteria;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Ferreria!");

        Ferreteria ferreteria = new Ferreteria();


        System.out.println(ferreteria.getClientes());
        System.out.println("===============================");
        System.out.println(ferreteria.getProductos());
        System.out.println("===============================");
        System.out.println(ferreteria.getVentas());

        ferreteria.calculoFacturacionCliente();

        ferreteria.calculoProductosVendidos();
    }
}
