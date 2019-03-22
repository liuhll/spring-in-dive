package com.liuhll.springbootindive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.HashSet;
import java.util.Set;

//@EnableAutoConfiguration
//@SpringBootApplication
public class SpringBootInDiveApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringBootInDiveApplication.class,args);
        Set<String> sources = new HashSet<String>();
        sources.add(ApplicationConfig.class.getName());
        SpringApplication application = new SpringApplication();
        application.setSources(sources);
        application.setWebApplicationType(WebApplicationType.SERVLET);
        application.run(args);

    }

    @SpringBootApplication
    public static class ApplicationConfig {

    }
}


