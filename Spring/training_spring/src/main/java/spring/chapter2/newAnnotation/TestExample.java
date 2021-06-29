package spring.chapter2.newAnnotation;

import spring.chapter2.newAnnotation.TesterInfo.Priority;

@TesterInfo(
	priority = Priority.HIGH, 
	createdBy = "mkyong",  
	tags = {"sales","test" }
)
public class TestExample {

	@TestXXX
	void testA() {
	  if (true)
		throw new RuntimeException("This test always failed");
	}

	@TestXXX(enabled = false)
	void testB() {
	  if (false)
		throw new RuntimeException("This test always passed");
	}

	@TestXXX(enabled = true)
	void testC() {
	  if (10 > 1) {
		// do nothing, this test always passed.
	  }
	}

}