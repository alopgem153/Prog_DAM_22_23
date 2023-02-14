package ClasesT6.Ejemplos;

import java.nio.channels.AcceptPendingException;

import ClasesT6.Usos.ColadeBanco.AccionesBanco;

public class Cliente {
    //Atributos
    private String nombre;
    private AccionesBanco accion;
    private double importe;

    public Cliente(String nombre, AccionesBanco accion, double importe)
    {
        this.nombre = nombre;
        this.accion = accion;
        this.importe = importe;
    }


    @Override
    public String toString()
    {
        return this.nombre;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public AccionesBanco getAccion() {
        return accion;
    }


    public void setAccion(AccionesBanco accion) {
        this.accion = accion;
    }


    public double getImporte() {
        return importe;
    }


    public void setImporte(double importe) {
        this.importe = importe;
    }

    
    
}
