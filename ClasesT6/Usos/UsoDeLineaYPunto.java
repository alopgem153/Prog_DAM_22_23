package ClasesT6.Usos;

import ClasesT6.Ejemplos.Linea;
import ClasesT6.Ejemplos.Punto;

public class UsoDeLineaYPunto {

    public static void main(String[] args) {
        
        Punto p1 = new Punto(4.21, 7.3);
        Punto p2 = new Punto(-2, 1.66);
        Linea l = new Linea(p1, p2);

        System.out.println(l);
        //Línea formada por los puntos (4.21, 7.3) y (-2.0, 1.66)
    }
    
}
