package com.bundleB.services;

import com.bundleA.services.ClassA;

public abstract class ClassB extends ClassA {

    @Override
    public String getName() {
        return "This is Class B";
    }
}
