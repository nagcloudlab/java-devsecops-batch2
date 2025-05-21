package com.example;


// IS-A relationship
public class TechEmployee extends Employee {

    private String techStack;

    public TechEmployee(long id, String name, String techStack) {
        super(id, name);
        this.techStack = techStack;
    }


    public String getTechStack() {
        return techStack;
    }
}
