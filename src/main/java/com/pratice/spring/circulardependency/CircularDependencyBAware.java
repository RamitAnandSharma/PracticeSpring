package com.pratice.spring.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularDependencyBAware {
 
    private CircularDependencyAAware circA;
 
    private String message = "Hi!";
 
    @Autowired
    public void setCircA(CircularDependencyAAware circA) {
        this.circA = circA;
    }
 
    public String getMessage() {
        return message;
    }
}
