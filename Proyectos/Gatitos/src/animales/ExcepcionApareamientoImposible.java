package animales;

public class ExcepcionApareamientoImposible extends Exception {

    public ExcepcionApareamientoImposible()
    {
        super();
    }

    public ExcepcionApareamientoImposible(String cadena1, String cadena2)
    {
        super("Los gatos"+ cadena1 + " y " + cadena2 + "son del mismo sexo");
        
    }

    @Override
    public String toString() {
        return "Son del mismo sexo, no pueden tener gatitos";
        //return getMessage();
    }



}
