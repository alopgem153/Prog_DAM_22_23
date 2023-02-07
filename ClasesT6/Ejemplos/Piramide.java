package ClasesT6.Ejemplos;

public class Piramide {

    //Atributos
    private int altura;

    private static int piramidesCreadas;

    //Contructor
    public Piramide(int altura)
    {
        this.altura = altura;

        piramidesCreadas++;
    }

    //Metodos
    @Override
    public String toString()
    {
        String resultado = "";

        for (int i = 0; i < altura+1; i++) 
        {
            //Pintamos los espacion
            for(int j = 0; j< altura - i; j++)
            {
                resultado = resultado + " ";
            }
            //pinto la mitad izquierda de la piramide
            for (int j = 0; j < i; j++) 
            {
                resultado  = resultado + "*";
            }
            //pinta la mitad derecha de la piramide
            for (int j = 0; j < i-1; j++) 
            {
                resultado  = resultado + "*";
            }

            resultado = resultado + "\n";
            
        }


        return resultado;
    }

    public static int getPiramidesCreadas()
    {
        return piramidesCreadas;
    }
    
}
