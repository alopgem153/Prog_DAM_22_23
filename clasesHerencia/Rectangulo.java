package clasesHerencia;

public class Rectangulo extends FiguraGeometica {

    // Atributos
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    // Métodos
    public double perimetro() {

        double perimetro = 0;
        perimetro = 2 * (this.base + this.altura);

        return perimetro;
    }

    public double area() {

        double area = 0;
        area = this.base * this.altura;

        return area;
    }

    @Override
    public String toString() {

        String cadena = "";
        cadena += "\n--Rectangulo--";
        cadena += "\n Base: " + this.base;
        cadena += "\n Altura: " + this.altura;
        cadena += super.toString();

        return cadena;
    }
}
