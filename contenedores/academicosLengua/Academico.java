package contenedores.academicosLengua;

public class Academico implements Comparable<Academico> {
    
    private String nombre;
    private int yearIngreso;

    public Academico()
    {

    }

    public Academico(String nombre, int year)
    {
        this.nombre = nombre;
        this.yearIngreso = year;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYearIngreso() {
        return yearIngreso;
    }

    public void setYearIngreso(int yearIngreso) {
        this.yearIngreso = yearIngreso;
    }

    @Override
    public String toString() {
        return "Academico [nombre=" + nombre + ", yearIngreso=" + yearIngreso + "]";
    }

    @Override
    public int compareTo(Academico o) {
        
        return this.nombre.compareTo(o.getNombre());
        
    }

   
    
    
    
}
