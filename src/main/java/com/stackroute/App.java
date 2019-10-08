package com.stackroute;

import com.stackroute.domain.AppConfigue;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

import javax.sql.rowset.spi.XmlReader;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfigue.class);
        Movie movie=context.getBean(Movie.class);
        movie.printActor();
//        XmlBeanDefinitionReader factory=new XmlBeanFactory(new ClassPathResource(AppConfigue.class));
    }
}
