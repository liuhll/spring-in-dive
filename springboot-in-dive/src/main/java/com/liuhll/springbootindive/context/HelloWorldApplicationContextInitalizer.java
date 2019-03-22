package com.liuhll.springbootindive.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationContextInitalizer<C extends ConfigurableApplicationContext> implements ApplicationContextInitializer<C> {



    public void initialize(C applicationContext) {

        System.out.println("ConfigurableApplicationContext.id = " + applicationContext.getId());
    }
}
