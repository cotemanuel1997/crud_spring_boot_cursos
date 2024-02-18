
package com.example.ej_estudiante.repository;

import com.example.ej_estudiante.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoRepository extends JpaRepository<Curso, Long>{
    
}
