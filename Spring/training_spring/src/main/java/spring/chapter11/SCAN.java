package spring.chapter11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


public class SCAN {

	public static void main(String[] args) {

		
		System.setProperty("spring.profiles.active", "dev");
		
		// ApplicationContext est dans le fichier ressource
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring/chapter11.xml" });
		
		
		System.out.println(context.getBean("appProperties"));
		
	


		System.out.println(Component.class);
		for (String bean : context.getBeanNamesForAnnotation(Component.class)) {
			System.out.println(bean);
		}
		
		System.out.println(Service.class);
		for (String bean : context.getBeanNamesForAnnotation(Service.class)) {
			System.out.println(bean);
		}

		System.out.println(Repository.class);
		for (String bean : context.getBeanNamesForAnnotation(Repository.class)) {
			System.out.println(bean);
		}

		System.out.println(Bean.class);
		for (String bean : context.getBeanDefinitionNames()) {
			System.out.println(bean);
		}

	}
}
