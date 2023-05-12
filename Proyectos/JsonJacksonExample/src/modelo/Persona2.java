package modelo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Persona2 {

    @JsonProperty("firstName")
    private String nombre;
    private String lastName;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
        return "Persona [firstName=" + nombre + ", lastName=" + lastName + ", age=" + age + "]";
    }

    
    
}
