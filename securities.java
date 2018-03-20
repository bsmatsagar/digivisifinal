package cc.wsconsume;

public class securities {
	
	String security_phone;
	String security_age;
	
	
	String security_id_proof;
	String	security_sex;
	String	security_photo;
	String security_name;
	public securities(String security_name, String security_phone, String security_age, String security_id_proof,
			String security_sex, String security_photo) {
		super();
		this.security_name = security_name;
		this.security_phone = security_phone;
		this.security_age = security_age;
		this.security_id_proof = security_id_proof;
		this.security_sex = security_sex;
		this.security_photo = security_photo;
	}

	

	public securities() {
		super();
		this.security_name = security_name;
		this.security_phone = security_phone;
		this.security_age = security_age;
		this.security_id_proof = security_id_proof;
		this.security_sex = security_sex;
		this.security_photo = security_photo;
	}
	
	
	
	
	
	
	
	public String getSecurity_name() {
		return security_name;
	}

	public void setSecurity_name(String security_name) {
		this.security_name = security_name;
	}

	public String getSecurity_phone() {
		return security_phone;
	}

	public void setSecurity_phone(String security_phone) {
		this.security_phone = security_phone;
	}

	public String getSecurity_age() {
		return security_age;
	}

	public void setSecurity_age(String security_age) {
		this.security_age = security_age;
	}

	public String getSecurity_id_proof() {
		return security_id_proof;
	}

	public void setSecurity_id_proof(String security_id_proof) {
		this.security_id_proof = security_id_proof;
	}

	public String getSecurity_sex() {
		return security_sex;
	}

	public void setSecurity_sex(String security_sex) {
		this.security_sex = security_sex;
	}

	public String getSecurity_photo() {
		return security_photo;
	}

	public void setSecurity_photo(String security_photo) {
		this.security_photo = security_photo;
	}

	
	
	
	


}
