/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesHerencia.EjemploClasesAbstracto;

/**
 *
 * @author ricardo
 */
public class Circulo extends FiguraGeometrica {
    
    private double radio;
    
      
    public Circulo(double radio, String color){
        super(color);
        if (radio > 0)
            this.radio = radio;
        else
            this.radio = 1;
    }


    public double getRadio() {
        return this.radio;
    }


    public void setRadio(double radio) {
        
        if (radio > 0)
            this.radio = radio;
    }

   

    @Override
    public double area() {
        
        return 2*Math.PI*this.radio;
    }

    @Override
    public double perimetro() {
        
        return Math.PI * (Math.pow(this.radio, 2));
    }
    
    
    public String toString(){
        String cadena = "";
        
        cadena += "\n --CIRCULO--";
        cadena += "\nRadio: " + this.radio;
        cadena += super.toString();
        
        return cadena; 
    }
    
}
