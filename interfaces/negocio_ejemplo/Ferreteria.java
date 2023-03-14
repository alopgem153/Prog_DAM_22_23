package interfaces.negocio_ejemplo;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Ferreteria extends Negocio implements Tienda_I {
    
    private int tipoIVA;
    private Cliente[] cola;
    private double dineroEnCaja;

    public Ferreteria(String nombre)
    {
        this.nombre = nombre;
        cola = new Cliente[0];
        dineroEnCaja = 100;
        tipoIVA = 21;
    }

    @Override
    public double pagarImpuestos()
    {
        double total = dineroEnCaja * (tipoIVA/100.0);
        dineroEnCaja -= total;

        return total;
    }

    @Override
    public void abrir() {
       System.out.println("La ferreteria:" + this.nombre + " abre ya " + LocalDateTime.now());
    }

    @Override
    public double cobrar() {
        double total = 0;
        if(cola.length>0)
        {
            Cliente clienteQueLeToca = cola[0];

            total = clienteQueLeToca.getDinero();

            //Añadimos el dinero del cliente a la caja de la ferreteria
            this.dineroEnCaja += total;

            System.out.println("Atiendo al cliente: " + clienteQueLeToca.getNombre());

            //Rehago la cola sin el primer cliente
            Cliente[] nuevaCola = new Cliente[cola.length-1];

            for (int i = 0; i < nuevaCola.length; i++) 
            {
                nuevaCola[i] = cola[i+1];    
            }

            cola = nuevaCola;
        }

        return total;
    }

    @Override
    public void ponerEnCola(Cliente cliente) {
        
        Cliente[] nuevaCola = Arrays.copyOf(cola, cola.length+1);
        nuevaCola[nuevaCola.length-1] = cliente;

        cola = nuevaCola;

    }

    public int getTipoIVA() {
        return tipoIVA;
    }

    public void setTipoIVA(int tipoIVA) {
        this.tipoIVA = tipoIVA;
    }

    public Cliente[] getCola() {
        return cola;
    }

    public void setCola(Cliente[] cola) {
        this.cola = cola;
    }

    public double getDineroEnCaja() {
        return dineroEnCaja;
    }

    public void setDineroEnCaja(double dineroEnCaja) {
        this.dineroEnCaja = dineroEnCaja;
    }

    
}
