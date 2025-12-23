package AddressBookSystem;

import java.util.ArrayList;

public class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully");
    }

    public void editContact(String firstName, String newCity) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(firstName)) {
                c.setCity(newCity);
                System.out.println("Contact updated");
                return;
            }
        }
        System.out.println("Contact not found");
    }
    public void deleteContact(String firstName) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(firstName)) {
                contacts.remove(c);
                System.out.println("Contact deleted");
                return;
            }
        }
        System.out.println("Contact not found");
    }
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available");
            return;
        }
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
