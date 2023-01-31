package ClasesT6.Ejemplos;

public class Horas {

    //Atributos
    private int horas;
    private int minutos;
    private int segundos;

    //Contructor
    public Horas(int hora)
    {
        if (hora < 0 || hora > 23)
        {
            //hora introducida incorrecta
            //Inicializamos a las 0 horas
            this.horas = 0;
            System.out.println("Error de hora");
        }
        else
        {
            this.horas = hora;
        }

        this.minutos = 0;
        this.segundos = 0;
    }

    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        if(horas >= 0 && horas <= 23)
        {
            this.horas = horas;
        }
        else
        {
            System.out.println("Error, la hora debe tener un valor entre 0 y 23");
        }
    }
    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        if (minutos>= 0 && minutos <= 59)
        {
            this.minutos = minutos;
        }
        else
        {
            System.out.println("Error, los minutos deben tener un valor entre 0 y 59");
        }
    }
    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        if (minutos>= 0 && minutos <= 59)
        {
            this.segundos = segundos;
        }
        else
        {
            System.out.println("Error, los segundos deben tener un valor entre 0 y 59");
        }
    }

    public String impresion()
    {
        return this.horas + ":"+ this.minutos + ":" + this.segundos;
    }

    public void addSegundo()
    {
        if (this.segundos == 59)
        {
            this.segundos = 0;
            this.addMinuto();
        }
        else
        {
            this.segundos += 1;
        }

    }

    private void addMinuto()
    {
        if (this.minutos == 59)
        {
            this.minutos = 0;
            this.addHora();
        }
        else
        {
            this.minutos += 1;
        }
    }

    private void addHora()
    {
        if (this.horas == 23)
        {
            this.horas = 0;
        }
        else
        {
            this.horas += 1;
        }
    }
    
}
