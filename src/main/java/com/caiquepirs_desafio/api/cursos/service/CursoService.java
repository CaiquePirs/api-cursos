package com.caiquepirs_desafio.api.cursos.service;

import com.caiquepirs_desafio.api.cursos.model.CursoEntity;
import com.caiquepirs_desafio.api.cursos.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;


    public void create(CursoEntity cursoEntity){
        cursoRepository.save(cursoEntity);
    }


}
