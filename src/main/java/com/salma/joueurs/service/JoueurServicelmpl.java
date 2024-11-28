package com.salma.joueurs.service;

import java.util.List;

import com.salma.joueurs.entities.Joueur;
import com.salma.joueurs.repos.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoueurServicelmpl implements JoueurService {
    @Autowired
    JoueurRepository joueurRepository;
    @Override
    public Joueur saveJoueur(Joueur joueur){
        return joueurRepository.save(joueur);
    }

    @Override
    public Joueur updateJoueur(Joueur joueur){
        return joueurRepository.save(joueur);
    }
    @Override
    public void deleteJoueur(Joueur joueur){
        joueurRepository.delete(joueur);
    }
    @Override
    public void deleteJoueurById(Long id){
        joueurRepository.deleteById(id);
    }
    @Override
    public Joueur getJoueur(Long id){
        return joueurRepository.findById(id).get();
    }
    @Override
    public List<Joueur> getAllJoueurs(){
        return joueurRepository.findAll();
    }
    @Override
    public List<Joueur> findByNomJoueur(String nom) {
        return joueurRepository.findByNomJoueur(nom);
    }

    @Override
    public List<Joueur> findByNomJoueurContains(String nom) {
        return joueurRepository.findByNomJoueurContains(nom);
    }

    @Override
    public List<Joueur> findByNomPosition(String nom, String position) {
        return joueurRepository.findByNomPosition(nom, position);
    }

    @Override
    public List<Joueur> findByNomEquipe(String nom, String equipe) {
        throw new UnsupportedOperationException("Méthode non implémentée dans le repository.");
    }

    @Override
    public List<Joueur> findByNomEquipeIdEq(Long id) {
        return joueurRepository.findByEquipeIdEq(id);
    }

    @Override
    public List<Joueur> findByOrderByNomJoueurAsc() {
        return joueurRepository.findByOrderByNomJoueurAsc();
    }
}
