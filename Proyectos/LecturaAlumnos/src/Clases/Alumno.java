package Clases;

public class Alumno implements Comparable<Alumno>{
    String sexo, calificación;
    int edad, puntuación1, puntuación2;
    double estatura;
    public Alumno(String sexo, int edad, int puntuación1, int puntuación2, double estatura,String calificación) {
        this.sexo = sexo;
        this.calificación = calificación;
        this.edad = edad;
        this.puntuación1 = puntuación1;
        this.puntuación2 = puntuación2;
        this.estatura = estatura;
    }
    public String getSexo() {
        return sexo;
    }
    public String getCalificación() {
        return calificación;
    }
    public int getEdad() {
        return edad;
    }
    public int getPuntuación1() {
        return puntuación1;
    }
    public int getPuntuación2() {
        return puntuación2;
    }
    public double getEstatura() {
        return estatura;
    }
    @Override
    public int compareTo(Alumno o) {
        return this.edad-o.edad;
    }
    @Override
    public String toString() {
        return edad+"(" + this.estatura + ")";
    }
}
