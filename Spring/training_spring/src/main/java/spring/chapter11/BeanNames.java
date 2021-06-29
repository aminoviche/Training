package spring.chapter11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanNames {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("/spring/BeanNames.xml");
		
//		   <bean id="sb01" name="sb01" class="spring.chapter11.Knight"/>
//		    <bean id="sb02/sb03" name="mumu" class="spring.chapter11.Knight"/>
//		    <bean id="sb04; sb05" class="spring.chapter11.Knight"/>
//		    <bean name="sb04; sb05, sb004 sb005" class="spring.chapter11.Knight"/>
//		    <bean id="$" class="spring.chapter11.Knight"/>
		for (String name : ctx.getBeanDefinitionNames()){
	          
	           System.out.println("Name:"+name);
	           
	           for(String alias :ctx.getAliases(name)){
	        	   System.out.println("alias:"+alias);
	           }
//	         
	           System.out.println("------------------");
	}
		
		
//		  sb01
//          sb02/sb03
//          sb04; sb05
//          sb04
//          $
	
	}

}
