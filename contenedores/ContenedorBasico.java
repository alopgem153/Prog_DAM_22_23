package contenedores;

public class ContenedorBasico<E> {

    private E objeto; // contenedor vacio

    public void insertar(E nuevo)
    {
        objeto = nuevo;
    }


    public E extraer()
    {
        E resultado = objeto;
        objeto = null;
        return resultado;

    }
    
}
