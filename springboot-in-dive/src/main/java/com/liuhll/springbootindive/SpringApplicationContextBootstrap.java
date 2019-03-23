package com.liuhll.springbootindive;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@EnableAutoConfiguration
public class SpringApplicationContextBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringApplicationContextBootstrap.class)
                .web(WebApplicationType.REACTIVE)
                .run(args);

        System.out.println( "contxt type: " + context.getClass().getName());
        System.out.println( "environment type: " + context.getEnvironment().getClass().getName());
        context.close();
    }
}
