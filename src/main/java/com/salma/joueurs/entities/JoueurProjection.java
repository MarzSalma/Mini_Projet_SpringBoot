package com.salma.joueurs.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="nomjoueur",types={Joueur.class})
public interface JoueurProjection {
    public String getNomJoueur();
}
