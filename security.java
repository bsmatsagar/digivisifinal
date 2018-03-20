package cc.wsconsume;

public class security {
	
	String name;
	String email;
	
	String password;
	String mobile;
	String id_proof;
	String id_proof_no;
	
	public security()
	{
		
		
	}
	
	public security(String name, String email, String password, String mobile, String id_proof, String id_proof_no) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.id_proof = id_proof;
		this.id_proof_no = id_proof_no;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getId_proof() {
		return id_proof;
	}
	public void setId_proof(String id_proof) {
		this.id_proof = id_proof;
	}
	public String getId_proof_no() {
		return id_proof_no;
	}
	public void setId_proof_no(String id_proof_no) {
		this.id_proof_no = id_proof_no;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
