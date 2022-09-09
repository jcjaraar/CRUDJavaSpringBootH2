package com.juanma.pokemon.controller;

import com.juanma.pokemon.model.Entrenador;
import com.juanma.pokemon.service.EntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EntrenadorController {

    @Autowired
    EntrenadorService entrenadorService;

    @GetMapping("/entrenador")
    private List<Entrenador> verEntrenador(){
        return entrenadorService.verEntrenador();
    }

    @PostMapping("/entrenador")
    private void crearEntrenador(@RequestBody Entrenador entrenador){
        entrenadorService.crearYActualizarEntrenador(entrenador);
    }

    @DeleteMapping("/entrenador/{id}")
    private void eliminarEntrenador(@PathVariable("id") Long id){
        entrenadorService.eliminarEntrenador(id);
    }

    @PutMapping("/entrenador")
    private void editarEntrenador(@RequestBody Entrenador entrenador){
        entrenadorService.crearYActualizarEntrenador(entrenador);
    }

}