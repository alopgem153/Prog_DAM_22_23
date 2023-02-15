package clasesHerencia;

public class Perro  extends Mascota { 
    
    public void sonidoMascota() {
        super.sonidoMascota(); 
        System.out.println("El Perro dice guaauu");
    }
}