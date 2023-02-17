package clasesHerencia;

public class HoraExacta extends Hora
{
    //Atributos
    private int segundos;
    
    //Constructor
    public HoraExacta(int hora, int minuto, int segundos)
    {
        //Utilizo el constructor del padre
        super(hora, minuto);
        this.segundos = segundos;
    }

    //Métodos
    public boolean setSegundo(int valor)
    {
        boolean resultado = false;
        if (valor <= 59)
        {
            this.segundos = valor;
            resultado = true;
        }

        return resultado;
    }

    @Override
    public void inc()
    {
        if (!setSegundo(this.segundos+1))
        {
            this.segundos = 0;
            super.inc();
        }
    }

    @Override
    public String toString()
    {
        return super.toString() + ":" +  this.segundos; 
    }

    @Override
    public boolean equals(Object hora)
    {
        HoraExacta horaAComparar = (HoraExacta)hora;

        boolean resultado = false;

        if (this.segundos == horaAComparar.segundos && super.equals(horaAComparar))
        {
            resultado = true;
        }

        return resultado;
    }
}
