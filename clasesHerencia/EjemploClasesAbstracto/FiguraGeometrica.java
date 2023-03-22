
package clasesHerencia.EjemploClasesAbstracto;


public abstract class FiguraGeometrica {
    private String color;
    
    
    public FiguraGeometrica(String color){
        this.color = color;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract double area();
    public abstract double perimetro(); 
    
    @Override
    public String toString(){
        String cadena = "";
        
        cadena += "\nColor: " + this.color;
        cadena += "\nArea: " + this.area();
        cadena += "\nPerimetro: " + this.perimetro();
        
        return cadena;
        
    }
}
