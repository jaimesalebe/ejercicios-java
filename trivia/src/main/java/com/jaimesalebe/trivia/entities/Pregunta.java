x|package com.jaimesalebe.trivia.entities;

public class Pregunta {
    private String category;
    private String question;
    private String[] options;
    private Integer answer;
    private String explanation;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuestions() {
        return question;
    }

    public void setQuestion(String questions) {
        this.question = questions;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}
