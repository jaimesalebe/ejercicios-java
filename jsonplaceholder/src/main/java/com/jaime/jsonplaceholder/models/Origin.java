package com.jaime.jsonplaceholder.models;

public class Origin {
    private String name;
    private String url;

    // Constructor
    public Origin(String name, String url) {
        this.name = name;
        this.url = url;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
