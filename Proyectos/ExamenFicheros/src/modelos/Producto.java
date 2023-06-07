package modelos;

public class Producto {

    private Integer codigo;
    private String nombre;
    private String descrip;
    private Double precio;
    private Integer stock;
    
    public Producto(Integer codigo, String nombre, String descrip, Double precio, Integer stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descrip = descrip;
        this.precio = precio;
        this.stock = stock;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        
        return this.codigo + " - " +this.nombre;
    }

    @Override
    public boolean equals(Object obj) {
        Producto p = (Producto)obj;
        return this.nombre.equals(p.getNombre()) && this.codigo == p.getCodigo();
    }

}
