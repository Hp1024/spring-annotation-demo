package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {
    private String ab;
    @PostConstruct
    public void customInit(){
        System.out.println("init method ");
    }
    @PreDestroy
    public void customDestroy(){
        System.out.println("destroy method ");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean interface method ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean interface method is called");
    }
}