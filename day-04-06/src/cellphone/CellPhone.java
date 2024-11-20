package cellphone;
public class CellPhone {

    private String phoneNumber;
    private ContactRepository contactRepository;
    private CallRepository callHistory;

    public CellPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.contactRepository = new ContactRepository();
        this.callHistory = new CallRepository();
    }

    public void toCall(String destinationNumber) {
        Call call = new Call(phoneNumber, destinationNumber);
        call.toCall();
        callHistory.addCall(call);
    }

    public void toCall(Contact destinationContact) {
       toCall(destinationContact.getNumber());
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ContactRepository getContactRepository() {
        return contactRepository;
    }

    public CallRepository getCallHistory() {
        return callHistory;
    }

}
