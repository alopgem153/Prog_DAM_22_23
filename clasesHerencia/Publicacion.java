package clasesHerencia;

public abstract class Publicacion {
    
    protected String isbn;
    protected String titulo;
    protected int year;
    
    public Publicacion(String isbn, String titulo, int year)
    {
        this.isbn = isbn;
        this.titulo = titulo;
        this.year = year;
    }

    @Override
    public String toString()
    {
        return this.titulo + " (" + this.year +") - " + this.isbn;
    }
}
