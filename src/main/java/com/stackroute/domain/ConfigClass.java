package com.stackroute.domain;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.stackroute.domain")
public class ConfigClass {
    @Bean
    public Actor actor1(){
        return new Actor("Haripriya","Female",21);
    }
    @Bean
    public Actor actor2(){
        return new Actor("Shivani","Female",21);
    }
    @Bean
    public Actor actor3(){
        return new Actor("Poorvi","Female",21);
    }


}
