
package com.example.ej_estudiante.service;

import com.example.ej_estudiante.model.Tema;
import com.example.ej_estudiante.repository.ITemaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemaService implements ITemaService{
    @Autowired
    private ITemaRepository temaRepo;
    @Override
    public void addTema(Tema tema) {
        temaRepo.save(tema);
        
    }

    @Override
    public Tema findTema(Long id) {
        return temaRepo.findById(id).orElse(null);
    }

    @Override
    public List<Tema> obtenerTemas() {
        return temaRepo.findAll();
    }

    @Override
    public Tema editTema(Tema tema) {
        this.addTema(tema);
        return this.findTema(tema.getId_tema());
    }
    
}
