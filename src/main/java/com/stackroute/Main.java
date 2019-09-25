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
        ApplicationContext context =new AnnotationConfigApplicationContext(ConfigClass.class);
        Movie movie1=context.getBean("movie1",Movie.class);
        movie1.display();
        Movie movie2=context.getBean("movie2",Movie.class);
        movie2.display();
        Movie movie3=context.getBean("MovieB",Movie.class);
        movie3.display();
        Movie movie4=context.getBean("MovieA",Movie.class);
        movie4.display();
        System.out.println(movie3==movie4);
    }
}
