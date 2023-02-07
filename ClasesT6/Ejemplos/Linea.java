package ClasesT6.Ejemplos;

public class Linea {

    //Atributos 
    private Punto inicio;
    private Punto fin;

    //Constructor
    public Linea(Punto p1, Punto p2)
    {
        this.inicio = p1;
        this.fin = p2;
    }

    @Override
    public String toString()
    {
        //Línea formada por los puntos (4.21, 7.3) y (-2.0, 1.66)
        // return "Línea formada por los puntos (" + inicio.getX() + ", " + inicio.getY() + 
        //         " y (" + fin.getX() + ", " + fin.getY()+")";

        return "Línea formada por los puntos " + this.inicio + " y " + this.fin;
    }
    
}
