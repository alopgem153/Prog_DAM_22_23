package models;

import java.util.HashMap;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private String dni;
    private HashMap<String, Double> notas;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public HashMap<String, Double> getNotas() {
        return notas;
    }
    public void setNotas(HashMap<String, Double> notas) {
        this.notas = notas;
    }

    
    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", dni=" + dni + "]";
    }
    
    @Override
    public int compareTo(Alumno o) {
        return this.getDni().compareTo(o.getDni());
    }
}
