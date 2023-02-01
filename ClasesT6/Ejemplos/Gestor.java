package ClasesT6.Ejemplos;

public class Gestor {

    //atributos de clase
    private String nombre;
    private String tlf;
    private double importeMaximo;

    enum Puesto {Becario, Ayudante, Senio};

    public enum Sexo { Hombre, Mujer, NoBinario};

    private Sexo queSoy;
    private Puesto cargo;

    //Constructores
    public Gestor (String nombre, String tlf)
    {
        this.nombre = nombre;
        this.tlf = tlf;
        this.importeMaximo = 10000;
        this.cargo = Puesto.Becario;
    }

    public Gestor(String nombre, String tlf, double importeMaximo)
    {
        this.nombre = nombre;
        this.tlf = tlf;
        this.cargo = Puesto.Becario;
        if (importeMaximo < 10000)
        {
            this.importeMaximo = importeMaximo;
        }
        else 
        {
            //al ser becario no puede tener mas de 10000 de importeMaximo
            this.importeMaximo = 10000;
        }
    }

    public Gestor(String nombre, String tlf, double importeMaximo, Sexo queEs)
    {
        this(nombre, tlf, importeMaximo);
        this.queSoy = queEs;
    }

    public Gestor(String nombre, String tlf, double importeMaximo, Sexo queEs, Puesto puesto)
    {
        this(nombre, tlf, importeMaximo, queEs);
        this.cargo = puesto;
        setImporteMaximo(importeMaximo);

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
   
    public double getImporteMaximo() {
        return importeMaximo;
    }
    public void setImporteMaximo(double importeMaximo) {
        if (importeMaximo > 0)
        {
            if(this.cargo == Puesto.Becario && importeMaximo > 10000)
            {
                this.importeMaximo = 10000;     
            }
            else if (this.cargo == Puesto.Ayudante && importeMaximo > 50000)
            {
                this.importeMaximo = 50000;     
            }
            else if (this.cargo == Puesto.Senio && importeMaximo > 200000)
            {
                this.importeMaximo = 200000;     
            }
            else 
            {
                //El importeMaximo está dentro del rango según el puesto que ocupa
                this.importeMaximo = importeMaximo;
            }
            
        }
        else 
        {
            System.out.println("El importe maximo no puede ser negativo");
            importeMaximo = 0;
        }
    }

    public Sexo getQueSoy() {
        return queSoy;
    }

    public void setQueSoy(Sexo queSoy) {
        this.queSoy = queSoy;
    }


    public void imprimirInfoGestor()
    {
        System.out.println("Gestor: " + this.nombre + " - " + this.tlf +  "Puesto:" + this.cargo + " - " + this.importeMaximo + "(" + this.queSoy + ")");
    }

    
}
