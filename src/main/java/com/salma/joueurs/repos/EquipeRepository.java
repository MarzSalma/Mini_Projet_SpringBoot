package com.salma.joueurs.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.salma.joueurs.entities.Equipe;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource(path = "Eq")
@CrossOrigin(origins = "http://localhost:4200")
public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}
