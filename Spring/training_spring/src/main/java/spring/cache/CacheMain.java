package spring.cache;

import java.util.Calendar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CacheMain {




	public static void main(String[] args) {

		System.setProperty("spring.profiles.active", "prod");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring/cache.xml");

		BookServiceTransverse bookServiceTransverse = context.getBean(BookServiceTransverse.class);

		System.out.println(".... Fetching books"+Calendar.getInstance());
		System.out.println("isbn-1234 -->" + bookServiceTransverse.getByIsbn("isbn-1234") +Calendar.getInstance());
		System.out.println("isbn-4567 -->" + bookServiceTransverse.getByIsbn("isbn-4567")+Calendar.getInstance());
		System.out.println("isbn-1234 -->" + bookServiceTransverse.getByIsbn("isbn-1234")+Calendar.getInstance());
		System.out.println("isbn-4567 -->" + bookServiceTransverse.getByIsbn("isbn-4567")+Calendar.getInstance());
		System.out.println("isbn-1234 -->" + bookServiceTransverse.getByIsbn("isbn-1234")+Calendar.getInstance());
		System.out.println("isbn-1234 -->" + bookServiceTransverse.getByIsbn("isbn-1234")+Calendar.getInstance());

		context.close();
	}

}
