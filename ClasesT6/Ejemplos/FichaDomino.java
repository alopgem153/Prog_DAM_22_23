package ClasesT6.Ejemplos;

public class FichaDomino {

    //Atributos
    private int lado1;
    private int lado2;

    //Constructores
    public FichaDomino(int lado1, int lado2)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Metodos
    public FichaDomino voltea()
    {
        int ladoAuxiliar = this.lado1;
        this.lado1 = this.lado2;
        this.lado2 = ladoAuxiliar;

        return this;
    }

    public boolean encaja(FichaDomino fichaDomino)
    {
        boolean encajan = false;

        if (this.lado1 == fichaDomino.lado1 || this.lado1 == fichaDomino.lado2 ||
                this.lado2 == fichaDomino.lado1 || this.lado2 == fichaDomino.lado2)
        {
            encajan = true;
        }

        return encajan;
    }

    @Override
    public String toString()
    {
        return "["+this.lado1+"|"+this.lado2+"]";
    }
}
