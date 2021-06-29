/**
 *
 */
package spring.chapter11;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author amine Fouzi 
 *
 */
public class KnightMain  {

    public static void main(String[] args) throws Exception {
    
    	testEnv("dev");
    	testEnv("prod");
    }
    
    public static void testEnv(String env) {
    	System.setProperty("spring.profiles.active", env);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring/chapter11.xml");
        
       
//        Knight knight = context.getBean(Knight.class);
        //constructeur
        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();

        //setter
        Knight knight1 = (Knight) context.getBean("knight1");
        knight1.embarkOnQuest();
        context.close();
        
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("classpath:spring/chapter11.xml");
        
        
        Knight knight2 = (Knight) context1.getBean("knight");
        knight2.embarkOnQuest();
        context1.close();
        
    }
    
    
	/**
	 * The BeanFactory is usually preferred where the resources are limited like mobile devices or applet-based applications.
	 *  Thus, use an ApplicationContext unless you have a good reason for not doing so.
	 */
	
	public static void  testBeanFactory(){
		System.setProperty("spring.profiles.active", "dev");
		System.out.println("TEST");
		ClassPathResource cr = new ClassPathResource("/chapter2/chapter11.xml");
		XmlBeanFactory xmlBeanFactory=new XmlBeanFactory(cr);
		Knight bean = (Knight)xmlBeanFactory.getBean("knight");
		System.out.println(bean);
		System.out.println("TEST");
		
		//ClassPathXmlApplicationContext //call also XmlBeanFactory
		
	}

}
