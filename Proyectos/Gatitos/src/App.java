import animales.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Gatitos!");



        Gato garfield = new Gato("Garfield", "Callejero", "M");

        Gato lisa = new Gato("Lisa", "Persa", "H");

        Gato lulu = new Gato("Lulu", "Callejero", "H");

        Gato hijoGarfielLisa = garfield.apareaCon(lisa);

        System.out.println("Hijo Garfield y Lisa: " +hijoGarfielLisa);

        Gato hijoLisaLulu = lisa.apareaCon(lulu);

        System.out.println("Hijo Lisa y Lulu: " + hijoLisaLulu);

    }
}
