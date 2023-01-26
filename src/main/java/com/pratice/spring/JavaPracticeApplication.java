package com.pratice.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pratice.spring.circulardependency.CircularDependency;

@SpringBootApplication
public class JavaPracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(JavaPracticeApplication.class, args);
		CircularDependency bean = run.getBean(CircularDependency.class);
		//bean.doSomething();
	}

}
