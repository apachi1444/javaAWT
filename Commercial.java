package com.company.Exame;

import java.util.Objects;
import java.util.Set;

public class Commercial {
    String matricule ;
    String nom ;
    String prenom ;
    Set<Produit> list ;

    public Commercial(String matricule , String nom , String prenom , Set<Produit> list){
        this.matricule=matricule;
        this.list = list ;
        this.nom = nom;
        this.prenom = prenom;
    }

    public boolean equals(Object o){
        if ( o != null && this.getClass() != o.getClass()) return false ;
        Commercial commercial = (Commercial) o;
        return this.matricule == commercial.matricule;
    }

    public int hashCode(){
        return Objects.hash(matricule);
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Set<Produit> getList() {
        return list;
    }

    public void setList(Set<Produit> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return matricule;
    }
}
