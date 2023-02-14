package ClasesT6.Usos;

import java.time.LocalDate;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import ClasesT6.Ejemplos.Disco;

/**
 * ColeccionDeDiscosPrincipal.java
 * Gestión de una colección de discos.
 * 
 * @author Luis José Sánchez
 */
public class ColeccionDeDiscosPrincipal {
  public static void main(String[] args) {
    // N determina el tamaño del array
    //final int N = 100;

    //Crea el array de discos
    //Disco[] discos = new Disco[N];
    Disco[] discos = new Disco[0];

    // Crea todos los discos que van en cada una de las celdas del array
    // for(int i = 0; i < N; i++) {
    //   discos[i] = new Disco();
    // }

    // Carga varios discos
    Disco d1 = new Disco(
      "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
    Disco d2 = new Disco(
      "FGHQ64", "Metallica", "Black album", "hard rock", 46);
    Disco d3 = new Disco(
      "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);

    discos = insertarDisco(discos, d1);
    discos = insertarDisco(discos, d2);
    discos = insertarDisco(discos, d3);

    int opcion;
    Scanner s = new Scanner(System.in);
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    int duracionIntroducida;

    do {
      System.out.println("\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      

      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(s.nextLine());
      
      switch (opcion) {
      case 1:
        System.out.println("\nLISTADO");
        System.out.println("=======");

        //mostramos un submenú con los tipos de listado
        System.out.println("\t 1. Listado Completo");
        System.out.println("\t 2. Listado de un autor");
        System.out.println("\t 3. Listado de un género");
        System.out.println("\t 4. Listado por rango de duración");

        int opcionListado = Integer.parseInt(s.nextLine());
        switch(opcionListado)
        {
          case 1:
                listadoCompleto(discos);
                break;
          case 2:
                System.out.println("¿Que autor quieres buscar?");
                String autor = s.nextLine();
                listadoXAutor(discos, autor);
                break;
          case 3:
                System.out.println("¿Que genero quieres listar?");
                String genero = s.nextLine();
                listadoXGenero(discos, genero);
                break;
          case 4:
                System.out.println("¿Mínimo de minutos?");
                int minimo = Integer.parseInt(s.nextLine());
                System.out.println("¿Máximo de minutos?");
                int maximo = Integer.parseInt(s.nextLine());
                
                listadoXDuracion(discos, minimo, maximo);
                break;

        }   


        // for(Disco d : discos) {
        //   if (!d.getCodigo().equals("LIBRE")) {
        //     System.out.println(d);
        //   }
        // }

        break;
        
      case 2:
        System.out.println("\nNUEVO DISCO");
        System.out.println("===========");
        
        // // Busca la primera posición libre del array
        // int primeraLibre = -1;
        // do {
        //   primeraLibre++;
        // } while (!((discos[primeraLibre].getCodigo()).equals("LIBRE")));
        
        System.out.println("Por favor, introduzca los datos del disco.");  
        System.out.print("Código: ");
        codigoIntroducido = s.nextLine();
        
        int posicionBuscada = buscarDisco(discos, codigoIntroducido);
        
        if (posicionBuscada == -1)
        {
          System.out.print("Autor: ");
          autorIntroducido = s.nextLine();
          System.out.print("Título: ");
          tituloIntroducido = s.nextLine();
          System.out.print("Género: ");
          generoIntroducido = s.nextLine();
          System.out.print("Duración: ");
          duracionIntroducida = Integer.parseInt(s.nextLine());
          Disco dNuevo = new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida);
          
          discos = insertarDisco(discos, dNuevo);
        }
        else 
        {
          System.out.println("Ya existe un disco en ese código ("+ codigoIntroducido+")");
        }

        break;
        
      case 3:
        System.out.println("\nMODIFICAR");
        System.out.println("===========");
        
        System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
        codigoIntroducido = s.nextLine();
  
        int i = -1;
        i = buscarDisco(discos, codigoIntroducido);
        // do {
        //   i++;
        // } while (!((discos[i].getCodigo()).equals(codigoIntroducido)));
        
        if (i != -1)
        {

        
          System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
    
          System.out.println("Código: " + discos[i].getCodigo());
          System.out.print("Nuevo código: ");
          codigoIntroducido = s.nextLine();
          if (!codigoIntroducido.equals("")) {
            discos[i].setCodigo(codigoIntroducido);
          }
          
          System.out.println("Autor: " + discos[i].getAutor());
          System.out.print("Nuevo autor: ");
          autorIntroducido = s.nextLine();
          if (!autorIntroducido.equals("")) {
            discos[i].setAutor(autorIntroducido);
          }
          
          System.out.println("Título: " + discos[i].getTitulo());
          System.out.print("Nuevo título: ");
          tituloIntroducido = s.nextLine();
          if (!tituloIntroducido.equals("")) {
            discos[i].setTitulo(tituloIntroducido);
          }
          
          System.out.println("Género: " + discos[i].getGenero());
          System.out.print("Nuevo género: ");
          generoIntroducido = s.nextLine();
          if (!generoIntroducido.equals("")) {
            discos[i].setGenero(generoIntroducido);
          }
          
          System.out.println("Duración: " + discos[i].getDuracion());
          System.out.print("Duración: ");
          final String duracionIntroducidaString = s.nextLine();
          if (!duracionIntroducidaString.equals("")) {
            discos[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
          }
        }
        else 
        {
          System.out.println("Codigo " + codigoIntroducido + " no encontrado");
        }

        break;
        
      case 4:
        System.out.println("\nBORRAR");
        System.out.println("======");
        
        System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
        codigoIntroducido = s.nextLine();
  
        //Busco la posición donde está el disco en el Array
        i = buscarDisco(discos, codigoIntroducido);
        // do {
        //   i++;
        // } while (!((discos[i].getCodigo()).equals(codigoIntroducido)));
        //discos[i].setCodigo("LIBRE");
        if (i>-1)
        {
          discos = eliminarDisco(discos, i);
          System.out.println("Album borrado.");
        }
        else 
        {
          System.out.println("Disco (" + codigoIntroducido + ") No encontrado");
        }

        break;
        
      default:
      
      } // switch
    } while (opcion != 5);
  }


  /**
   * Inserto dentro del arry un nuevo disco, devolviendo un array de discos con un disco nuevo
   * @param discosArray
   * @param disco
   * @return
   */
  public static Disco[] insertarDisco(Disco[] discosArray, Disco disco)
  {
    Disco[] nuevoArray = new Disco[discosArray.length +1];

    for (int i = 0; i < discosArray.length; i++) 
    {
        Disco discoAux = discosArray[i];
        nuevoArray[i] = discoAux;    
    }

    nuevoArray[nuevoArray.length-1] = disco;

    return nuevoArray;
  }

  public static Disco[] eliminarDisco(Disco[] arrayDiscos, int posicionAEliminar)
  {
    //Creo un array con una posicion menos
    Disco[] nuevoArray = new Disco[arrayDiscos.length-1];

    //recorrer el array original e ir copiando los discos al nuevo PERO me salto la posición que quiero borrar
    for (int i = 0; i < nuevoArray.length; i++) 
    {
        if (i < posicionAEliminar)
        {
          nuevoArray[i] = arrayDiscos[i];
        }
        else if (i > posicionAEliminar)
        {
          nuevoArray[i] = arrayDiscos[i+1];
        }

    }

    return nuevoArray;
  }

  /**
   * Busca el disco según su codigo y devuelve su posicion en el array. Si devuelve -1 es que no lo ha encontrado
   * @param arrayDiscos
   * @param codigoBuscado
   * @return
   */
  public static int buscarDisco(Disco[] arrayDiscos, String codigoBuscado)
  {
    int posicionDisco = -1;

    for (int i = 0; i < arrayDiscos.length; i++) 
    {
      if (arrayDiscos[i].getCodigo().equalsIgnoreCase(codigoBuscado))
      {
        posicionDisco = i;
      }  
    }

    return posicionDisco;
  }


  public static void listadoCompleto(Disco[] discos)
  {
    for(Disco d : discos) 
    { 
        System.out.println(d);      
    }
  }

  public static void listadoXAutor(Disco[] discos, String autor)
  {
    for (Disco disco : discos) 
    {
      if (disco.getAutor().equalsIgnoreCase(autor))
      {
        System.out.println(disco);
      }  

      LocalDate fecha = LocalDate.of(2023, 2, 10);
    }
  }

  public static void listadoXGenero(Disco[] discos, String genero)
  {
    for (Disco disco : discos) 
    {
      if (disco.getGenero().equalsIgnoreCase(genero))
      {
        System.out.println(disco);
      }  
    }
  }

  public static void listadoXDuracion(Disco[] discos, int min, int max)
  {
    for (Disco disco : discos) 
    {
      if (disco.getDuracion()>= min && disco.getDuracion()<= max)
      {
        System.out.println(disco);
      }  
    }
  }


}
