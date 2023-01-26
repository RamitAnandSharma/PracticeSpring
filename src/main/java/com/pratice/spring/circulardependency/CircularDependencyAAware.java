package com.pratice.spring.circulardependency;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class CircularDependencyAAware implements ApplicationContextAware, InitializingBean {
 
    private CircularDependencyBAware circB;
 
    private ApplicationContext context;
 
    public CircularDependencyBAware getCircB() {
        return circB;
    }
 
    @Override
    public void afterPropertiesSet() throws Exception {
        circB = context.getBean(CircularDependencyBAware.class);
    }
 
    @Override
    public void setApplicationContext(final ApplicationContext ctx) throws BeansException {
        context = ctx;
    }
}
