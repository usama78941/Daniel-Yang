package exer_2;

public class Staff extends Employee {
    private String title;

    public Staff(String title) {
        this.title = title;
    }

    public Staff(String office, double salary, String title, MyDate dateHired) {
        super(office, salary, dateHired);
        this.title = title;
    }

    public Staff(String name, String address, String emailAddress, long phoneNumber, String office, double salary, String title, MyDate dateHired) {
        super(name, address, emailAddress, phoneNumber, office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        return super.toString() + " and the employee belongs to staff " + " having a title of " + title;

    }
}
