package com.stackroute;

import com.stackroute.domain.ConfigClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context1 =new AnnotationConfigApplicationContext(ConfigClass.class);
        context1.registerShutdownHook();
    }
}