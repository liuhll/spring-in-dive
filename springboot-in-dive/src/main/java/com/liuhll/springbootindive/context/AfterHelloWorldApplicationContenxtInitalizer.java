package com.liuhll.springbootindive.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

public class AfterHelloWorldApplicationContenxtInitalizer<C extends ConfigurableApplicationContext> implements ApplicationContextInitializer<C>, Ordered {

    public void initialize(C applicationContext) {
        System.out.println("after applicationContext id = " + applicationContext.getId());
    }

    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
