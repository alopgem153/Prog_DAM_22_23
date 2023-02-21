package clasesHerencia;

public abstract class FiguraGeometica {
    //Atributos
    protected String color;

    public FiguraGeometica(String color)
    {
        this.color = color;
    }

    public abstract double area();
    public abstract double perimetro();

    @Override
    public String toString()
    {
        String cadena = "";
        cadena += "\n Color: "  + this.color;
        cadena += "\n Area: " + this.area();
        cadena += "\n Perimetro: "+ this.perimetro();

        return cadena;
    }
    
    
}
