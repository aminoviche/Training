package spring.cache;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class BookServiceTransverse{
	

	
        @Cacheable("book")	  
	    public  Book getByIsbn(String isbn) {
	        simulateSlowService();
	        return new Book(isbn, "Some book");
	    }

	    // Don't do this at home
	    private  void simulateSlowService() {
	        try {
	            long time = 9000L;
	            Thread.sleep(time);
	        } catch (InterruptedException e) {
	            throw new IllegalStateException(e);
	        }
	    }


}
