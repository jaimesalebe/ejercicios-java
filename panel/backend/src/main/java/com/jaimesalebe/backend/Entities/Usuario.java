package com.jaimesalebe.backend.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data @AllArgsConstructor
public class Usuario {
    private Integer id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

}
