package AddressBookSystem;

import java.util.HashMap;

public class AddressBookManager {

    private HashMap<String, AddressBook> books = new HashMap<>();

    public void addAddressBook(String name) {
        if (!books.containsKey(name)) {
            books.put(name, new AddressBook());
            System.out.println("Address Book created: " + name);
        } else {
            System.out.println("Address Book already exists");
        }
    }

    public AddressBook getAddressBook(String name) {
        return books.get(name);
    }
}
