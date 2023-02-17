package clasesHerencia;

public class Piano extends Instrumento
{

    public Piano()
    {
        super();
    }

    @Override
    public void interpretar()
    {
        for (Notas nota : this.melodia) {
            System.out.println(" Piano: "+ nota);
        }
    }
}
