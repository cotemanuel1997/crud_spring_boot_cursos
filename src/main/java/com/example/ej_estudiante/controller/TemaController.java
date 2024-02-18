
package com.example.ej_estudiante.controller;

import com.example.ej_estudiante.model.Curso;
import com.example.ej_estudiante.model.Tema;
import com.example.ej_estudiante.service.ICursoService;
import com.example.ej_estudiante.service.ITemaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemaController {
    @Autowired
    private ITemaService temaServ;
   
    
    //2- crear un nuevo tema y asociar a un curso
    @PostMapping("/tema/alta")
    public String addTema(@RequestBody Tema tema){
        
        
        temaServ.addTema(tema);
       
        return "Tema guardado";
       
    }
    
    @GetMapping("tema/listar")
    public List<Tema> obtenerTema(){
        return temaServ.obtenerTemas();
    }
    
    //7- modificar datos de un tema
    
    @PutMapping("tema/editar")
    public Tema editTema(@RequestBody Tema tema){
        return temaServ.editTema(tema);
    }
}
