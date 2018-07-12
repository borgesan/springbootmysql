package com.borgesan.bean;


public class RestPokemon {

    private Long Id;
    private String name;
    private String type;

    public RestPokemon() {

    }

    public RestPokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
