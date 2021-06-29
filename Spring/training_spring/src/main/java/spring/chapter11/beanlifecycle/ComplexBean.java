package spring.chapter11.beanlifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ComplexBean {
	
	private Logger logger = LoggerFactory.getLogger(ComplexBean.class);
    private SimpleBean simpleBean1;
    private SimpleBean simpleBean2;
    
    public ComplexBean(SimpleBean simpleBean1) {
        logger.info("Stage 1: Calling the constructor.");
        System.out.println("Stage 1: Calling the constructor.");
        this.simpleBean1 = simpleBean1;
    }
    
    public void setSimpleBean2(SimpleBean simpleBean2) {
        logger.info("Stage 2: Calling the setter.");
        this.simpleBean2 = simpleBean2;
    }
    
    
    /**
     * The initialization method.
     * Just for fun: it instantiates the simpleBean2 only
     * if the current time is even.
     */
    private void initMethod() {
        logger.info("Stage 4: Calling the initMethod.");
        long ct = System.currentTimeMillis();
        if (ct % 2 == 0) {
            simpleBean2 = new SimpleBean();
        }
    }
    
}