package ClasesT6.Ejemplos;

public class TarjetaRegalo {
    
    //variables
    private String numeroTarjeta;
    private double saldo;


    //constructores
    public TarjetaRegalo(double saldo)
    {
        this.saldo = saldo;
        //Generamos un numero aleatorio de 5 digitos para el numero de tarjeta
        //this.numeroTarjeta = (int)(Math.random()*100000);
        this.numeroTarjeta = generarNumeroTarjeta();
    }


    //Metodos

    public void gasta(double dinero)
    {
        if (this.saldo > dinero && dinero >= 0)
        {
            this.saldo -= dinero;
            //this.saldo = this.saldo - dinero;
        }
        else
        {
            System.out.println("No tienes suficiente saldo para gastar " + dinero);
        }
    }

    /**
     * Devuelve tarjeta nueva con el saldo 
     * de la tarjeta que hace la llamada y la que esta como parametro.
     * Estas tarjetas se quedan con saldo 0;
     * @param tarjeta
     * @return
     */
    public TarjetaRegalo fusionaCon(TarjetaRegalo tarjeta)
    {
        double saldoTotal = this.saldo + tarjeta.saldo;
        
        this.saldo = 0;
        tarjeta.saldo = 0;

        TarjetaRegalo tarjetaNueva = new TarjetaRegalo(saldoTotal);
        return tarjetaNueva;
    }


    private String generarNumeroTarjeta()
    {
        String resultado = "";
        for(int i= 0; i<5; i++)
        {
            int numeroAleatorio = (int)(Math.random()*10);
            resultado += numeroAleatorio;
        }

        return resultado;
    }

    @Override
    public String toString()
    {
        return "Tarjeta Nº " + this.numeroTarjeta + " - Saldo: " + this.saldo; 
    }
}
