package MatematicasBasicas;

public class Matematicas3 {
 public static void main(String[] args) {
    /*
     * Genera un número aleatorio  
     * e indica si está más cerca de 1 o de 0;

     */

     double aleatorio1 = Math.random();
     //double aleatorio2 = Math.random();

     System.out.println("El 1º es: " + aleatorio1);
     //System.out.println("El 2º es: " + aleatorio2);

     System.out.println((aleatorio1 < 0.5) ? "Mas cerca de 0" : "Mas cerca de 1");

    System.out.println("Esta mas cerca de: " + Math.round(aleatorio1));


 }   
}
