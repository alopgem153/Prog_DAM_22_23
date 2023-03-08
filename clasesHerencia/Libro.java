package clasesHerencia;

public class Libro extends Publicacion {

    //Atributo
    private boolean estaPrestado;

    public Libro(String isbn, String titulo, int year)
    {
       super(isbn, titulo, year) ;
       this.estaPrestado = false;
    }

    public void presta()
    {
        if (this.estaPrestado == true)
        {
            System.out.println("Lo siento este libro ya está prestado");
        }
        else 
        {
            this.estaPrestado = true;
        }
    }

    public void devuelve()
    {
        this.estaPrestado = false;
    }

    public boolean estaPrestado()
    {
        return this.estaPrestado;
    }

    @Override
    public String toString()
    {
        return "Libro: "+ super.toString() + ((this.estaPrestado == true) ? " (Esta Prestado)" : " (No Prestado)"); 
    }
    
}
