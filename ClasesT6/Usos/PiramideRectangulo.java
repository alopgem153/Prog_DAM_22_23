package ClasesT6.Usos;

import ClasesT6.Ejemplos.Piramide;
import ClasesT6.Ejemplos.Rectangulo;

public class PiramideRectangulo {
    
    public static void main(String[] args) {
        
        Piramide p = new Piramide(4);
        Rectangulo r1 = new Rectangulo(4, 3);
        Rectangulo r2 = new Rectangulo(6, 2);
        Piramide p2 = new Piramide(3);
        
        System.out.println(p);
        System.out.println(r1);
        System.out.println(r2);
        
        System.out.println("Pirámides creadas: " + Piramide.getPiramidesCreadas());
        System.out.println("Rectángulos creados: " + Rectangulo.getRectangulosCreados());
    }
}
