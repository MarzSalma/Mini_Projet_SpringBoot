package com.salma.joueurs.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idJoueur;
    private String nomJoueur;
    private Date datenaissance;
    private String position;
    private String email;

    @ManyToOne

    private Equipe equipe;

    public Joueur() {
        super();
    }
    public Joueur(String nomJoueur, Date datenaissance, String position, String email) {
        super();
        this.nomJoueur = nomJoueur;
        this.datenaissance = datenaissance;
        this.position = position;
        this.email = email;
    }

    public Long getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(Long idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Equipe getEquipe() {
        return equipe;
    }
    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return "Joueur[idJoueur=" + idJoueur + ", nomJoueur=" + nomJoueur+"date de naissance=" + datenaissance + ", position=" + position + ", email=" + email + "]";
    }
}

