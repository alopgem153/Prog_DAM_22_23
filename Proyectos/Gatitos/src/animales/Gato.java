package animales;

public class Gato {

    private String nombre;
    private String raza;
    private String sexo;


    public Gato(String nombre, String raza, String sexo)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
    }


    public Gato apareaCon(Gato pareja) 
    {
        Gato hijo = null;
        try 
        {
            if (this.sexo.equals(pareja.sexo))
            {
                throw new ExcepcionApareamientoImposible(this.nombre, pareja.nombre);
            }
            else
            {
                double tipoSexo = Math.random();
                if (tipoSexo>0.5)
                {
                    hijo = new Gato(this.nombre+"Junior", this.raza, "M");
                }
                else
                {
                    hijo = new Gato(this.nombre+"Junior", this.raza, "H");
                }

            }

            
        }
        catch(ExcepcionApareamientoImposible exApareaminto)
        {
            System.out.println(exApareaminto.toString());
            System.out.println(exApareaminto.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        return hijo;

    }


    @Override
    public String toString() {
        
        return this.nombre + " " + this.raza + " " + this.sexo;
    }
    
}
