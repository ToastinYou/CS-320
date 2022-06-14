package contact;

import contact.Contact;
import java.util.ArrayList;

public class ContactService {
	private ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	private Contact FindContactById(String id) {
		for (Contact contact : contacts) {
			if (contact.GetId() == id) {
				return contact;
			}
		}
		
		return null;
	}
	
	public ArrayList<Contact> GetContacts() {
		return contacts;
	}
	
	public void AddContact(Contact contact) {
		contacts.add(contact);
	}
	
	public void DeleteContact(String id) {
		contacts.remove(FindContactById(id));
	}
	
	public void SetFirstName(String id, String firstName) {
		FindContactById(id).SetFirstName(firstName);
	}
	
	public void SetLastName(String id, String lastName) {
		FindContactById(id).SetLastName(lastName);
	}
	
	public void SetPhone(String id, String phone) {
		FindContactById(id).SetPhone(phone);
	}
	
	public void SetAddress(String id, String address) {
		FindContactById(id).SetAddress(address);
	}
}
