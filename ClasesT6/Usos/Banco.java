package ClasesT6.Usos;

import ClasesT6.Ejemplos.CuentaCorriente;

public class Banco {
    
    public static void main(String[] args) {
        
        CuentaCorriente cc1 =  new CuentaCorriente("77777", "Kiliam");

        cc1.ingresarDinero(50);
        //cc1.sacarDinero(12);

        cc1.nombreTitular = "Kiko";
        cc1.mostrarInformacion();

    }
}
