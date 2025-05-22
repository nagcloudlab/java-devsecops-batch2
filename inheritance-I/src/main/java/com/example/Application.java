package com.example;

public class Application {
    public static void main(String[] args) {

       // TechEmployee techEmployee = new TechEmployee(1, "John Doe", "java");
        //NonTechEmployee nonTechEmployee = new NonTechEmployee(2, "Jane Smith");

        //TechEmployee e=new TechEmployee(1, "John Doe", "java");
        //e=new NonTechEmployee(2, "Jane Smith"); // This will not work

        Employee e = new TechEmployee(1, "John Doe", "java");
        e= new NonTechEmployee(2, "Jane Smith"); // This will work

    }
}
