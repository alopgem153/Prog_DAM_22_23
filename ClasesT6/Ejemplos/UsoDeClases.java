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

        
        //cc_Maria.saldo = 100;

        cc_Pepe.mostrarInformacion();
        cc_Laura.mostrarInformacion();
        cc_Maria.mostrarInformacion();



    }
}
