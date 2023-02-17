package clasesHerencia;

public abstract class Instrumento {
    
    public enum Notas { DO, RE, MI, FA, SOL, LA, SI};

    //ATRIBUTOS
    protected Notas[] melodia;

    public Instrumento()
    {
        melodia = new Notas[0];
    }

    //Metodos
    public void add(Notas nota)
    {
        Notas[] nuevaMelodia = new Notas[this.melodia.length+1];

        for (int i = 0; i < this.melodia.length; i++) 
        {
            nuevaMelodia[i] = this.melodia[i];    
        }

        nuevaMelodia[nuevaMelodia.length-1] = nota;

        this.melodia = nuevaMelodia;
    }

    abstract void interpretar();



}
