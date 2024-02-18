
package com.example.ej_estudiante.repository;

import com.example.ej_estudiante.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITemaRepository extends JpaRepository <Tema, Long>{
    
}
