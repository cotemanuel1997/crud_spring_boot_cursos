
package com.example.ej_estudiante.service;

import com.example.ej_estudiante.dto.CursoTemaDTO;
import com.example.ej_estudiante.model.Curso;
import com.example.ej_estudiante.repository.ICursoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService{
    
    @Autowired
    ICursoRepository cursoRepo;
    
    
    @Override
    public void addCurso(Curso curso) {
        cursoRepo.save(curso);
    }

    @Override
    public List<Curso> getCursos() {
        return cursoRepo.findAll();
    }

    @Override
    public Curso getCursoById(Long id) {
        return cursoRepo.findById(id).orElse(null);
    }

    @Override
    public Curso editCurso(Curso curso) {
        this.addCurso(curso);
        return this.getCursoById(curso.getId_curso());
       
    }


    @Override
    public CursoTemaDTO cursosDeUnTema(Long id) {
        CursoTemaDTO cursoTemaDTO = new CursoTemaDTO();
        Curso curso = cursoRepo.findById(id).orElse(null);
        cursoTemaDTO.setNombre_curso(curso.getNombre());
        cursoTemaDTO.setTemas(curso.getTemas());
        
        return cursoTemaDTO;
    }

    @Override
    public List<Curso> cursosDeJava() {
        List<Curso> cursos = this.getCursos();
        List<Curso> cursosJava = new ArrayList<>();
        String palabra = "Java";
        for(Curso curso : cursos){
           if (curso.getNombre().contains(palabra)){
               cursosJava.add(curso);
           }
        }
        
        return cursosJava;
    }

   

   
    
}
