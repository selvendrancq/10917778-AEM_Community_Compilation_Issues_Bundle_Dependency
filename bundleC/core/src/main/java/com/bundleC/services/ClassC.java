package com.bundleC.services;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;

import com.bundleB.services.ClassB;

@Component(immediate = true)
@Service
public class ClassC extends ClassB{

    @Override
    public String getName() {
        return "This is Class C";
    }
}
