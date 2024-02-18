
package com.example.ej_estudiante.service;

import com.example.ej_estudiante.dto.CursoTemaDTO;
import com.example.ej_estudiante.model.Curso;
import com.example.ej_estudiante.model.Tema;
import java.util.List;
import java.util.Optional;

public interface ICursoService {
    
    public void addCurso(Curso curso);
    
    public List<Curso> getCursos();
    
    public Curso getCursoById(Long id);
    
    public Curso editCurso(Curso curso);
    
    public CursoTemaDTO cursosDeUnTema(Long id);
    
    public List<Curso> cursosDeJava();
    
}
