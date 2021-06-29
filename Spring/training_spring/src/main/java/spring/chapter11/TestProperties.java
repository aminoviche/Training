/**
 *
 */
package spring.chapter11;

import java.util.Properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author amine Fouzi 
 *
 */
public class TestProperties  {

    public static void main(String[] args) throws Exception {
    
    
    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring/chapter11.xml");
         
         
    	 Properties dbProp = context.getBean("dbProp", Properties.class);
    	 
    	System.out.println(dbProp.getProperty("value1"));  // print TEST
         
         
         context.close();
    }
    
 

}
