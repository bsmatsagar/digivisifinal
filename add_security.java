package cc.wsconsume;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class add_security {
	
	
	
	public int insertsecurity(String security_name, String security_phone,String security_age,String security_id_proof,String security_sex, String security_photo)
	{
		int flag=0;
	Connection con=DB.getConnection();
	
PreparedStatement ps=null;

try {
	ps=con.prepareStatement("insert into securitys(security_name,security_phone,security_age,security_id_proof,security_sex,security_photo)values (?,?,?,?,?,?)");
	ps.setString(1, security_name);
	ps.setString(2, security_phone);
	ps.setString(3, security_id_proof);
	ps.setString(4, security_id_proof);
	ps.setString(5, security_sex);
	ps.setString(6, security_photo);
	ps.executeUpdate();
	flag=1;
return flag;	
}
	
	
	

 catch (SQLException e) {
	 e.printStackTrace();
	 return flag;
	// TODO Auto-generated catch block
	
}
	
	
	
	
	
	
	}
}
