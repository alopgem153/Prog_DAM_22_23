package interfaces.negocio_ejemplo;

import java.util.Arrays;

public class UsandoNegocio {

    public static void main(String[] args) {
        
    
        Cliente c1 = new Cliente("Pepe", 55.5, 50);
        Cliente c2 = new Cliente("Mario", 20, 35);
        Cliente c3 = new Cliente("Kilian", 10, 18);
        Cliente c4 = new Cliente("Leo", 34, 26);
        Cliente c5 = new Cliente("Laura", 3, 15);
        Cliente c6 = new Cliente("Alfonso", 20, 45);
        
        Ferreteria ferreteriaGonzalez = new Ferreteria("FERRETERIA_GONZALEZ");

        ferreteriaGonzalez.abrir();

        ferreteriaGonzalez.cobrar(); // no hay nadie en la cola

        ferreteriaGonzalez.ponerEnCola(c1);
        ferreteriaGonzalez.ponerEnCola(c2);
        ferreteriaGonzalez.ponerEnCola(c3);
        ferreteriaGonzalez.ponerEnCola(c4);
        ferreteriaGonzalez.ponerEnCola(c5);
        ferreteriaGonzalez.ponerEnCola(c6);


        Cliente[] colaCliente = ferreteriaGonzalez.getCola();

        System.out.println(Arrays.toString(colaCliente));

        Arrays.sort(colaCliente);

        System.out.println(Arrays.toString(colaCliente));

        ClienteComparatorEdad comparador = new ClienteComparatorEdad();
        Arrays.sort(colaCliente,comparador);
        //Arrays.sort(colaCliente,new ClienteComparatorEdad());

        System.out.println(Arrays.toString(colaCliente));

        //ordenacion por el mayor dinero gastado a menor con un Comparator


        // int[] arrayNumeros = { 4, 6, 2, 9, 1, 5};

        // Arrays.sort(arrayNumeros);
        // System.out.println(Arrays.toString(arrayNumeros));

        // ferreteriaGonzalez.cobrar(); // cobramos a c1

        // System.out.println("Dinero en caja: " + ferreteriaGonzalez.getDineroEnCaja());

        // System.out.println("Impuestos que debe pagar: " + ferreteriaGonzalez.pagarImpuestos());


        

    }
}
