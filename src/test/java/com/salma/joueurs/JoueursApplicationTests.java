package com.salma.joueurs;

import com.salma.joueurs.entities.Joueur;
import com.salma.joueurs.repos.JoueurRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.salma.joueurs.entities.Equipe;


import java.util.Date;
import java.util.List;

@SpringBootTest
class JoueursApplicationTests {
    @Autowired
    private JoueurRepository joueurRepository;

    @Test
    public void testCreateJoueur() {
        Joueur joueur = new Joueur("Debruin",new Date(),"attaquant","salmamarzouk236@gmail.com");
        joueurRepository.save(joueur);
    }
    @Test
    public void testFindJoueur() {
        Joueur j= joueurRepository.findById(2L).get();
        System.out.println(j);
    }
    @Test
    public void testUpdateJoueur() {
        Joueur j= joueurRepository.findById(2L).get();
        j.setPosition("milieu");
        joueurRepository.save(j);
    }
    @Test
    public void testFindJoueurByNom() {
        List<Joueur> jou = joueurRepository.findByNomJoueur("Lamin Yamal");
        for (Joueur j : jou) {
            System.out.println(j);
        }
    }
    @Test
    public void testFindJoueurByNomContains() {
        List<Joueur> jou = joueurRepository.findByNomJoueurContains("l");
        for (Joueur j : jou) {
            System.out.println(j);
        }
    }
    @Test
    public void testDeleteJoueur() {
        joueurRepository.deleteById(1L);
    }
    @Test
    public void testListerTousJoueurs() {
        List<Joueur> joueurs = joueurRepository.findAll();
        for (Joueur j : joueurs) {
            System.out.println(j);
        }
    }
    @Test
    public void testfindByPosition() {
        List<Joueur> joueurs =joueurRepository.findByNomPosition("lamin yamal","attaquant");
        for (Joueur j : joueurs) {
            System.out.println(j);
    }}
    @Test
    public void testfindByEquipe() {
        Equipe eq = new Equipe();
        eq.setIdEq(1L);
        List<Joueur> joueurs = joueurRepository.findByEquipe(eq);
        for (Joueur j : joueurs) {
            System.out.println(j);
        }
    }
    @Test
    public void testfindByEquipeIdEq() {
        List<Joueur> joueurs = joueurRepository.findByEquipeIdEq(1L);
        for (Joueur j : joueurs) {
            System.out.println(j);
        }
    }
    @Test
    public void testfindByOrderByNomJoueurAsc(){
        List<Joueur> joueurs = joueurRepository.findByOrderByNomJoueurAsc();
        for (Joueur j : joueurs) {
            System.out.println(j);
        }
    }
}

