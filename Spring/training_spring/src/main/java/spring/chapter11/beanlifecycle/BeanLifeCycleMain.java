package spring.chapter11.beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleMain {
	
	
	
	public static void main(String[] args) {
		
		

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/spring/beanlifecycle.xml");
		
	}

}
