package ClasesT6.Usos;

import ClasesT6.Ejemplos.SintonizadorFM;

public class UsoRadio {

    public static void main(String[] args) {
      
        SintonizadorFM a, b;
 
 
        a = new SintonizadorFM(107);
 
 
        a.up(); a.up(); a.up(); a.up(); //subo a 2 MHz
        a.display(); //debe mostrar 80.5;
 
 
        b = new SintonizadorFM(80.5);
 
 
        b.down(); b.down(); b.down(); //bajamos 1.5 MHz
        b.display(); //debe mostrar 107.5;
 
 
        a = new SintonizadorFM(200); //frecuencia fuera de rango debe reajustarse;
        a.display(); //debe mostrar 108.0 MHz
 
 
    }
 
    
}
