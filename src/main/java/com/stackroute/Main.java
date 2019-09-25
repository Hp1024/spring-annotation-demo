package com.stackroute;

import com.stackroute.domain.ConfigClass;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context =new AnnotationConfigApplicationContext(ConfigClass.class);
        Movie movie1=context.getBean("movie",Movie.class);
        movie1.display();
    }
}
