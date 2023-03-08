package clasesHerencia;

public class Circulo extends FiguraGeometica {

    private double radio;

    public Circulo(double radio, String color) {
        super(color);
        
        this.radio = radio;
    }

    @Override
    public double area() {
        
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public double perimetro() {
        
        return 2*Math.PI*this.radio;
    }

    @Override 
    public String toString()
    {
        String cadena = "";
        cadena += "\n--- CIRCULO ---";
        cadena += "\n Radio: " + this.radio;
        cadena += super.toString();

        return cadena;
    }

    @Override
    public boolean equals(Object obj) {
        
        Circulo circulo = (Circulo)obj;

        //return this.radio == circulo.radio && this.color.equalsIgnoreCase(circulo.color); 
        return this.radio == circulo.radio && super.equals(obj);
    }
    
}
