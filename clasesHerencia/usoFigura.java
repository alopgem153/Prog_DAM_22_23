package clasesHerencia;

public class usoFigura {
    
    public static void main(String[] args) {
      
        FiguraGeometica[] coleccion = new FiguraGeometica[4];
       
        coleccion[0] = new Rectangulo(3,5.6,"Verde");
        coleccion[1] = new Triangulo(6,7.8,"Azul");
        coleccion[2] = new Cuadrado(5,"Amarillo");
        coleccion[3] = new Circulo(2.2,"Marrón");
       
       System.out.println(coleccion[0].color );
       
        for (FiguraGeometica tri: coleccion) {
            System.out.println(tri.toString());
            if (tri instanceof Cuadrado){
                ((Cuadrado)tri).pintar();
            }
        }
    }
 
}
