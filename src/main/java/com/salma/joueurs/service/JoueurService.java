package com.salma.joueurs.service;

import java.util.List;
import com.salma.joueurs.entities.Joueur;

public interface JoueurService {
    Joueur saveJoueur(Joueur joueur);
    Joueur updateJoueur(Joueur joueur);
    void deleteJoueur(Joueur joueur);
    void deleteJoueurById(Long id);
    Joueur getJoueur(Long id);
    List<Joueur> getAllJoueurs();
    List<Joueur> findByNomJoueur(String nom);
    List<Joueur> findByNomJoueurContains(String nom);
    List<Joueur> findByNomPosition(String nom, String position);
    List<Joueur> findByNomEquipe(String nom, String equipe);
    List<Joueur> findByNomEquipeIdEq(Long id);
    List<Joueur> findByOrderByNomJoueurAsc();
}
