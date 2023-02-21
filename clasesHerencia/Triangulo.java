package clasesHerencia;

public class Triangulo extends FiguraGeometica {
    // Atributos
    private double base;
    private double altura;

    // Constructor
    public Triangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    // Métodos
    public double area() {

        double area = (this.base * this.altura) / 2;

        return area;
    }

    public double perimetro() {

        double perimetro = this.base + 2 * (Math.sqrt((Math.pow(this.base / 2, 2)) + (Math.pow(this.altura, 2))));

        return perimetro;
    }

    @Override
    public String toString() {

        String cadena = "";
        cadena += "\n--Triangulo--";
        cadena += "\n Base: " + this.base;
        cadena += "\n Altura: " + this.altura;
        cadena += super.toString();

        return cadena;
    }
}
