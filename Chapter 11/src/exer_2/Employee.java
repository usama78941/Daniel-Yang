package exer_2;

public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;


    public Employee(){

    }

    public Employee(String office, double salary, MyDate dateHired){
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee(String name, String address, String emailAddress, long phoneNumber, String office, double salary, MyDate dateHired) {
        super(name, address, emailAddress, phoneNumber);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getDateHired(){return dateHired;}

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString(){
        return super.toString() + " and the person is an Employee with office: " +office + " and a monthly salary of: " + salary + " and he/she was hired on DD:MM:YYYY" + dateHired.getDay() + ":" + dateHired.getMonth() + ":" + dateHired.getYear();
    }
}
