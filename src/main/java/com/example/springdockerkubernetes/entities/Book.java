package com.example.springdockerkubernetes.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Book {

    @Id
    private Long id;

    private String author;

    private String title;
}
