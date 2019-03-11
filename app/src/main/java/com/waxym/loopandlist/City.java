package com.waxym.loopandlist;

//City est le modèle que je vais utiliser dans mon activity
public class City {

    //Liste des variables d'une "City"
    String name;
    int notation;
    String country;

    //Cette fonction est le CONSTRUCTEUR de "City"
    public City(String name, int notation, String country) {
        this.name = name;
        this.notation = notation;
        this.country = country;
    }

    // Un "Getter" permet de récupérer la donnée
    public String getName() {
        return name;
    }

    // Un "Setter" permet de l'éditer
    public void setName(String name) {
        this.name = name;
    }

    public int getNotation() {
        return notation;
    }

    public void setNotation(int notation) {
        this.notation = notation;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
