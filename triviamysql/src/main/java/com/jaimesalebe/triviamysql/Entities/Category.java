package com.jaimesalebe.triviamysql.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table()
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
