package com.caiquepirs_desafio.api.cursos.service;

import com.caiquepirs_desafio.api.cursos.model.Curso;
import com.caiquepirs_desafio.api.cursos.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository repository;

    public void criar(Curso curso){
        repository.save(curso);
    }

    public List<Curso> buscar(){
        return repository.findAll();
    }

    public List<Curso> pesquisarNome(String nome){
        return repository.findByName(nome);
    }

    public List<Curso> pesquisarCategoria(String categoria){
        return repository.findByCategory(categoria);
    }

    public void atualizar(Curso curso){
        repository.save(curso);
    }

    public void excluir(long id){
        repository.deleteById(id);
    }

}
