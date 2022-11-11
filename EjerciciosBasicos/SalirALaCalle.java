import java.util.Scanner;

public class SalirALaCalle {
    
    public static void main(String[] args) {
        /*
         * Si está lloviendo o no, si hemos terminado nuestras tareas. 
         * Existe una opción en la que indistintamente de lo anterior, 
         * podemos salir a la calle, es que vayamos 
         * a ir a la biblioteca ( a realizar algún trabajo o estudiar). 
         *
         */


         Scanner sc = new Scanner(System.in);

         System.out.println("¿Esta lloviendo?");
         boolean llueve = sc.nextBoolean();

         System.out.println("¿Has terminado tareas?");
         boolean tareasFinalizadas = sc.nextBoolean();

         boolean tienesTareas = !tareasFinalizadas;

         System.out.println("¿Necesitas ir a la biblioteca?");
         boolean necesitasIrBiblio = sc.nextBoolean();

         boolean puedoSalir = necesitasIrBiblio || (!llueve && tareasFinalizadas);

         boolean puedoSalir2 = necesitasIrBiblio || (!llueve && !tienesTareas);


         System.out.println("Puedes salir: " + puedoSalir);

         System.out.println(puedoSalir2 ? "Puedes salir " : "NO puedes salir");
    }
}
