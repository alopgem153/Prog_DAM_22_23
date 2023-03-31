package contenedores.ejer17;

public class Elemento {

    private String nombre;
    private double precio;
    private int cantidad;

    public Elemento(String nombre, double precio, int cantidad)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
       
        return this.nombre + " PVC: " + this.precio + " Unidades: " + this.cantidad + " Subtotal:" + (this.precio*this.cantidad) ;
    }

}
