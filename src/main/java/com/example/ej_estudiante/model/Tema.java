
package com.example.ej_estudiante.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tema {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_tema;
    private String nombre;
    @ManyToOne
    @JoinColumn(name="id_curso")
    @JsonBackReference
    private Curso curso;

    public Tema() {
    }

    public Tema(Long id_tema, String nombre, Curso curso) {
        this.id_tema = id_tema;
        this.nombre = nombre;
        this.curso = curso;
    }
    
    
}
