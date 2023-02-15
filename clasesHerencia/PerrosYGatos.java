package clasesHerencia;

public class PerrosYGatos {
   
    public static void main(String[] args) {
        Mascota gato = new Gato(); // instanciamos un objeto
        Mascota perro = new Perro(); //instanciamos otro objeto
        gato.sonidoMascota();
        perro.sonidoMascota();
    }

}
