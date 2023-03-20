package contenedores;

/*
 * Es una clase que es solo para alumnos, los profesores no la "tiene"  
 */
public class Notas<T extends Alumno> {

    public T alumno;

    public String sacarNota()
    {
        
        return this.alumno.nombre + ": SOBRESALIENTE";
    }

    public void insertar(T nuevo)
    {
        alumno =nuevo;
    }

    public T extraer()
    {
        return alumno;
    }
    
}
