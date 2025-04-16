package com.caiquepirs_desafio.api.cursos.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "course")
@Data
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String category;
    private boolean active;

    @CreationTimestamp
    private LocalDateTime created_at;

    @UpdateTimestamp
    private LocalDateTime updated_at;


    public String getStatus() {
        return active ? "Active" : "Inactive";
    }

    public void dataCourses(){
        System.out.printf("Id: " + id, ", name: " + name
                + ", category: " + category + ", Status: " + getStatus() +
                ", created_at: " + created_at.toString() + ", updated_at: " + updated_at.toString());
    }
}
