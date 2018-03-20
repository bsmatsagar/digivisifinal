package cc.wsconsume;






/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author hp
 */
public class DB {
    
       public static Connection getConnection()
	    {
	    	Connection con = null;
    	    PreparedStatement pst;
    	    ResultSet rs;
	        try{
	        	
	            //MAKE SURE YOU KEEP THE mysql_connector.jar file in java/lib folder
	            //ALSO SET THE CLASSPATH
	            Class.forName("com.mysql.jdbc.Driver");
	            con=DriverManager.getConnection("jdbc:mysql://digivisit.csg75syilcpm.us-east-2.rds.amazonaws.com:3306/digivisit_db?autoReconnect=true&useSSL=false","root","root");
	                      //  pst=con.prepareStatement("select * from  login where username=? and password=?");
	             
	           }
	        catch (Exception e) 
	        {
	            System.out.println(e);
	        }
			return con;
}

    
}
