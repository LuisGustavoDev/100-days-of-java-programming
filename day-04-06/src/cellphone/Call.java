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

    public Call(Contact originContact, Contact destinationContact) {
        this.originNumber = originContact.getNumber();
        this.destinationNumber = destinationContact.getNumber();
    }

    public void toCall() {
        System.out.println("Calling to " + destinationNumber);
        System.out.println("Calling...");
        System.out.println("Busy number");
        // day/month/year hours:minutes:ss - Brazil
        // dd/MM/YYYY HH:mm:ss
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
        LocalDateTime dateNow = LocalDateTime.now();
        callTime = dateFormatter.format(dateNow);
;    }

    @Override
    public String toString() {
       String information = String.format("Origin: %s\tDestination: %s\tTime: %s",
       originNumber, destinationNumber, callTime
       );
       return information;
    }

    public String getOriginNumber() {
        return originNumber;
    }
    public void setOriginNumber(String originNumber) {
        this.originNumber = originNumber;
    }
    public String getDestinationNumber() {
        return destinationNumber;
    }
    public void setDestinationNumber(String destinationNumber) {
        this.destinationNumber = destinationNumber;
    }

    
}
