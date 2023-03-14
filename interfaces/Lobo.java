package interfaces;

public class Lobo implements Animal_I
{
    private String nombre;    
    private String colorPelo;
    
    public Lobo(String nombre)
    {
        this.nombre = nombre;
        colorPelo = "negro";
    }

    @Override
    public void comer() {
        System.out.println("A Caperuzita");
    }

    @Override
    public String nombreCientifico() {
        return "CAN_SALVAGE";
    }

    @Override
    public void dormir() {
       System.out.println("ZZZZZzzzzzz (Lobo)");
    }

    
}
