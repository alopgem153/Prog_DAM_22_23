package interfaces;

public class Perro implements Animal_I, Marcota_I 
{
    //Atributos
    private String nombre;    
    private String colorPelo;
    private boolean esDeRaza;

    public Perro(String nombre, String colorPelo, boolean deRaza)
    {
        this.nombre = nombre;
        this.colorPelo = colorPelo;
        esDeRaza = deRaza;
    }

    @Override
    public void acariciar() {
        System.out.println(" Acaricio el Perro");
    }

    @Override
    public void vacunar(String nombreVacuna) {
        System.out.println("Le pongo al perro la vacuna: " + nombreVacuna);
    }

    @Override
    public void pasear() {
       System.out.println("Paseo a mi perro");
    }

    @Override
    //Aunque comer() es del interfaz Animal y tambien del interfaz Mascota solo se implementa una vez
    public void comer() {
       System.out.println("Perro come Carne");
    }

    @Override
    public String nombreCientifico() {
        return "CANIS_CAN";
    }

    @Override
    public void dormir() {
        System.out.println("Zzzzz (Perro)");
    }

    @Override
    public void voz()
    {
        System.out.println("GUAU!");
    }

    
}
