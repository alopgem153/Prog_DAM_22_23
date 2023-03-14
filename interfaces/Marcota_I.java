package interfaces;

public interface Marcota_I {
    
    public void acariciar();
    public void vacunar(String nombreVacuna);
    public void pasear();
    public void comer();

    default void voz()
    {
        System.out.println("GRRRRrrrrrrr");
    }
    static void dientes()
    {
        System.out.println("30 dientes");
    }

}
