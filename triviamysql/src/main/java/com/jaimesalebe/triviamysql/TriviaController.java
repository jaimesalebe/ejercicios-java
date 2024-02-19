package com.jaimesalebe.triviamysql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriviaController {

    @GetMapping("/question")
    public String getQuestion () {
        return "";
    }
}
