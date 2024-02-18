
package com.example.ej_estudiante.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_curso;
    private String nombre;
    @OneToMany (mappedBy = "curso")
    @JsonManagedReference
    private List<Tema> temas;

    public Curso() {
    }

    public Curso(Long id_curso, String nombre, List<Tema> temas) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.temas = temas;
    }
}
