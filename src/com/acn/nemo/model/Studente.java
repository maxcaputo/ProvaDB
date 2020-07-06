package com.acn.nemo.model;

public class Studente {

    private int Id;
    private String username;
    private String lastname;


    public Studente() {
    }

    public Studente(int id, String username, String lastname) {
        Id = id;
        this.username = username;
        this.lastname = lastname;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
