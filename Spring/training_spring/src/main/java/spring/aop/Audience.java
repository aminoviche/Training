package spring.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class Audience {
	
	@Before("execution(** spring.aop.Performance.perform(..))")
	public void silenceCellPhones() {
		System.out.println("Silencing cell phones");
	}
	@Before("execution(** spring.aop.Performance.perform(..))")
	public void takeSeats() {
		System.out.println("Taking seats");
	}
	@AfterReturning("execution(** spring.aop.Performance.perform(..))")
	public void applause() {
		System.out.println("CLAP CLAP CLAP!!!");
	}
	@AfterThrowing("execution(** spring.aop.Performance.perform(..))")
	public void demandRefund() {
		System.out.println("Demanding a refund");
	}
}
