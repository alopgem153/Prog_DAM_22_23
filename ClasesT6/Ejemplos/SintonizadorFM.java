package ClasesT6.Ejemplos;

public class SintonizadorFM {
    

    //Atributos
    private double frecuencia;

    //Constructor
    public SintonizadorFM()
    {
        this.frecuencia = 80;
    }

    public SintonizadorFM(double frecuencia)
    {
        if(frecuencia>=80 && frecuencia <= 108)
        {
            this.frecuencia = frecuencia;
        }
        else if(frecuencia<80)
        {
            this.frecuencia = 80;
        }
        else 
        {
            this.frecuencia = 108;
        }

    }

    //Metodos
    public void up()
    {
        this.frecuencia += 0.5;
        if (this.frecuencia > 108)
        {
            this.frecuencia = 80;
        }
    }

    public void down()
    {
        this.frecuencia -= 0.5;
        if (this.frecuencia < 80)
        {
            this.frecuencia = 108;
        }


    }

    public void display()
    {
        System.out.println("Frecuencia= " + this.frecuencia  + " MHz");
    }


}
