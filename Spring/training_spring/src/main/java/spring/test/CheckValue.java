package spring.test;

public class CheckValue {
	
	public static void main(String[] args) {
		ReadPropertyFile readPropertyFile = new ReadPropertyFile("/home/amine/Bureau/application.properties");
		
		
		
		readPropertyFile.checkPropertyValue("profile","dev");
		readPropertyFile.checkPropertyValue("spring.profiles.active","prod");
		readPropertyFile.checkPropertyValue("spring.profiles.default","dev,hsqldb");
		readPropertyFile.checkPropertyValue("profile","dev");
		
		System.out.println("success");
		
	}
	
	

}
