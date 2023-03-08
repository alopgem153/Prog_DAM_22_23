package clasesHerencia;

public class Revista extends Publicacion {

    //Atributos
    private int numero;

    public Revista(String isbn, String titulo, int year, int numero)
    {
        super(isbn, titulo, year);
        this.numero = numero;
    }


    @Override
    public String toString()
    {
        return "Revista: " + super.toString() + " " + " Nº " + this.numero;
    }
}
