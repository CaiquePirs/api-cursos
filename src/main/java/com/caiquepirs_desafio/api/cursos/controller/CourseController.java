package com.caiquepirs_desafio.api.cursos.controller;

import com.caiquepirs_desafio.api.cursos.model.CourseEntity;
import com.caiquepirs_desafio.api.cursos.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/create")
    public CourseEntity create(@RequestBody CourseEntity courseEntity){
        courseEntity.setActive(true);
        courseService.create(courseEntity);
        return courseEntity;
    }

    @GetMapping("/search")
    public List<CourseEntity> searchAll(){
        return courseService.searchAllCourses();
    }




}
