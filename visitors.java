package cc.wsconsume;

public class visitors {
	String visitor_name;
	String visitor_phone;
	String visitor_email;
	String visitor_age;
	String visitor_sex;
	String visitor_address;
	String visitor_photo;
	String visitor_id_proof;
	
	public visitors()
	{}
	
	public visitors(String visitor_name, String visitor_phone, String visitor_email, String visitor_age,
			String visitor_sex, String visitor_address, String visitor_photo, String visitor_id_proof) {
		super();
		this.visitor_name = visitor_name;
		this.visitor_phone = visitor_phone;
		this.visitor_email = visitor_email;
		this.visitor_age = visitor_age;
		this.visitor_sex = visitor_sex;
		this.visitor_address = visitor_address;
		this.visitor_photo = visitor_photo;
		this.visitor_id_proof = visitor_id_proof;
	}
	


	public String getVisitor_name() {
		return visitor_name;
	}
	public void setVisitor_name(String visitor_name) {
		this.visitor_name = visitor_name;
	}
	public String getVisitor_phone() {
		return visitor_phone;
	}
	public void setVisitor_phone(String visitor_phone) {
		this.visitor_phone = visitor_phone;
	}
	public String getVisitor_email() {
		return visitor_email;
	}
	public void setVisitor_email(String visitor_email) {
		this.visitor_email = visitor_email;
	}
	public String getVisitor_age() {
		return visitor_age;
	}
	public void setVisitor_age(String visitor_age) {
		this.visitor_age = visitor_age;
	}
	public String getVisitor_sex() {
		return visitor_sex;
	}
	public void setVisitor_sex(String visitor_sex) {
		this.visitor_sex = visitor_sex;
	}
	public String getVisitor_address() {
		return visitor_address;
	}
	public void setVisitor_address(String visitor_address) {
		this.visitor_address = visitor_address;
	}
	public String getVisitor_photo() {
		return visitor_photo;
	}
	public void setVisitor_photo(String visitor_photo) {
		this.visitor_photo = visitor_photo;
	}
	public String getVisitor_id_proof() {
		return visitor_id_proof;
	}
	public void setVisitor_id_proof(String visitor_id_proof) {
		this.visitor_id_proof = visitor_id_proof;
	}
	
}
