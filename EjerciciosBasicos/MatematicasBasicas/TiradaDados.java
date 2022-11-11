package MatematicasBasicas;

public class TiradaDados {

    public static void main(String[] args) {
        
        double tirada1 = Math.ceil((Math.random() * 6));
        double tirada2 = Math.ceil((Math.random() * 6));
        double tirada3 = Math.ceil((Math.random() * 6));

        double suma = tirada1 + tirada2;
        //System.out.println("Suma vale:" + suma);
        suma = suma + tirada3;

        System.out.println("Tirada 1: " + (int)tirada1);
        System.out.println("Tirada 2: " + (int)tirada2);
        System.out.println("Tirada 3: " + (int)tirada3);

        double maximo = Math.max(tirada1, tirada2);
        maximo = Math.max(maximo, tirada3);

        double maximo2 = Math.max(tirada3, Math.max(tirada1, tirada2));

        System.out.println("La tirada mas grande es de :" + maximo);

        System.out.println("La tirada mas grande de otra forma es:" + maximo2);

        double minimo = Math.min(tirada1, tirada2);
        minimo = Math.min(minimo, tirada3);

        System.out.println("La tirada mas pequeña es de: " + minimo);

    }
    
}
