package ClasesT6.Usos;

import java.util.Scanner;

import ClasesT6.Ejemplos.Zona;

public class ExpoCocheVegaMijas {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        //Inicializamos las 3 zonas de la exposición 
        Zona zVip = new Zona(25);
        Zona zCompraVenta = new Zona(200);
        Zona zSalaPrincipal = new Zona(1000);

        boolean salir = false;
        do
        {
            System.out.println("1 - Mostrar numero entradas libres");
            System.out.println("2 - Vender entrada");
            System.out.println("3 - Salir");
            int opcion = sc.nextInt();

            switch(opcion)
            {
                case 1:
                    //mostrar Numero entradas libres
                    System.out.println("------- ENTRADAS LIBRES --------------");
                    System.out.println("Zona VIP: " + zVip.getEntradasPorVender());
                    System.out.println("Zona Compra-Venta: " + zCompraVenta.getEntradasPorVender());
                    System.out.println("Zona Principal: " + zSalaPrincipal.getEntradasPorVender());
                    break;
                case 2:
                    //VEnder entrada
                        //preguntar por numero de entradas
                        System.out.println("¿Cuantas entradas quiere?");
                        int numeroEntradas = sc.nextInt();
                        //preguntas por la zona -> 1-zonaVip, 2- Zona Compra-Venta 3- Zona SalaPrincipal
                        System.out.println("¿Para que zona? 1-zonaVip, 2- Zona Compra-Venta 3- Zona SalaPrincipal");
                        int zonaSeleccionada = sc.nextInt();
                        switch (zonaSeleccionada)
                        {
                            case 1: 
                                venderEntrada(zVip, numeroEntradas);
                                break;
                            case 2:
                                venderEntrada(zCompraVenta, numeroEntradas);
                                break;
                            case 3: 
                                venderEntrada(zSalaPrincipal, numeroEntradas);
                                break;
                            default:
                                System.out.println("opcion de zona no valida");
                                break;
                        }

                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        }while(!salir);
    }

    static void venderEntrada(Zona zona, int numeroEntradas)
    {
        zona.vender(numeroEntradas);
    }
    
}
