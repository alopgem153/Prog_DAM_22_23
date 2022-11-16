package Bucles;

import java.util.Scanner;

public class MenuFrase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean salir = false;

        String frase = "";

        //Realizamos el bucle principal
        do 
        {
            //Imprimimos el menú de opciones
            System.out.println("a - Añadir texto");
            System.out.println("b - Mostrar la frase");
            System.out.println("c - Nº de palabras");
            System.out.println("d - Buscar caracter");
            System.out.println("e - Limpiar");
            System.out.println("s - Salir");

            System.out.println("Indica una opción:....");
            char opcion = sc.nextLine().toLowerCase().charAt(0);

            switch (opcion)
            {
                case 'a':
                    //Añadir a la frase un trozo nuevo
                    System.out.println("Dime el nuevo trozo...");
                    String trozoNuevo = sc.nextLine();
                    frase = (frase + " " + trozoNuevo).trim();
                    break;
                case 'b':
                    //Muestro la frase
                    if (frase.equals("")) //frase.length == 0
                    {
                        System.out.println("La frase está vacia");
                    }
                    else
                    {
                        System.out.println("La frase actual es: \"" + frase + "\"");
                    }
                    break;
                case 'c':
                    //Mostrar el numero de palabras
                    String[] palabras = frase.trim().split(" ");
                    int numeroPalabras = palabras.length;
                    System.out.println("La frase tiene "+ numeroPalabras + " palabras");
                    break;
                case 'd':
                    //Buscar caracter y decir cuantas veces aparece y donde
                    System.out.println("Indica el caracter que quieres buscar...");
                    char caracterBuscado =  sc.nextLine().charAt(0);
                    String fraseMinuscula = frase.toLowerCase();

                    int apariciones = 0;
                    String posicionesDondeAparece = "";

                    for(int aux = 0; aux< fraseMinuscula.length(); aux++)
                    {
                        char caracterFrase = fraseMinuscula.charAt(aux);

                        if(caracterBuscado == caracterFrase)
                        {
                            apariciones++;
                            posicionesDondeAparece += aux + " ";
                        }
                    }

                    System.out.println("El caracter :" + caracterBuscado + " aparece " + apariciones);
                    System.out.println("En las posiciones: " + posicionesDondeAparece);


                    break;
                case 'e':
                    //Limpio/borro la frase
                    frase = "";
                    System.out.println("Frase borrada");
                    break;
                case 's':
                    //SALIR
                    salir = true;
                    System.out.println("Hasta otra!!");                
                    break;
                default:
                    System.out.println("¡¡¡Opcion no valida!!!");
            }

            System.out.println("Pulse ENTER para continuar");
            sc.nextLine();

        }  while (salir == false); // (!salir);

    }
}
