package contenedores;

import clasesHerencia.Cliente;
import interfaces.Lobo;

public class UsoContenedorBasico {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();

        Lobo lobo = new Lobo("Lobo Malo");

        ContenedorBasico<Cliente> contenedorCliente = new ContenedorBasico<Cliente>();

        ContenedorBasico<Lobo> contenedorLobo = new ContenedorBasico<Lobo>();

        contenedorCliente.insertar(cliente);

        contenedorLobo.insertar(lobo);


        //ContenedorBasico<int> contendorNumeros = new ContenedorBasico<>();
        ContenedorBasico<Integer> contendorNumeros = new ContenedorBasico<>();

        ContenedorBasico contenedorDeTODO = new ContenedorBasico();
        contenedorDeTODO.insertar(lobo);


        //Lobo lobo2 = (Lobo)contenedorDeTODO.extraer();

        Cliente cliente2 = (Cliente)contenedorDeTODO.extraer();



    }
    
}
