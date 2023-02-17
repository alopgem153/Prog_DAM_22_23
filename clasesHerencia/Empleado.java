package clasesHerencia;

public class Empleado extends Persona
{
    private double salario;
    private String puesto;

    public Empleado(String nombre, int edad, double estatura, double salario, String puesto)
    {
        super(nombre, edad, estatura);
        // this.nombre = nombre;
        // this.edad = edad;
        // this.estatura = estatura;
        this.salario = salario;
        this.puesto = puesto;   
        
        // this.estatura  no esta disponible
        // this.edad es protected y sui esta disponible
    }

    @Override
    public void mostrarDatos()
    {
        super.mostrarDatos();
        System.out.println("Salario: "+ this.salario + " Puesto:" + this.puesto);
    }

}
