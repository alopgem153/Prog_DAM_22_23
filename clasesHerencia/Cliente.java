package clasesHerencia;

public class Cliente extends Persona {

    //Atributos
    String cif;

    public Cliente()
    {

    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    @Override
    public void mostrarDatos()
    {
        super.mostrarDatos();
        System.out.println("CIF: " + getCif());
    }

    
    
}
