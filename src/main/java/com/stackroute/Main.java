package com.stackroute;

import com.stackroute.domain.ConfigClass;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main
{
    public static void main( String[] args )
    {
//        using Application context
        ApplicationContext context =new AnnotationConfigApplicationContext(ConfigClass.class);
        Movie movie1=context.getBean("movie",Movie.class);
        System.out.println("using application context");
        movie1.display();
//        using BeanFactory
        BeanFactory beanfactory= context;
        Movie movie2=beanfactory.getBean("movie",Movie.class);
        System.out.println("using bean factory");
        movie2.display();





    }
}
