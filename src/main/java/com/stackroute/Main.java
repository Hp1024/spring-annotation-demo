package com.stackroute;

import com.stackroute.domain.ConfigClass;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context1 =new AnnotationConfigApplicationContext(ConfigClass.class);
        Movie movie1=context1.getBean("movie",Movie.class);
        movie1.display1("actor1");
        movie1.display2("actor2");
    }
}