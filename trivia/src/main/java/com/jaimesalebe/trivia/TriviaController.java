package com.jaimesalebe.trivia;

import com.jaimesalebe.trivia.entities.Categoria;
import com.jaimesalebe.trivia.entities.Pregunta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriviaController {

    @GetMapping("/question/{categoria}")
    public Pregunta getQuestions (@PathVariable String categoria) {
        Pregunta pregunta1 = new Pregunta();
        pregunta1.setCategory("Cultura");
        pregunta1.setQuestion("¿Qué ingredintes se necesitan para hacer una michelada?");
        pregunta1.setAnswer(0);
        pregunta1.setExplanation("La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.");
        String[] options = {"Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante", "Cerveza, lima/limón y limon", "Cerveza, sal, tabasco y lima/limón" };
        pregunta1.setOptions(options);

        return pregunta1;
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
