package com.example;

// SAM - Single Abstract Method
// Functional Interface

@FunctionalInterface
public interface Predicate {
    boolean test(Integer n);
}
