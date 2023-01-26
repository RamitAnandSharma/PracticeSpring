package com.pratice.spring.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CircularDependencyA {

	private CircularDependencyB circularDependencyB;

//	@Autowired
//	public CircularDependencyA(@Lazy CircularDependencyB circB) {
//		this.circularDependencyB = circB;
//	}

	@Autowired
    public void setCircularDependencyB(CircularDependencyB circB) {
        this.circularDependencyB = circB;
    }
 
    public CircularDependencyB getCircularDependencyB() {
        return circularDependencyB;
    }
	public void doSomething() {
		System.out.println("Hi");
	}
}
