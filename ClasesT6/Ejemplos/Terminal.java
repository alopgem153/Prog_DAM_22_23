package Prog_DAM_22.ClasesT6.Ejemplos;

public class Terminal {
    
    //Atributos de la clase
    String numero;
    int tiempoConversacion;

    //Constructores
    public Terminal(String numero)
    {
      this.numero = numero;
      tiempoConversacion = 0;
    }

    //Metodos
    public void llama(Terminal terminaldestino, int duracion)
    {
      this.tiempoConversacion += duracion;
      terminaldestino.tiempoConversacion += duracion;    
    }

    @Override
    public String toString()
    {
      return "Nº " + this.numero + " - " +  this.tiempoConversacion + " segundos de conversación ";  
    }
}
