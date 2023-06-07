package utiles;

public class ExcepcionProductoSinStock extends Exception {

    public ExcepcionProductoSinStock(Integer codigo, String nombre)
    {
        super("ERROR en "+ nombre + " ("+ codigo + ")" + " NO TIENE STOCK");
    }

}
