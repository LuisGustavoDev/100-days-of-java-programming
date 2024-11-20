# CellPhone Contacts and Call Manager in Java

This project showcases a Java-based system for managing contacts and call history using object-oriented programming principles. The program provides functionalities to add, store, search for contacts, and simulate calls, while maintaining a log of call details.

## Project Structure

- **Contact**: Represents an individual contact with a name and phone number.

- **ContactRepository**: Manages a collection of contacts, allowing additions and keyword-based searches.

- **Call**: Represents a call, storing details like origin, destination, and call time.

- **CallRepository**: Maintains a log of all calls made from the cell phone.

- **CellPhone**: Simulates a cell phone, integrating contact and call repositories for full functionality.

- **App**: The main class to demonstrate the usage of all components.

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

### Call

The **Call** class represents a phone call, storing details like the origin, destination, and the time of the call.

```java
package cellphone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Call {
    private String originNumber;
    private String destinationNumber;
    private String callTime;

    public Call(String originNumber, String destinationNumber) {
        this.originNumber = originNumber;
        this.destinationNumber = destinationNumber;
    }

    public void initiateCall() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        callTime = LocalDateTime.now().format(formatter);
        System.out.printf("Calling from %s to %s... Call logged.%n", originNumber, destinationNumber);
    }

    @Override
    public String toString() {
        return String.format("From: %s\tTo: %s\tTime: %s", originNumber, destinationNumber, callTime);
    }
}
```

### CallRepository

The CallRepository class keeps a log of all calls made from the cell phone.

```java
package cellphone;

import java.util.ArrayList;

public class CallRepository {
    private ArrayList<Call> calls;

    public CallRepository() {
        this.calls = new ArrayList<>();
    }

    public void addCall(Call call) {
        calls.add(call);
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Call History:\n");
        for (Call call : calls) {
            info.append(call).append("\n");
        }
        return info.toString();
    }
}
```


### CellPhone

The **CellPhone** class holds the phone number of the cell phone and has a **ContactRepository** instance for managing the contacts associated with that phone.

```java
package cellphone;

public class CellPhone {
    private String phoneNumber;
    private ContactRepository contactRepository;
    private CallRepository callRepository;

    public CellPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.contactRepository = new ContactRepository();
        this.callRepository = new CallRepository();
    }

    public void call(String number) {
        Call call = new Call(phoneNumber, number);
        call.initiateCall();
        callRepository.addCall(call);
    }

    public void call(Contact contact) {
        call(contact.getNumber());
    }

    public ContactRepository getContactRepository() {
        return contactRepository;
    }

    public CallRepository getCallRepository() {
        return callRepository;
    }
}
```

### Main Application

The **App** class demonstrates how to use the **CellPhone**, **Contact**, and **ContactRepository** classes. It creates contacts, adds them to the cell phone, and demonstrates the search functionality.

```java
package cellphone;

public class App {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone("4002-8922");

        ContactRepository contactRepo = cellPhone.getContactRepository();
        contactRepo.add("Pedro", "12345");
        contactRepo.add("Luan", "67890");
        contactRepo.add("Luís", "54321");

        System.out.println(contactRepo);

        System.out.println("Filtered Contacts (by 'L'):");
        System.out.println(contactRepo.searchByKeyword("L"));

        Contact contact = new Contact("Carlos", "98765");
        cellPhone.call(contact);
        cellPhone.call("54321");

        System.out.println(cellPhone.getCallRepository());
    }
}
```

## What I Learned on Days 4 and 5

On Days 4 and 5, I focused on applying core object-oriented principles and expanding functionality within a Java-based system for managing contacts and simulating calls. Here's a summary of what I explored and learned:

### Core Object-Oriented Principles (Day 4)

- **Encapsulation**: I used private fields in the `Contact` and `CellPhone` classes to hide implementation details and expose only necessary information through getter and setter methods.

- **Composition**: The `CellPhone` class contains an instance of `ContactRepository`, showcasing the composition design pattern.

- **Search Functionality**: Implemented a basic search method that filters contacts by a keyword (name prefix).

- **Dynamic Collections**: Leveraged ArrayList for flexible and efficient contact management, enabling seamless addition and retrieval operations.

### Expanding Functionality (Day 5)

On the second day, I extended the application by implementing a call simulation system:

- **Call Simulation**: Designed a `Call` class to represent phone calls, storing details like origin, destination, and call time. Calls were logged in a `CallRepository` to maintain a call history.

- **Date and Time Management**: Utilized Java's `LocalDateTime` and `DateTimeFormatter` to capture and format the exact time of each call.

- **Polymorphism**: Added overloaded `call` methods in the `CellPhone` class to support calls initiated using either a `Contact` object or a plain phone number.

- **Call History Logging**: Enhanced the application by providing a structured log of all calls, offering users a clear overview of their communication history

## How to Run the Project

1. Clone the repository to your local machine using the following command:
```bash
git clone https://github.com/LuisGustavoDev/100-days-of-java-programming.git
```
2. Compile and run the **App.java** file from the `cellphone` package.
3. Observe the behaviors of each contact management feature, including adding contacts and searching by keyword, by checking the console output.



