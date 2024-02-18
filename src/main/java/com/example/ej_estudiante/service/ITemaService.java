
package com.example.ej_estudiante.service;

import com.example.ej_estudiante.model.Tema;
import java.util.List;

public interface ITemaService {
    public void addTema(Tema tema);
    public Tema findTema(Long id);
    public List<Tema> obtenerTemas();
    public Tema editTema(Tema tema);
}
