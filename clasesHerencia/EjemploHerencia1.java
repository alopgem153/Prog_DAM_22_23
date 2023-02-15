public class EjemploHerencia1 {
    
}


public class Persona
{
    String nombre;
    int edad;
    double estatura;

    public Persona(String nombre, int edad, doble estatura)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

}


public class Empleado extends Persona
{
    private double salario;
    private String puesto;

    public Empleado(String nombre, int edad, doble estatura, double salario, String puesto)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.salario = salario;
        this.puesto = puesto;
    }
}


public class Padre 
{
    private int a;
    int b;
    protected int c;
    public int d;

}

public class Hijo extends Padre
{
    
}