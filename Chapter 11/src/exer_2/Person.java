package exer_2;

public class Person {
    private String name;
    private String address;
    private String emailAddress;
    private long phoneNumber;

    public Person(){

    }

    public Person(String name, String address, String emailAddress, long phoneNumber) {
        this.name = name;
        this.address = address;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "Person Class with name: " + name + ". Address is: " + address + ". Email address is: " + emailAddress + ". Phone number is: " + phoneNumber;
    }
}
