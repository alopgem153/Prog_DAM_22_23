package interfaces;

public class UsoAnimales {

    public static void main(String[] args) {
        
        Perro perro = new Perro("KOKO", "Blanco", false);

        Lobo lobo = new Lobo("Lobo Malvado");

        perro.comer();
        lobo.comer();

        perro.acariciar();
        //lobo.acariciar();

        perro.voz();
        
        Marcota_I.dientes();

    }
    
}
