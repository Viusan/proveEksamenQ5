package com.example.proveeksamenq5.models;
import jakarta.validation.constraints.Pattern;

public class Person {
    private int id;

    @Pattern(regexp = "^[A-ZÆØÅ][a-zæøå]+([\\- ][A-ZÆØÅ][a-zæøå]+)*$", message="Username invalid")
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getID(){return id;}
    public void setID(int id){this.id = id;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}
}
