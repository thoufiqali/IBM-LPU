package in.tucaurto.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User 
{
	@Id
	@Column(name="Email")
	private String email;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Phone")
	private long phone;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="ProfileImage")
	private String profileImage;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="City")
	private String city;
	
	@Column(name="Pincode")
	private long pincode;
	
	@Column(name="State")
	private String state;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String email, String name, long phone, String gender, String profileImage, String address, String city,
			long pincode, String state) {
		super();
		this.email = email;
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.profileImage = profileImage;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}

	public User(String name, long phone, String gender, String profileImage, String address, String city, long pincode,
			String state) {
		super();
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.profileImage = profileImage;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}

	@Override
	public String toString() {
		return "User [Email=" + email + ", Name=" + name + ", Phone=" + phone + ", Gender=" + gender + ", ProfileImage="
				+ profileImage + ", Address=" + address + ", City=" + city + ", Pincode=" + pincode + ", State=" + state
				+ "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
