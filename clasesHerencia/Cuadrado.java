package clasesHerencia;

public class Cuadrado extends FiguraGeometica {

    private double lado;

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
        
    }

    public double perimetro(double ancho, double alto) {
        double perimetro = ancho * 4;

        return perimetro;
    }

    @Override
    public double perimetro()
    {
        return perimetro(lado, lado);
    }

    @Override
    public double area()
    {
        return area(lado, lado);
    }


    
    public double area(double ancho, double alto) {
        double area = alto * alto;
        return area;
    }

    // Pintamos el cuadrado
    public void pintar() {
        for (int j = 0; j < this.lado; j++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < this.lado - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < this.lado - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int j = 0; j < this.lado; j++) {
            System.out.print("*");
        }

        System.out.println();
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena += "------Cuadrado------";
        cadena += "\n Lado: " + this.lado;
        
        cadena += "\n" + super.toString();
        cadena += "\n--------------------";
        return cadena;
    }

}
