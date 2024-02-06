package com.jaimesalebe.trivia;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jaimesalebe.trivia.entities.Categoria;
import com.jaimesalebe.trivia.entities.Pregunta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriviaController {

    @GetMapping("/question/{categoria}")
    public String getQuestions (@PathVariable String categoria) {
        ChatGptClient chatGpt = new ChatGptClient();
        return chatGpt.generarPregunta("cultura");
    }

    @GetMapping("/categories")
    public Categoria[] getCategories () {

        Categoria cultura = new Categoria();
        Categoria deporte = new Categoria();

        cultura.setCategory("Cultura");
        cultura.setDescripcion("Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.");

        deporte.setCategory("Deporte");
        deporte.setDescripcion("Preguntas relacionadas con diversos deportes y eventos deportivos.");

        Categoria[] categorias = {cultura, deporte};

        return categorias;
    }
}
