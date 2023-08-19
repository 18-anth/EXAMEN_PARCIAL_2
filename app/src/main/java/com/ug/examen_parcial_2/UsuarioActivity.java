
//      ANTHONY ESTUARDO CORDOVA MORENO

package com.ug.examen_parcial_2;

public class UsuarioActivity {
    private String name;
    private String lastname;
    private String email;
    private String year;


    public UsuarioActivity(String name, String lastname, String email, String year) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
