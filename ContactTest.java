package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import contact.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("1", "John", "Doe", "5555555555", "A");
		assertTrue(contact.GetId().equals("1"));
		assertTrue(contact.GetFirstName().equals("John"));
		assertTrue(contact.GetLastName().equals("Doe"));
		assertTrue(contact.GetPhone().equals("5555555555"));
		assertTrue(contact.GetAddress().equals("A"));
	}
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("55555555555", "John", "Doe", "5555555555", "A");
		});
	}
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "ZZZZZZZZZZZ", "Doe", "5555555555", "A");
		});
	}
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "ZZZZZZZZZZZ", "5555555555", "A");
		});
	}
	
	@Test
	void testContactPhoneInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Doe", "5555555", "A");
		});
	}
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Doe", "5555555555", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
		});
	}
}
