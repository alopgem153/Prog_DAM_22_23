package ClasesT6.Ejemplos;

public class CuentaCorriente {

    //Variable o Atributos
    
    //visible para clases vecinas
    String dni;

    //nombreTitular es visible en todas las clases
    public String nombreTitular;

    //saldo no es visible para otras clases
    private double saldo;

    //Gestor encargado de la cuenta
    private Gestor gestor;


    //Constructores
    public CuentaCorriente(String dni, String nombre)
    {
        this(dni, nombre, 0);
        //this.dni = dni;
        //this.nombreTitular = nombre;
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

    public CuentaCorriente(String dni, String nombre, double saldo, Gestor gestor)
    {
        this(dni, nombre, saldo);
        this.gestor = gestor;
    }

    public CuentaCorriente(String dni, String nombre, double saldo, String nombreGestor, String tlfGestor)
    {
        this(dni, nombre, saldo);
     
        Gestor gestor = new Gestor(nombreGestor, tlfGestor);
        this.gestor = gestor;
    }

    public void sacarDinero(double cantidad, String dni)
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
    private void sacarDinero(double cantidad)
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

    public double ObtenerSaldo()
    {
        return saldo;
    }

    public void IngresarSaldo(double cantidad)
    {
        this.saldo += cantidad;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public String obtenerNombreGestor()
    {
        String nombreGestor = "Sin asignar";

        //Si existe un gestor y ese gestor tiene nombre entonces cojo su valor
        if (this.gestor != null && this.gestor.getNombre() != null)
        {
            nombreGestor = this.gestor.getNombre();
        }

        return nombreGestor;
    }
    
}
