package com.caiquepirs_desafio.api.cursos.repository;

import com.caiquepirs_desafio.api.cursos.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    public List<Curso> findByName(String nome);
    public List<Curso> findByCategory(String categoria);

}
