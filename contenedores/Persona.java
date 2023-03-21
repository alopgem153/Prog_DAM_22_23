package contenedores;

public class Persona implements Comparable<Persona> {

    String nombre;
    int edad;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        
        return this.nombre + "(" + this.edad + ")";
    }
    @Override
    public int compareTo(Persona p) {
        //Ordeno por nombre únicamente
        return this.nombre.compareTo(p.nombre);
    }
    
}
