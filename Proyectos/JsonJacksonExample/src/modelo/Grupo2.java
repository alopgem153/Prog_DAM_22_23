package modelo;

import java.util.List;

public class Grupo2 {

    private List<Persona2> people;

    public Grupo2()
    {

    }

    public List<Persona2> getPeople() {
        return people;
    }

    public void setPeople(List<Persona2> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        String resutado = "";
        for (Persona2 persona : people) {
            
            resutado += persona + "\n";
        }

        return resutado;
    }
    
}
