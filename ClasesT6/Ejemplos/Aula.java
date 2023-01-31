package ClasesT6.Ejemplos;

public class Aula {

    //atributos
    private int numeroAlumnos;
    private int numeroMesas;
    private String nombreAula;
    private int planta;
    private int ventanas;


    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }
    public void setNumeroAlumnos(int numeroAlumnos) {

        if(numeroAlumnos > this.numeroMesas)
        {
            System.out.println("No es posible asignar tantos alumnos porque no hay mesas suficientes");
        }
        else
        {
            this.numeroAlumnos = numeroAlumnos;
        }
    }
    public int getNumeroMesas() {
        return numeroMesas;
    }
    public void setNumeroMesas(int numeroMesas) {
        this.numeroMesas = numeroMesas;
    }
    public String getNombreAula() {
        return this.planta + "_" + this.nombreAula;
    }
    public void setNombreAula(String nombreAula) {
        this.nombreAula = nombreAula;
    }
    public int getPlanta() {
        return planta;
    }
    public void setPlanta(int planta) {
        if (planta > 2 || planta < 0)
        {
            System.out.println("El edificio no tiene tantas plantas");
        }
        else
        {
            this.planta = planta;
        }
    }
    public int getVentanas() {
        return ventanas;
    }
    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }


    
    
}
