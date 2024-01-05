package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        Service service = (Service) applicationContext.getBean("service");
        System.out.println(service);
        service = (Service) applicationContext.getBean("service");
        System.out.println(service);
        System.out.println( "Hello World!" );
        Dao dao = (Dao) applicationContext.getBean("dao");

    }
}
