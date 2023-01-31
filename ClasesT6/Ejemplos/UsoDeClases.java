package ClasesT6.Ejemplos;

public class UsoDeClases {
    
    public static void main(String[] args) {
        
        //Usamos la clase cuentacorriente
        CuentaCorriente cc_Pepe = new CuentaCorriente("111111-A", "Pepe");
        CuentaCorriente cc_Laura = new CuentaCorriente("3333333-L", "Laura", 500.0);
        CuentaCorriente cc_Maria = new CuentaCorriente("4444444-B", 1000.0);

        cc_Pepe.mostrarInformacion();
        cc_Laura.mostrarInformacion();
        cc_Maria.mostrarInformacion();

        cc_Maria.nombreTitular = "Maria2";

        cc_Pepe.ingresarDinero(25.40);
        cc_Maria.sacarDinero(375.0, "4444444-B");
        cc_Laura.sacarDinero(1000, " 356476");

        double saldoPepe = cc_Pepe.ObtenerSaldo();
        cc_Pepe.IngresarSaldo(100);

        
        //cc_Maria.saldo = 100;

        cc_Pepe.mostrarInformacion();
        cc_Laura.mostrarInformacion();
        cc_Maria.mostrarInformacion();

        System.out.println("Gestor de PEPE: "+  cc_Pepe.obtenerNombreGestor());

        System.out.println("------------------------------------------");

        Gestor gestor1 = new Gestor("Gestor_1", "555-123");
        cc_Pepe.setGestor(gestor1);
        cc_Laura.setGestor(gestor1);
        System.out.println("Gestor de PEPE: "+  cc_Pepe.obtenerNombreGestor());
        System.out.println("Gestor de Laura: "+  cc_Pepe.obtenerNombreGestor());

        cc_Laura.getGestor().setNombre("Gestor2");
        Gestor g = cc_Laura.getGestor();
        g.setNombre("Gestor_3");

        System.out.println("Gestor de PEPE: "+  cc_Pepe.obtenerNombreGestor());
        System.out.println("Gestor de Laura: "+  cc_Pepe.obtenerNombreGestor());

    }
}
