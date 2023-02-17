package clasesHerencia;

public class Persona {
    
    String nombre;
    protected int edad;
    private double estatura;

    public Persona()
    {

    }

    public Persona(String nombre, int edad, double estatura)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public void mostrarDatos()
    {
        System.out.println("Nombre: " + this.nombre + " Edad" + this.edad + " Altura:" + this.estatura);
    }

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

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }


    @Override
    public boolean equals(Object p)
    {
        boolean resultado = false;

        Persona persona = (Persona)p;
        

        //Comparamos 2 personas por nombre y edad y NO tenemos en cuenta su estatura
        if (this.nombre.equals(persona.getNombre()) && this.edad == persona.getEdad())
        {
            resultado = true;
        }
        return resultado;
    }


    
}
