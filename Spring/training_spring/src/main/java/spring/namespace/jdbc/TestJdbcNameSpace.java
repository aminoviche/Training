package spring.namespace.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbcNameSpace {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/spring/jdbc_namespace.xml");

		
		 Connection con = null;
	      
	      try {
	         //Registering the HSQLDB JDBC driver
	         Class.forName("org.hsqldb.jdbc.JDBCDriver");
	         //Creating the connection with HSQLDB
	         con = DriverManager.getConnection("jdbc:hsqldb:mem:dataSource");
	         if (con!= null){
	            System.out.println("Connection created successfully");
	            
	         }else{
	            System.out.println("Problem with creating connection");
	         }
	         
	         
	         
	         Statement stmt = null;
	         String query = "select count(*) as count from users";
	         try {
	             stmt = con.createStatement();
	             ResultSet rs = stmt.executeQuery(query);
	             while (rs.next()) {
	              
	                 int count = rs.getInt("count");
	               
	             
	                 System.out.println("nombre results:"+count);
	             }
	         } catch (SQLException e ) {
	            

	         } finally {
	             if (stmt != null) { stmt.close(); }
	         }
	         
	      
	      }  catch (Exception e) {
	         e.printStackTrace(System.out);
	      }
		
	}

}
