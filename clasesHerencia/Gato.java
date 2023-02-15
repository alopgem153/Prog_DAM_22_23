package clasesHerencia;

public class Gato extends Mascota { // clase hija
        
    public void sonidoMascota() {
               super.sonidoMascota(); 
            System.out.println("El Gato dice miauuuu");
        }
}