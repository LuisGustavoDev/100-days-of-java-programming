package cellphone;

public class App {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone("4002 8922");
        Contact contact = new Contact("Pedro", "40897423");
        Contact contact1 = new Contact("Luan", "9876543");
        Contact contact2 = new Contact("Luís", "12345678");
        Contact contact3 = new Contact("Carlos", "12345678");

        ContactRepository contactsCellphone = cellPhone.getContactRepository();
        contactsCellphone.addContact(contact);
        contactsCellphone.addContact(contact1);
        contactsCellphone.addContact(contact2);
        contactsCellphone.addContact(contact3);
        System.out.println(contactsCellphone);

        System.out.println("Filter Contacts:");
        System.out.println(contactsCellphone.searchByKeyword("L"));

        cellPhone.toCall(contact);
        cellPhone.toCall(contact1);
        cellPhone.toCall(contact2);
        cellPhone.toCall(contact3);
        System.out.println(cellPhone.getCallHistory());

    }
}
