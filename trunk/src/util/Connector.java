package util;

import java.sql.Connection;
import java.sql.DriverManager;


public class Connector {
	 private Connection connection;
	    
	    public Connection getConnection(){
	        try {
	           Class.forName("org.sqlite.JDBC").newInstance();
	           connection = DriverManager.getConnection("jdbc:sqlite:basetest.db");
	        } catch (Exception e) {
	           e.printStackTrace();
	        } 
	        return connection;
	    }
	        
	    static Connector unicaInstancia;     //SINGLETON
	    public static Connector Instance() {
	        if (unicaInstancia == null)
	        unicaInstancia = new Connector();
	        return unicaInstancia;
	        }
	    
	    private Connector() {}
}
