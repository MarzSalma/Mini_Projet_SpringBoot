package com.salma.joueurs.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.salma.joueurs.entities.Joueur;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.salma.joueurs.entities.Equipe;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="rest")
public interface JoueurRepository extends JpaRepository<Joueur, Long> {
    List<Joueur> findByNomJoueur(String nom);
    List<Joueur> findByNomJoueurContains(String nom);

    @Query("select j from Joueur j where j.nomJoueur like :nom and j.position = :position")
    List<Joueur> findByNomPosition(@Param("nom") String nom, @Param ("position") String position);

    @Query("select j from Joueur j where j.equipe = ?1")
    List<Joueur> findByEquipe (Equipe equipe);

    List<Joueur> findByEquipeIdEq(Long id);

    List<Joueur> findByOrderByNomJoueurAsc();


}
