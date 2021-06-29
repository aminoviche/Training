/**
 *
 */
package spring.chapter12;

import javax.sql.DataSource;

import org.springframework.stereotype.Component;

/**
 *  @author amine Fouzi 
 *
 */

@Component
public class ClasseService implements InterfaceService{

	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	
	private DataSource dataSource;
	

	 public ClasseService() {
	    
	  }
	
  public ClasseService(DataSource dataSource) {
     this.dataSource=dataSource;
  }

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
}

