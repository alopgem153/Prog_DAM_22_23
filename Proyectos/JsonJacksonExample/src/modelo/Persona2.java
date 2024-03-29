package modelo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Persona2 {

    @JsonProperty("firstName")
    private String nombre;
    @JsonProperty("lastName")
    private String apellido;
    private String gender;
    private Integer age;
    private String number;

    public Persona2()
    {

    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String firstName) {
        this.nombre = firstName;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String lastName) {
        this.apellido = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Persona [firstName=" + nombre + ", lastName=" + apellido + ", age=" + age + "]";
    }

    
    
}
