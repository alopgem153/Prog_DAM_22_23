package clasesHerencia;

public class EjemploHerencia1 {

    public static void main(String[] args) {
    
        Persona persona1 = new Persona("ANDRES", 50, 177);
    
        Empleado empleado1 = new Empleado("Pepe", 27, 168, 1500, "Becario");
    
        //empleado1.estatura = 180; No se puede porque en persona este atributo es privado
    
        empleado1.edad = 15;

        persona1.mostrarDatos();
        empleado1.mostrarDatos();

        Empleado empleado_Nico = new Empleado("Nico", 30, 165, 500, "Becario");
        Persona persona_Nico = (Persona)empleado_Nico;

        persona_Nico.mostrarDatos();

        Cliente cliente_Manolo = new Cliente();
        cliente_Manolo.setNombre("Manolo");
        cliente_Manolo.setEdad(55);
        cliente_Manolo.setEstatura(198);
        cliente_Manolo.setCif("234346FD");
        
        Persona personaManolo = cliente_Manolo;
        personaManolo.mostrarDatos();


        System.out.println("-----------------------------------------------");
        Persona persona2 = new Persona("ANDRES", 55, 120);

        if(persona1.equals(persona2))
        {
            System.out.println("Son la misma persona");
        }
        else
        {
            System.out.println(" NO son la misma persona");
        }
        

        System.out.println(persona1.getClass());
        System.out.println(cliente_Manolo.getClass());

        System.out.println(cliente_Manolo.getClass().getSuperclass());
    }

}






// public class Padre 
// {
//     private int a;
//     int b;
//     protected int c;
//     public int d;

// }

// public class Hijo extends Padre
// {
    
// }

