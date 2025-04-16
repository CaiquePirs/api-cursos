package com.caiquepirs_desafio.api.cursos.controller;

import com.caiquepirs_desafio.api.cursos.model.CursoEntity;
import com.caiquepirs_desafio.api.cursos.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @PostMapping("/create")
    public CursoEntity create(@RequestBody CursoEntity cursoEntity){
        cursoEntity.setActive(true);
        cursoService.create(cursoEntity);
        return cursoEntity;
    }

    @GetMapping("/search")
    public List<CourseEntity> searchAll(){
        return courseService.searchAllCourses();
    }




}
