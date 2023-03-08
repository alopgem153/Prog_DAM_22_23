package clasesHerencia;

import java.text.DecimalFormat;

import ClasesT6.Ejemplos.Terminal;

public class Movil extends Terminal {

    public enum Tarifa { RATA, MONO, BISONTE }; // 6, 12 y 30 cts por minuture respectivamente

    //Nuevo Atributo
    private Tarifa tarifa;
    private double tiempoTarificado;

    //constructor
    public Movil(String numero, String tarifa)
    {
        super(numero);

        //Lo convierto en mayúsculas como los nombre de las tarifas posibles
        tarifa = tarifa.toUpperCase();
        Tarifa tarifaEnum = Tarifa.valueOf(tarifa);
        this.tarifa = tarifaEnum;
    }

    @Override
    public void llama(Terminal terminaldestino, int duracion)
    {
        super.llama(terminaldestino, duracion);
        
        this.tiempoTarificado += duracion;
    }

    @Override
    public String toString()
    {
        DecimalFormat formatoDecimal = new DecimalFormat("#.##");

        String cadena = "";
        cadena = super.toString() + " - Tarificados " + formatoDecimal.format(totalTarificado()) + " euros" + " tiempoTarificado:" + this.tiempoTarificado; 
        return cadena;
    }

    public double totalTarificado()
    {
        double total = 0;

        switch(this.tarifa)
        {
            case RATA:
                total = (this.tiempoTarificado/60) * 0.06;
                break;
            case MONO:
               
                total = (this.tiempoTarificado/60) * 0.12;
                break;
            case BISONTE:
                total = (this.tiempoTarificado/60) * 0.3;
                break;
            default:
                total = 0;
                break;
        }

        return total;
    }




}
