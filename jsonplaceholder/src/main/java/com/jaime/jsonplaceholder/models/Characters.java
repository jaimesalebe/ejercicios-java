package com.jaime.jsonplaceholder.models;

public class Characters {
    private Info info;
    private Character[] results;

    public Characters(Info info, Character[] results) {

        this.info = info;
        this.results = results;

    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Character[] getResults() {
        return results;
    }

    public void setResults(Character[] results) {
        this.results = results;
    }
}
