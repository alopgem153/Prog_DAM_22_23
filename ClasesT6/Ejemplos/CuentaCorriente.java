package ClasesT6.Ejemplos;

public class CuentaCorriente {

    //Variable o Atributos
    
    //visible para clases vecinas
    String dni;

    //nombreTitular es visible en todas las clases
    public String nombreTitular;

    //saldo no es visible para otras clases
    private double saldo;

    //Constructores
    public CuentaCorriente(String dni, String nombre)
    {
        this.dni = dni;
        this.nombreTitular = nombre;
    }

    public CuentaCorriente(String dni, double saldo)
    {
        this.dni = dni;
        this.saldo = saldo;
    }

    public CuentaCorriente(String dni, String nombre, double saldo)
    {
        //Llamo a un constructor anterior
        this(dni, saldo);
        //completo la construcción/creación de la clase
        this.nombreTitular = nombre;
    }

    private void sacarDinero(double cantidad, String dni)
    {
        if (this.dni.equalsIgnoreCase(dni))
        {
            sacarDinero(cantidad);
        }
        else
        {
            System.out.println("DNI no valido");
        }
    }

    //Metodos o funciones
    public void sacarDinero(double cantidad)
    {
        if (this.saldo > cantidad)
        {
            //puedo sacar dinero pq tengo suficiente
            this.saldo = this.saldo - cantidad;
        }
        else
        {
            //No tengo suficiente dinero
            System.out.println(" *** NO HAY SUFICIENTE DINERO");
        }
        
    }

    public void ingresarDinero(double cantidad)
    {
        if (cantidad >0)
        {
            this.saldo += cantidad;
        }
        else
        {
            System.out.println("Debes ingresar una cantidad positiva mayor a 0");
        }
    }

    public void mostrarInformacion()
    {
        System.out.println("Titular: "+ this.nombreTitular + "(" + this.dni + ") --- Saldo= " + this.saldo);
    }
    
}
