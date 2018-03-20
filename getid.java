package cc.wsconsume;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class getid {
	
	
	Connection con=null;
	
	
	public String getids() throws SQLException
	{
		String id="";
		
		con=DB.getConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		ps=con.prepareStatement("select MAX(client_id) as id from client");
		rs=ps.executeQuery();
		while(rs.next())
		{
			
		id=rs.getString("id");	
		
		}
		return id;
		
	}

}
