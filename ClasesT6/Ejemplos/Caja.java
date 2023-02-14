package ClasesT6.Ejemplos;

public class Caja {

    private double saldo;

    public Caja() {
        this.saldo = 1000;
    }

    /**
     * Devuelve el saldo de la caja en ese momento
     * 
     * @return
     */
    public double saldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
