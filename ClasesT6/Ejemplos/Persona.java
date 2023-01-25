package ClasesT6.Ejemplos;

class Persona {

    //Definir los ATRIBUTOS de clase
    //final String dni;
    String dni;
    String nombre;
    String apellidos;
    int edad;
    double estatura;

    //Variable ESTATICA 
    static String hoy;

    //CREAMOS LOS CONSTRUCTORES
    public Persona()
    {
        nombre = "Desconocido";
    }

    public Persona(String nombre)
    {
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad, double estatura, String dni)
    {
        this(nombre);
        //this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.dni = dni;
        this.apellidos = "Desconocido";
    }

    public Persona(String nombre, int edad, double estatura, String dni, String apellidos)
    {
        // this.nombre = nombre;
        // this.edad = edad;
        // this.estatura = estatura;
        // this.dni = dni;
        
        this(nombre, edad, estatura, dni); //llamamos a un constructor más básico o padre
        this.apellidos = apellidos;
    }


    //IMPLEMENTAMOS LOS METODOS DE LA CLASE (COMPORTAMIENTOS)

    void saludar()
    {
        System.out.println(nombre + " dice Hola");
    }

    void cambiarNombre(String nombre)
    {
        this.nombre = nombre;
    }

    void ponerEdad(int edad)
    {
        this.edad = edad;
    }

    void cumplirAño()
    {
        int edad = 0;


        edad = this.edad;

        this.edad = edad;
    }

    void mostrarPersona()
    {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Edad: " + edad + " - " + "Altura: " + estatura);
    }

    void mostrarPersonaCumpliendoAño()
    {
        cumplirAño();        
        mostrarPersona();

        int edadAnterior = edad -1;
        while (edadAnterior != 0)
        {
            int edadCalculada = edadAnterior -1;



        }
    }

    static void diaDeLaSemana(int numero)
    {
        String dia = "";
        switch(numero)
        {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "ERROR";
                break;
        }
        System.out.println(dia);
    }
    
}
