package cc.wsconsume;

public class client {
	
	String client_name;
	
	String client_address;
	String client_phone;
	String client_pincode;
	String client_city;
	String client_state;
	String client_population;
	String client_email;
	String client_username;
	String client_password;
	
	public client()
	{
		
	}
	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}
	public String getClient_address() {
		return client_address;
	}
	public void setClient_address(String client_address) {
		this.client_address = client_address;
	}
	public String getClient_phone() {
		return client_phone;
	}
	public void setClient_phone(String client_phone) {
		this.client_phone = client_phone;
	}
	public String getClient_pincode() {
		return client_pincode;
	}
	public void setClient_pincode(String client_pincode) {
		this.client_pincode = client_pincode;
	}
	public String getClient_city() {
		return client_city;
	}
	public void setClient_city(String client_city) {
		this.client_city = client_city;
	}
	public String getClient_state() {
		return client_state;
	}
	public void setClient_state(String client_state) {
		this.client_state = client_state;
	}
	public String getClient_population() {
		return client_population;
	}
	public void setClient_population(String client_population) {
		this.client_population = client_population;
	}
	public String getClient_email() {
		return client_email;
	}
	public void setClient_email(String client_email) {
		this.client_email = client_email;
	}
	public String getClient_username() {
		return client_username;
	}
	public void setClient_username(String client_username) {
		this.client_username = client_username;
	}
	public String getClient_password() {
		return client_password;
	}
	public void setClient_password(String client_password) {
		this.client_password = client_password;
	}
	public client(String client_name, String client_address, String client_phone, String client_pincode,
			String client_city, String client_state, String client_population, String client_email,
			String client_username, String client_password) {
		super();
		this.client_name = client_name;
		this.client_address = client_address;
		this.client_phone = client_phone;
		this.client_pincode = client_pincode;
		this.client_city = client_city;
		this.client_state = client_state;
		this.client_population = client_population;
		this.client_email = client_email;
		this.client_username = client_username;
		this.client_password = client_password;
	}
	

}
