package com.pratice.spring.overwrite;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pratice.spring.circulardependency.CircularDependency;

@Configuration
public class Bean2 {
//	@Bean
//	@Qualifier("circularDependency2")
//	public CircularDependency objectMapper() {
//		return new CircularDependency();
//	}
	

	
	@Bean
	public CircularDependency mapper2() {
		return new CircularDependency();
	}
}
