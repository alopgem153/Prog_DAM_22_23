package ClasesT6.Ejemplos;

public class Gestor {

    //atributos de clase
    private String nombre;
    private String tlf;
    private double importeMaximo;

    //Constructores
    public Gestor (String nombre, String tlf)
    {
        this.nombre = nombre;
        this.tlf = tlf;
        this.importeMaximo = 10000;
    }

    public Gestor(String nombre, String tlf, double importeMaximo)
    {
        this.nombre = nombre;
        this.tlf = tlf;
        this.importeMaximo = importeMaximo;
    }


    //Metodos de clase

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTlf() {
        return tlf;
    }
   
    double getImporteMaximo() {
        return importeMaximo;
    }
    void setImporteMaximo(double importeMaximo) {
        if (importeMaximo > 0)
        {
            this.importeMaximo = importeMaximo;
        }
        else 
        {
            System.out.println("El importe maximo no puede ser negativo");
        }
    }


    
}
