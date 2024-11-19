package cellphone;
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
