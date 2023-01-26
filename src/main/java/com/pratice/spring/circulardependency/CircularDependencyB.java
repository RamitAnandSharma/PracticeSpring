package com.pratice.spring.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CircularDependencyB {

 
	private CircularDependencyA circularDependencyA;
//	@Autowired
//    public CircularDependencyB(@Lazy CircularDependencyA circA) {
//        this.circularDependencyA = circA;
//    }
//	
 
	@Autowired
    public void setCircularDependencyA(CircularDependencyA circA) {
        this.circularDependencyA = circA;
    }
 
    public CircularDependencyA getCircularDependencyA() {
        return circularDependencyA;
    }
	
	public void doSomething() {
		circularDependencyA.doSomething();
	}
}
