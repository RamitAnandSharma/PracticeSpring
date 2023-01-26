package com.pratice.spring.overwrite;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pratice.spring.circulardependency.CircularDependency;

@Configuration
public class Bean1 {
//	@Bean
//	public CircularDependency objectMapper() {
//		return new CircularDependency();
//	}

	@Bean
	public CircularDependency mapper1() {
		return new CircularDependency();
	}
}
