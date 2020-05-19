package in.tucaurto.entity;

public class UserDTO 
{
	private String name;
    private String username;
    private String password;
    private long contactNumber;

    
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public UserDTO(String name, String username, String password, long contactNumber) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.contactNumber = contactNumber;
	}

}
