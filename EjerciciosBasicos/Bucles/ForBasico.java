package Bucles;

public class ForBasico {
    public static void main(String[] args) {
        
        for(int contador = 1; contador<= 5; contador = contador + 2)
        {
            System.out.println("Hola - " + contador);
        }

        System.out.println("----------------------------------");
        for(int contador = 10; contador>=0; contador--)
        {
            System.out.println("Adios - " + contador);
        }
    }
}
