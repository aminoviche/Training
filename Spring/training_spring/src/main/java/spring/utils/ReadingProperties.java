package spring.utils;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReadingProperties {





    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "/properties/readingProperties.xml");


        PropertyNames  properties=(PropertyNames)context.getBean("properties") ;


        System.out.println("value="+properties.getValue());


         context = new ClassPathXmlApplicationContext(
                "/properties/readingProperties1.xml");


          properties=(PropertyNames)context.getBean("properties") ;


        System.out.println("value="+properties.getValue());


         context = new ClassPathXmlApplicationContext(
                "/properties/readingProperties2.xml");


        PropertyNames1  properties1=(PropertyNames1)context.getBean("properties") ;


        System.out.println("value="+properties1.getValue());




    }
}
