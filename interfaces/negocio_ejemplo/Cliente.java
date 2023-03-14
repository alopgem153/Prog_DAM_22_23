package interfaces.negocio_ejemplo;

public class Cliente implements Comparable {
    
    //Atributos
    private String nombre;
    private double dinero;
    private int edad;

    public Cliente(String nombre, double dinero)
    {
        this.nombre = nombre;
        this.dinero = dinero;
    }

    public Cliente(String nombre, double dinero, int edad)
    {
        this(nombre, dinero);
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public int compareTo(Object o) {

        
         Cliente c = (Cliente)o;

         //1º Opción
         //Ordenamos los clientes por dinero que se van a gastar

        // Double dineroTotal = (Double)this.dinero;

        // return dineroTotal.compareTo((Double)c.getDinero());
        
        // int resultado = 0;  //Presuponemos que son iguales en un principio.

        // if (this.dinero < c.getDinero())
        // {
        //     resultado = -1;
        // }
        // else if (this.dinero > c.getDinero())
        // {
        //     resultado = 1;
        // }
            // return resultado;

        //2º Opción
        //Ordenamos por nombre del cliente

        //return this.nombre.compareTo(c.getNombre());

        //3º Opcion
        //Ordenamos por dinero y si es iguial el dinero por el nombre
        int resultado = 0;  //Presuponemos que son iguales en un principio.

        if (this.dinero < c.getDinero())
        {
            resultado = -1;
        }
        else if (this.dinero > c.getDinero())
        {
            resultado = 1;
        }
        else 
        {
            resultado = this.nombre.compareTo(c.getNombre());
        }
        
        return resultado;

    }


    @Override
    public String toString() {
        
        return this.nombre + "(" + this.dinero + ")" + "[" + this.edad + "]";
    }

   
    
}
