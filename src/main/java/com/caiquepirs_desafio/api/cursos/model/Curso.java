package com.caiquepirs_desafio.api.cursos.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity(name = "tb_curso")
@Data
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String category;
    private boolean active;

    @CreationTimestamp
    private LocalDateTime created_at;

    @UpdateTimestamp
    private LocalDateTime updated_at;


    public String getStatus() {
        return active ? "Ativo" : "Inativo";
    }

    public void dataCourses(){
        System.out.printf("Id: " + id, ", nome: " + name
                + ", category: " + category + ", Status: " + getStatus() +
                ", created_at: " + created_at.toString() + ", updated_at: " + updated_at.toString());
    }
}
