package cc.wsconsume;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class employee {

	
	String username;
	String password;
	String login_type;
	public String getLogin_type() {
		return login_type;
	}
	public void setLogin_type(String login_type) {
		this.login_type = login_type;
	}
	public employee(String username, String password,String login_type) {
		super();
		this.username = username;
		this.password = password;
		this.login_type=login_type;
	}
	public employee()
	{}
	public String getName() {
		return username;
	}
	public void setName(String username) {
		this.username = username;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	
}
