package ClasesT6.Ejemplos;

public class Rectangulo {
    
    //Atributos
    private int base;
    private int altura;
    //Propiedad estática para controlar el numero de rectangulos creados
    private static int rectangulosCreados;

    //Constructor
    public Rectangulo(int base, int altura)
    {
        this.base = base;
        this.altura = altura;

        //Al crer un nuevo rectangulo entonces aumento el atributo estatico de rectangulos creados
        rectangulosCreados++;
    }

    //Métodos
    @Override
    public String toString()
    {
        String resultado = "";

        //con este for externo pinto cada una de las lineas del rectangulo
        for (int i = 0; i < altura; i++) 
        {

            //con este for interno pinto una linea del restangulo
            for (int j = 0; j < base; j++) 
            {
                resultado = resultado +"*";      
            }
            resultado = resultado + "\n";
              
        }

        return resultado;

    }

    public static int getRectangulosCreados()
    {
        return rectangulosCreados;
    }

}
