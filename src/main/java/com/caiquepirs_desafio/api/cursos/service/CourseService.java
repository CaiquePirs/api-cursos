package com.caiquepirs_desafio.api.cursos.service;

import com.caiquepirs_desafio.api.cursos.model.CourseEntity;
import com.caiquepirs_desafio.api.cursos.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public void create(CourseEntity courseEntity){
        courseRepository.save(courseEntity);
    }

    public List<CourseEntity> searchAllCourses(){
        return courseRepository.findAll();
    }


}
