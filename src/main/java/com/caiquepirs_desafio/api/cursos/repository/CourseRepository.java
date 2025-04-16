package com.caiquepirs_desafio.api.cursos.repository;

import com.caiquepirs_desafio.api.cursos.model.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {
}
