package cc.wsconsume;


public class visitor {

	public String visitor_type=null;
	public String name=null;
	public String mobile=null;
	public String address=null;
	public String gender=null;
	public String no_of_person=null;
	public String id_proof=null;
	public String id_proof_no=null;
	public String in_time=null;
	public String in_date=null;
	public String out_time=null;
	public String out_date=null;
	public String whoom_to_meet=null;
	public String location=null;
	public String vehicle_no=null;
	public String image_path=null;
	
	public visitor()
	{
		
		
	}
	
	public visitor(String visitor_type, String name, String mobile, String address, String gender, String no_of_person,
			String id_proof, String id_proof_no, String in_time, String in_date, String out_time, String out_date,
			String whoom_to_meet, String location, String vehicle_no, String image_path) {
		super();
		this.visitor_type = visitor_type;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.gender = gender;
		this.no_of_person = no_of_person;
		this.id_proof = id_proof;
		this.id_proof_no = id_proof_no;
		this.in_time = in_time;
		this.in_date = in_date;
		this.out_time = out_time;
		this.out_date = out_date;
		this.whoom_to_meet = whoom_to_meet;
		this.location = location;
		this.vehicle_no = vehicle_no;
		this.image_path = image_path;
	}

	public String getVisitor_type() {
		return visitor_type;
	}

	public void setVisitor_type(String visitor_type) {
		this.visitor_type = visitor_type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNo_of_person() {
		return no_of_person;
	}

	public void setNo_of_person(String no_of_person) {
		this.no_of_person = no_of_person;
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

	public String getIn_time() {
		return in_time;
	}

	public void setIn_time(String in_time) {
		this.in_time = in_time;
	}

	public String getIn_date() {
		return in_date;
	}

	public void setIn_date(String in_date) {
		this.in_date = in_date;
	}

	public String getOut_time() {
		return out_time;
	}

	public void setOut_time(String out_time) {
		this.out_time = out_time;
	}

	public String getOut_date() {
		return out_date;
	}

	public void setOut_date(String out_date) {
		this.out_date = out_date;
	}

	public String getWhoom_to_meet() {
		return whoom_to_meet;
	}

	public void setWhoom_to_meet(String whoom_to_meet) {
		this.whoom_to_meet = whoom_to_meet;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getVehicle_no() {
		return vehicle_no;
	}

	public void setVehicle_no(String vehicle_no) {
		this.vehicle_no = vehicle_no;
	}

	public String getImage_path() {
		return image_path;
	}

	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}
	


}
