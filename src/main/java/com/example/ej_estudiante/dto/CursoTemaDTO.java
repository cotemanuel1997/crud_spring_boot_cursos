
package com.example.ej_estudiante.dto;

import com.example.ej_estudiante.model.Tema;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CursoTemaDTO {
    private String nombre_curso;
    private List<Tema> temas;

    public CursoTemaDTO() {
    }

    public CursoTemaDTO(String nombre_curso, List<Tema> temas) {
        this.nombre_curso = nombre_curso;
        this.temas = temas;
    }
    
}
