package ClasesT6.Ejemplos;

public class Punto {

    //Atributos
    private double x;
    private double y;

    //Constructor
    public Punto(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    //Metodos
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString()
    {
        return "(" + this.getX() + ", " + this.getY()+ ")";
    }

    


    
}
