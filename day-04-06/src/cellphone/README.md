# CellPhone Contacts Manager in Java

This project demonstrates how to manage a collection of contacts in a CellPhone application using object-oriented programming principles in Java. It allows you to add, store, and search contacts by keywords.

## Project Structure

- **Contact**: Represents an individual contact with a name and phone number.

- **ContactRepository**: Stores and manages a collection of contacts. Provides functionality to add contacts and search by keywords.

- **CellPhone**: Represents a cell phone, which contains a phone number and a contact repository for managing contacts.

- **App**: The main application class that runs the program, where contacts are created, added to the cell phone, and searched.

### Contact

The **Contact** class holds the details of a contact, including the name and phone number. It also provides methods to access and modify the contact's attributes.

```java
public class Contact {
    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\t Number: %s", name, number);
    }
}
```

### ContactRepository

The **ContactRepository** class manages a list of contacts, allowing the addition of new contacts and the ability to search for contacts by a keyword (e.g., name prefix). The search functionality returns contacts whose names start with the specified keyword.

```java
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
        StringBuilder information = new StringBuilder("Contacts:\n");
        for (Contact contact : contacts) {
            information.append(contact.toString()).append("\n");
        }
        return information.toString();
    }
}
```

### CellPhone

The **CellPhone** class holds the phone number of the cell phone and has a **ContactRepository** instance for managing the contacts associated with that phone.

```java
public class CellPhone {
    private String phoneNumber;
    private ContactRepository contactRepository;

    public CellPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.contactRepository = new ContactRepository();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ContactRepository getContactRepository() {
        return contactRepository;
    }
}
```

### Main Application

The **App** class demonstrates how to use the **CellPhone**, **Contact**, and **ContactRepository** classes. It creates contacts, adds them to the cell phone, and demonstrates the search functionality.

```java
public class App {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone("4002 8922");

        // Creating contacts
        Contact contact1 = new Contact("Pedro", "40897423");
        Contact contact2 = new Contact("Luan", "9876543");
        Contact contact3 = new Contact("Luís", "12345678");
        Contact contact4 = new Contact("Carlos", "12345678");

        // Adding contacts to the contact repository
        ContactRepository contactsCellphone = cellPhone.getContactRepository();
        contactsCellphone.addContact(contact1);
        contactsCellphone.addContact(contact2);
        contactsCellphone.addContact(contact3);
        contactsCellphone.addContact(contact4);

        // Printing all contacts
        System.out.println(contactsCellphone);

        // Searching contacts by keyword
        System.out.println("Filter Contacts (by 'L'):");
        System.out.println(contactsCellphone.searchByKeyword("L"));
    }
}
```


CellPhone Contacts Manager in Java
This project demonstrates how to manage a collection of contacts in a CellPhone application using object-oriented programming principles in Java. It allows you to add, store, and search contacts by keywords.

Project Structure
Contact: Represents an individual contact with a name and phone number.
ContactRepository: Stores and manages a collection of contacts. Provides functionality to add contacts and search by keywords.
CellPhone: Represents a cell phone, which contains a phone number and a contact repository for managing contacts.
App: The main application class that runs the program, where contacts are created, added to the cell phone, and searched.
Contact
The Contact class holds the details of a contact, including the name and phone number. It also provides methods to access and modify the contact's attributes.

java
Copiar código
public class Contact {
    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\t Number: %s", name, number);
    }
}
ContactRepository
The ContactRepository class manages a list of contacts, allowing the addition of new contacts and the ability to search for contacts by a keyword (e.g., name prefix). The search functionality returns contacts whose names start with the specified keyword.

java
Copiar código
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
        StringBuilder information = new StringBuilder("Contacts:\n");
        for (Contact contact : contacts) {
            information.append(contact.toString()).append("\n");
        }
        return information.toString();
    }
}
CellPhone
The CellPhone class holds the phone number of the cell phone and has a ContactRepository instance for managing the contacts associated with that phone.

java
Copiar código
public class CellPhone {
    private String phoneNumber;
    private ContactRepository contactRepository;

    public CellPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.contactRepository = new ContactRepository();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ContactRepository getContactRepository() {
        return contactRepository;
    }
}
App
The App class demonstrates how to use the CellPhone, Contact, and ContactRepository classes. It creates contacts, adds them to the cell phone, and demonstrates the search functionality.

java
Copiar código
public class App {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone("4002 8922");

        // Creating contacts
        Contact contact1 = new Contact("Pedro", "40897423");
        Contact contact2 = new Contact("Luan", "9876543");
        Contact contact3 = new Contact("Luís", "12345678");
        Contact contact4 = new Contact("Carlos", "12345678");

        // Adding contacts to the contact repository
        ContactRepository contactsCellphone = cellPhone.getContactRepository();
        contactsCellphone.addContact(contact1);
        contactsCellphone.addContact(contact2);
        contactsCellphone.addContact(contact3);
        contactsCellphone.addContact(contact4);

        // Printing all contacts
        System.out.println(contactsCellphone);

        // Searching contacts by keyword
        System.out.println("Filter Contacts (by 'L'):");
        System.out.println(contactsCellphone.searchByKeyword("L"));
    }
}

## What I Learned Today

Today, I learned how to apply core object-oriented principles like **encapsulation**, **composition**, and **abstraction** in a real-world context. Key concepts explored include:

- **Encapsulation**: I used private fields in the `Contact` and `CellPhone` classes to hide implementation details and expose only necessary information through getter and setter methods.

- **Composition**: The `CellPhone` class contains an instance of `ContactRepository`, showcasing the composition design pattern.

- **Search Functionality**: Implemented a basic search method that filters contacts by a keyword (name prefix).

1. Clone the repository to your local machine using the following command:
```bash
git clone https://github.com/LuisGustavoDev/100-days-of-java-programming.git
```
2. Compile and run the **App.java** file from the `cellphone` package.
3. Observe the behaviors of each contact management feature, including adding contacts and searching by keyword, by checking the console output.



