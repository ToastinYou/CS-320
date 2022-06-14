package contact;

public class Contact {
	private String id, firstName, lastName, phone, address;
	
	public Contact(String id, String firstName, String lastName, String phone, String address) {
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	public String GetId() {
		return id;
	}
	
	public String GetFirstName() {
		return firstName;
	}
	
	public void SetFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String GetLastName() {
		return lastName;
	}
	
	public void SetLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String GetPhone() {
		return phone;
	}
	
	public void SetPhone(String phone) {
		this.phone = phone;
	}
	
	public String GetAddress() {
		return address;
	}
	
	public void SetAddress(String address) {
		this.address = address;
	}
}
