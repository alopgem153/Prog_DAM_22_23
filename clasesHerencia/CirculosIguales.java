package clasesHerencia;

public class CirculosIguales {
    

    public static void main(String[] args) {
        

        Circulo circulo1 = new Circulo(10, "ROJO");

        Circulo circulo2 = new Circulo(5, "AZUL");

        Circulo circulo3 = new Circulo(10, "ROJO");

        Circulo circulo4 = new Circulo(5, "azul");

        System.out.println("CON == Circulo1 y Circulo2 son " + (circulo1 == circulo2) );
        System.out.println("CON == Circulo1 y Circulo3 son " + (circulo1 == circulo3) );
        System.out.println("CON equals Circulo1 y Circulo2 son " + (circulo1.equals(circulo2) ))  ;
        System.out.println("CON equals Circulo1 y Circulo3 son " + (circulo1.equals(circulo3) ))  ;

        System.out.println("CON equals Circulo2 y Circulo4 son " + (circulo2.equals(circulo4) ))  ;
        


    }
}
