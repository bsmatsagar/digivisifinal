package cc.wsconsume;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Pattern.Flag;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("")
public class MyResource {
List<employee> em=new ArrayList<employee>();
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     * @throws SQLException 
     */

    
    
    
    
    @POST
    @Path("securityLogin")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String insertsecurity1(employee e) {
    	
    	//employee emp=new employee("sham", "2342352");
    	checkuser obj=new checkuser();
    	System.out.println("from main"+e.username+e.password);
    	String y=obj.checksecurity(e.username,e.password);
    	
    	if(y!="")
       	{
    	global.security_id=y;
    		return	" {\"Status\": {\"code\": \"200\",\"Status\": \"success\",\"displayMessage\": \"success\", \"debugMessage\": \"success\" },\"data\":{\"client_id\":\""+global.client_id+"\",\"security_id\":\""+global.security_id+"\",\"login_type\":\"security\"}}";
    		
    		
       		//return "{\"code\": \"200\",\"Status\": \"success\",\"displayMessage\": \"success\",\"debugMessage\": \"success\"}}";
       		//return" [{ "+"code"+": "+"200"+", "+"Status"+": "+"success"+","+"displayMessage"+": "+"success"+", "+"debugMessage"+": "+"success"+" }]";
       		
       	}
       	else
       	{
       		return "{\"Status\":{\"code\": \"400\",\"Status\": \"failed\",\"displayMessage\": \"failed\",\"debugMessage\": \"failed\"}}";
        }
    	
       
    }
    
    
    @POST
    @Path("clientLogin")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String adminlogin(employee e) {
    	
    	//employee emp=new employee("sham", "2342352");
    	checkuser obj=new checkuser();
    	
    	String y=obj.checkclient(e.username,e.password);
    	System.out.println("from main"+e.username+e.password);
    	if(y!="")
       	{
    		global.client_id=y;
    		return	"{\"Status\": {\"code\": \"200\",\"Status\": \"success\",\"displayMessage\": \"success\", \"debugMessage\": \"success\"},\"data\": {\"client_id\": \"1\",\"login_type\":\"client\"}}";
    		
    		
       		//return "{\"code\": \"200\",\"Status\": \"success\",\"displayMessage\": \"success\",\"debugMessage\": \"success\"}}";
       		//return" [{ "+"code"+": "+"200"+", "+"Status"+": "+"success"+","+"displayMessage"+": "+"success"+", "+"debugMessage"+": "+"success"+" }]";
       		
       	}
       	else
       	{
       		return "{\"Status\":{\"code\": \"400\",\"Status\": \"failed\",\"displayMessage\": \"failed\",\"debugMessage\": \"failed\"}}";
        }
    	
       
    }
    
    
    
    
    
    
    
 
}
       	
       
    
    


    
    
    
    
    
    
    
    
    
    
    

