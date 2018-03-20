package cc.wsconsume;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class checkuser {
	
	

	
		
	
	
	public String checksecurity(String user,String passd)
	{
		String flag="";
	Connection con=DB.getConnection();
	
PreparedStatement ps=null;

try {
	ps=con.prepareStatement("select security_id,security_username,security_password from securitys where security_username='"+user+"'");
	ResultSet rs=ps.executeQuery();
	while(rs.next())
			{
		
	if(passd.equals(rs.getString("security_password")))
	{
		flag=rs.getString("security_id");
	}
	
			}
		
			

} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	return flag;
}


return flag;
	}
	
	

	public String checkclient(String user,String passd)
	{
		String flag="";
	Connection con=DB.getConnection();
	
PreparedStatement ps=null;

try {
	System.out.println("testttttttttttttt"+user+passd);
	ps=con.prepareStatement("select client_id,client_username,client_password from client where client_username='"+user+"'");
	ResultSet rs=ps.executeQuery();
	while(rs.next())
			{
		
	if(passd.equals(rs.getString("client_password")))
	{
		flag=rs.getString("client_id");
		System.err.println(flag);
	}
	
			}
		
			

} catch (SQLException e) {
	// TODO Auto-generated catch block
	
	e.printStackTrace();
	return flag;
}


return flag;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	

	
	
	
}
