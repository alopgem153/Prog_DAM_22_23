package ClasesT6.Usos;

import ClasesT6.Ejemplos.Caja;
import ClasesT6.Ejemplos.Cliente;

public class ColadeBanco {

    public enum AccionesBanco {INGRESAR, RETIRAR};

    public static void main(String[] args) {
        
        Caja caja = new Caja();

        Cliente[] colaClientes = new Cliente[0];


        Cliente cliente1 = new Cliente("Andres", AccionesBanco.RETIRAR, 100);
        colaClientes = enqueue(colaClientes,cliente1);

        Cliente cliente2 = new Cliente("Javier", AccionesBanco.RETIRAR, 540.5);
        colaClientes= enqueue(colaClientes, cliente2);

        Cliente cliente3 = new Cliente("Sara", AccionesBanco.RETIRAR, 1500);
        colaClientes = enqueue(colaClientes,cliente3);

        estadoCola(colaClientes);

        colaClientes = atender(caja, colaClientes);
        System.out.println(caja.saldo());

        Cliente cliente4 = new Cliente("Miguel", AccionesBanco.INGRESAR, 2000);
        colaClientes = enqueue(colaClientes,cliente4);

        colaClientes = atender(caja, colaClientes); //equivalente a dequeue de la cola
        System.out.println(caja.saldo());

        estadoCola(colaClientes);

        colaClientes = atender(caja, colaClientes);
        System.out.println(caja.saldo());

        colaClientes = atender(caja, colaClientes);
        System.out.println(caja.saldo());

        colaClientes = atender(caja, colaClientes);
        System.out.println(caja.saldo());

    }

    /**
     * Inserta al final de array un nuevo cliente
     * @param colaClientes
     * @param clienteNuevo
     * @return
     */
    public static Cliente[] enqueue(Cliente[] colaClientes, Cliente clienteNuevo)
    {
        Cliente[] nuevaCola = new Cliente[colaClientes.length+1];

        for (int i = 0; i < colaClientes.length; i++) 
        {
            nuevaCola[i] = colaClientes[i];
        }

        nuevaCola[nuevaCola.length-1] = clienteNuevo;

        return nuevaCola;
    }

    public static void estadoCola(Cliente[] colaClientes)
    {
        for (int i = 0; i < colaClientes.length; i++) 
        {
            System.out.print(colaClientes[i] + " - ");     
        }
        System.out.println();
    }

    /**
     * Saca el primer elemento de la cola y actualiza la caja según sus valores
     * @param caja
     * @param colaClientes
     * @return
     */
    public static Cliente[] atender(Caja caja, Cliente[] colaClientes)
    {
        if (colaClientes.length > 0)
        {
            Cliente clienteAAtender = colaClientes[0];

            System.out.println("Cliente: " + clienteAAtender.getNombre() + " esta siendo atendido");

            //quitamos un elemento a la cola
            Cliente[] nuevaCola = dequeue(colaClientes);

            //Con el cliente que hemos quitado actualizamos la caja
            if (clienteAAtender.getAccion()== AccionesBanco.INGRESAR)
            {
                caja.setSaldo(caja.saldo()+clienteAAtender.getImporte());
            }
            else if (clienteAAtender.getAccion()== AccionesBanco.RETIRAR)
            {
                if (caja.saldo()> clienteAAtender.getImporte())
                {
                    caja.setSaldo(caja.saldo()-clienteAAtender.getImporte());
                }
                else
                {
                    System.out.println("No tenemos suficiente saldo para retirar ese importe");
                }
            }

            return nuevaCola;
        }
        else //No hay clientes en la cola
        {
            System.out.println("No hay clientes en la cola");
            return colaClientes;
        }


        
    }

    /**
     * Eliminamos un cliente de la cola (se elimina el que esta primero, el de la posición 0)
     * @param colaClientes
     * @return
     */
    public static Cliente[] dequeue(Cliente[] colaClientes)
    {

        Cliente[] nuevaCola = new Cliente[colaClientes.length-1];

        for (int i = 0; i < nuevaCola.length; i++) 
        {
            nuevaCola[i] = colaClientes[i+1];
        }

        return nuevaCola;


    }


    
}
