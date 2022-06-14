package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import contact.Contact;
import contact.ContactService;

class ContactServiceTest {
	//private ContactService contactService = new ContactService();
	//private Contact contact1 = new Contact("1", "John", "Doe", "5555555555", "A");
	//private Contact contact2 = new Contact("2", "Jane", "Pie", "6666666666", "B");
	//private Contact contact3 = new Contact("3", "Paul", "Bob", "7777777777", "C");

	@Test
	void testAddContact() {
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("1", "John", "Doe", "5555555555", "A");
		
		contactService.AddContact(contact1);
		assertTrue(contactService.GetContacts().contains(contact1));
	}
	
	@Test
	void testDeleteContact() {
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("1", "John", "Doe", "5555555555", "A");
		Contact contact2 = new Contact("2", "Jane", "Pie", "6666666666", "B");
		contactService.AddContact(contact1);
		contactService.AddContact(contact2);
		
		contactService.DeleteContact(contact2.GetId());
		assertTrue(!contactService.GetContacts().contains(contact2));
		assertTrue(contactService.GetContacts().contains(contact1));
	}
	
	@Test
	void testSetFirstName() {
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("1", "John", "Doe", "5555555555", "A");
		contactService.AddContact(contact1);
		
		contactService.SetFirstName(contact1.GetId(), "Joe");
		assertTrue(contact1.GetFirstName() == "Joe");
	}
	
	@Test
	void testSetLastName() {
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("1", "John", "Doe", "5555555555", "A");
		contactService.AddContact(contact1);
		
		contactService.SetLastName(contact1.GetId(), "Oak");
		assertTrue(contact1.GetLastName() == "Oak");
	}
	
	@Test
	void testSetPhone() {
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("1", "John", "Doe", "5555555555", "A");
		contactService.AddContact(contact1);
		
		contactService.SetPhone(contact1.GetId(), "6666666666");
		assertTrue(contact1.GetPhone() == "6666666666");
	}
	
	@Test
	void testSetAddress() {
		ContactService contactService = new ContactService();
		Contact contact1 = new Contact("1", "John", "Doe", "5555555555", "A");
		contactService.AddContact(contact1);
		
		contactService.SetAddress(contact1.GetId(), "B");
		assertTrue(contact1.GetAddress() == "B");
	}
}
