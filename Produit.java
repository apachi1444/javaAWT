package com.company.Exame;

import java.util.Objects;

public class Produit {
    int id ;

    String nom ;
    String description;
    double prix ;
    public Produit(String nom , String description , double prix){
        this.description = description;
        this.nom= nom ;
        this.prix=prix;
    }

    public  int getId() {
        return id;
    }

    public  void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean equals(Object o ){
        if ( this == o) return true ;
        if ( o != null && (getClass() != o.getClass())) return false ;
        Produit p = (Produit) o;
        return p.getId() == this.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
