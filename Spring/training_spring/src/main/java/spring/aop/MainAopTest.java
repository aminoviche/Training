package spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAopTest {
	
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("/spring/aop.xml");
		
		String[] a = context.getBeanDefinitionNames();
		Performance per=(Performance)context.getBean("performance");
		
		
		per.perform();
	}

}
