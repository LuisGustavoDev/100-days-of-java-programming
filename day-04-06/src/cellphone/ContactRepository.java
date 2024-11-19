package cellphone;
import java.util.ArrayList;

public class ContactRepository {
    
    private ArrayList<Contact> contacts;

    public ContactRepository() {
        this.contacts = new ArrayList<Contact>();
    }

    public void add(String name, String number) {
        Contact newContact = new Contact(name, number);
        contacts.add(newContact);
    }

    public void addContact(Contact newContact) {
        contacts.add(newContact);
    }

    public ContactRepository searchByKeyword(String keyword) {
        String lowerKeyword = keyword.toLowerCase();
        ContactRepository filterContacts = new ContactRepository();
        for (Contact contact : contacts) {
            String lowerNameContact = contact.getName().toLowerCase();
            if (lowerNameContact.startsWith(lowerKeyword)) {
                filterContacts.addContact(contact);
            }
        }
        return filterContacts;
    }
    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        String information = "Contacts:\n";
        for (Contact contact : contacts) {
            information += contact.toString() + "\n";
        }
        return information;
    }
 
}
