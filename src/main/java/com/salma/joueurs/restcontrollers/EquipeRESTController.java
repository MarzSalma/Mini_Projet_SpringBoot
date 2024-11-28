package com.salma.joueurs.restcontrollers;

import java.util.List;
import com.salma.joueurs.entities.Equipe;
import com.salma.joueurs.repos.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Eq")
@CrossOrigin(origins = "http://localhost:4200")
public class EquipeRESTController {
    @Autowired
    EquipeRepository equipeRepository;

    @RequestMapping(method = RequestMethod.GET)

    public List<Equipe> getAllEquipe() {
        return equipeRepository.findAll();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Equipe getEquipeById(@PathVariable("id") Long id) {
        return equipeRepository.findById(id).get();
    }

    }

