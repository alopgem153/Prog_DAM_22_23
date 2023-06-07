package modelos;

public class Cliente 
{
    private Integer codigo;
    private String nombre;
    private String direccion;
    private String email;

    public Cliente(){

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.codigo + " - "+ this.nombre; 
    }


    @Override
    public boolean equals(Object obj) {
        Cliente c = (Cliente)obj;
        return this.nombre.equals(c.getNombre());
    }
}