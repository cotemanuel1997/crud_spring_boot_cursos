
package com.example.ej_estudiante.controller;

import com.example.ej_estudiante.dto.CursoTemaDTO;
import com.example.ej_estudiante.model.Curso;
import com.example.ej_estudiante.service.ICursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    @Autowired
    private ICursoService cursoServ;
    
   
    
    //1- crear un nuevo curso
    @PostMapping ("/curso/alta")
    public String addCurso(@RequestBody Curso curso){
        cursoServ.addCurso(curso);
        return "Curso guardado";
    }
    //3- obtener todos los cursos
    @GetMapping ("/curso/listar")
    public List<Curso> getCursos(){
        return cursoServ.getCursos();
    }
    
    //4- obtener los cursos de un determinado tema
    @GetMapping ("/curso/listar/{id}")
    @ResponseBody
    public CursoTemaDTO cursosDeUnTema(@PathVariable Long id){
        return cursoServ.cursosDeUnTema(id);
    
    }
    
    //5-obtener los cursos que contengan la palabra java
    @GetMapping ("/curso/java/")
    public List<Curso> getCursosJava(){
        return cursoServ.cursosDeJava();
    }
    //6- modificar datos de un curso
    @PutMapping ("/curso/editar")
    public Curso editCurso(@RequestBody Curso curso){
        return cursoServ.editCurso(curso);
    }
}
