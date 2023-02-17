package clasesHerencia;

public class Hora {

    //Atributos
    private int minutos;
    private int horas;

    //Constructor
    public Hora(int hora, int minutos)
    {
        this.horas = hora;
        this.minutos = minutos;
    }

    //Metodos
    /**
     * Incremente la hora en un minuto
     */
    public void inc()
    {

        if (!setMinutos(this.minutos+1))
        {
            setMinutos(0);
        }

        
    }

    /**
     * Devuelve true o false según haya sido posible modificar los minutos con el valor nuevo
     * @param minutos
     * @return
     */
    public boolean setMinutos(int valor)
    {
        boolean resultado = false;
        if (valor <= 59)
        {
            this.minutos = valor;
            resultado = true;
        }
        else //Si estoy en el ultimo minuto del la hora entonces la hora se incrementa
        {
            this.minutos = 0;
            if(!setHora(this.horas+1))
            {
                setHora(0);
            }
        }

        return resultado;

    }

    /**
     * Devuelve true o false según haya sido posible modificar los minutos con el valor nuevo
     * @param hora
     * @return
     */
    public boolean setHora(int valor)
    {
        boolean resultado = false;
        if (valor <= 23)
        {
            this.horas = valor;
            resultado = true;
        }

        return resultado;
    }

    @Override
    public String toString()
    {
        return this.horas + ":" + this.minutos;
    }

    @Override
    public boolean equals(Object valor)
    {
        Hora hora = (Hora)valor;

        boolean resultado = false;
        if (this.horas == hora.horas && this.minutos == hora.minutos)
        {
            resultado = true;
        }

        return resultado;
    }
    
}
