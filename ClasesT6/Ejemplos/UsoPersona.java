package ClasesT6.Ejemplos;

public class UsoPersona {
    public static void main(String[] args) {
        
        //llamamos al constructor de la clase persona
        Persona p1 = new Persona();

        //p1.nombre = "Pepe";
        p1.apellidos = "García";
        p1.edad = 19;
        p1.dni = "123455G";
        p1.estatura = 1.75;

        System.out.println(p1.toString());

        //mostrarPersona(p1);

        //System.out.println(p1.estatura + 2);

        p1.saludar();

        p1.cumplirAño();
        p1.cambiarNombre("Jhon");

        p1.mostrarPersona();

        Persona p2 = new Persona();

        p2.nombre = "Maria";
        p2.apellidos = " Lopez Jimenez";
        p2.edad = 20;
        p2.estatura = 1.82;
        p2.dni = "55555Y";

        p2.mostrarPersona();

        p1.apellidos = p2.apellidos;
        System.out.println("-----P1 toma los apellidos de p2--------------------");

        p1.ponerEdad(25);

        p1.mostrarPersona();

        Persona p3 = new Persona();

        p1.hoy = "Lunes";
        p2.hoy = "martes";
        System.out.println(p1.hoy);
        System.out.println(p2.hoy);
        System.out.println(p3.hoy);

        System.out.println(Persona.hoy);

        //p1.diaDeLaSemana(3);
        Persona.diaDeLaSemana(4);

        Persona p4 = new Persona("CuartaPersona", 21, 1.68, "888888-X", " Aznaz Gonzalez" );
        

    }

    static void mostrarPersona(Persona persona)
    {
        if (persona.nombre == null)
        {
            System.out.println("PERSONA SIN NOMBRE");
        }
        else
        {
            System.out.println(persona.nombre + " " + persona.apellidos);
        }
    }
}
