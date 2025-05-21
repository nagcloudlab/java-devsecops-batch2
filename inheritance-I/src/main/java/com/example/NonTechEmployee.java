package com.example;

public class TechEmployee {

    private long id;
    private String name;
    private String techStack;

    public TechEmployee(long id, String name, String techStack) {
        this.id = id;
        this.name = name;
        this.techStack = techStack;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTechStack() {
        return techStack;
    }
}
