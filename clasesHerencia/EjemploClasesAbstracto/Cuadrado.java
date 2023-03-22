/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesHerencia.EjemploClasesAbstracto;


public class Cuadrado extends FiguraGeometrica{
    
    private Rectangulo rect;
    

    public Cuadrado (double lado, String color){
        super(color);
        if (lado > 0)
            rect = new Rectangulo(lado,lado,color);
        else
            rect = new Rectangulo(1,1,color);
    }
    
    public double getLado(){
        return rect.getAltura();
    }
    
    public void setLado(double lado){
        rect.setAltura(lado);
        rect.setBase(lado);
    }
    
    
    @Override
    public double area() {
        return rect.area();
    }

    @Override
    public double perimetro() {
        return rect.perimetro();
    }
    
    public String toString(){
        String cadena = "";
        
        cadena += "\n --CUADRADO--";
        cadena += "\nLado: " + this.getLado();
        cadena += super.toString();
        
        return cadena; 
    }
    
    
    public void pintar(){
        
        for (int fila = 0; fila < this.getLado(); fila++){
            for (int col = 0; col < this.getLado(); col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    
    
    
    
    
    
    
}
