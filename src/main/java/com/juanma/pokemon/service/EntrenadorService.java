package com.juanma.pokemon.service;

import com.juanma.pokemon.model.Entrenador;
import com.juanma.pokemon.repository.EntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EntrenadorService {

    @Autowired
    EntrenadorRepository entrenadorRepository;

    public void crearYActualizarEntrenador(Entrenador entrenador){
        entrenadorRepository.save(entrenador);
    }

    public List<Entrenador> verEntrenador(){
        List<Entrenador> entrenadors = new ArrayList<Entrenador>();
        entrenadors.addAll(entrenadorRepository.findAll());
        return entrenadors;
    }

    public void eliminarEntrenador(Long id){
        entrenadorRepository.deleteById(id);
    }

}