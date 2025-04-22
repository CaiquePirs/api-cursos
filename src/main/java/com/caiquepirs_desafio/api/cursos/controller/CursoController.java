package com.caiquepirs_desafio.api.cursos.controller;

import com.caiquepirs_desafio.api.cursos.model.Curso;
import com.caiquepirs_desafio.api.cursos.repository.CursoRepository;
import com.caiquepirs_desafio.api.cursos.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService service;

    @Autowired
    private CursoRepository repository;

    @PostMapping()
    public Curso criar(@RequestBody Curso curso){
        curso.setActive(true);
        service.criar(curso);
        return curso;
    }

    @GetMapping()
    public List<Curso> buscar(){
        return service.buscar();
    }

    @GetMapping("/nome/{nome}")
    public List<Curso> pesquisarNome(@PathVariable("nome") String nome){
        return service.pesquisarNome(nome);
    }


    @GetMapping("/categoria/{category}")
    public  List<Curso> pesquisarCategoria(@PathVariable("category") String categoria){
        return service.pesquisarCategoria(categoria);
    }

    @PutMapping("/{id}")
    public Curso atualizar(@PathVariable("id") long id, @RequestBody Curso curso){
       service.atualizar(curso);
       return curso;
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable("id") Long id){
        service.excluir(id);

    }

}
