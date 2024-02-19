package com.jaimesalebe.triviamysql.Entities;

import lombok.Data;

@Data
public class Question {

    private Category category;
    private String question;
    private String[] options;
    private Integer answer;
    private String explanation;
}
