package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

    @Autowired
    private Laptop laptop;

    public void study() {
        laptop.compile();
        System.out.println("Student studying...");
    }
}
