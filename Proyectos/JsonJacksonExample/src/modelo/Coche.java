package modelo;

public class Coche {

    private String marca;
    private String modelo;
    private int anioFabricacion;
    private double precio;

    public Coche()
    {

    }

    public Coche(String marca, String modelo, int anioFabricacion, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    

    
}
