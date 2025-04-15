package com.caiquepirs_desafio.api.cursos.repository;

import com.caiquepirs_desafio.api.cursos.model.CursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<CursoEntity, Integer> {
}
