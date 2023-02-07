package ClasesT6.Ejemplos;

public class Incidencia {

    enum EstadoIncidencia { Pendiente, Resuelta};

    //Atributos de la clase Incidencia
    private int codigo;
    private EstadoIncidencia estado;
    private int puesto;
    private String descripcionError;
    private String descripcionSolucion;

    private static int numeroIncidenciasCreadas;
    private static int numeroIncidenciasPendientes;

    //Contructor
    public Incidencia(int puesto, String descripcion)
    {
        this.puesto = puesto;
        this.descripcionError = descripcion;
        this.estado = EstadoIncidencia.Pendiente;

        numeroIncidenciasCreadas++;
        numeroIncidenciasPendientes++;
        this.codigo = numeroIncidenciasCreadas;
    }
    

    //Metodos
    public void resuelve(String descripcionsolucion)
    {
        if (this.estado == EstadoIncidencia.Pendiente)
        {
            this.descripcionSolucion = descripcionsolucion;
            this.estado = EstadoIncidencia.Resuelta;
            numeroIncidenciasPendientes--;
        }
        else
        {
            System.out.println("Esta incidencia ya está resuelta");
        }
    }

    @Override
    public String toString()
    {
        return "Incidencia " + this.codigo + " - " + "Puesto "+ this.puesto 
                + " - " + this.descripcionError + " - " + this.estado 
                +(this.estado == EstadoIncidencia.Resuelta ? " - " + this.descripcionSolucion : "");
    }

    public static int getPendientes()
    {
        return numeroIncidenciasPendientes;
    }

    public static int getTotalDeIncidencias()
    {
        return numeroIncidenciasCreadas;
    }

}
