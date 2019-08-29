package exer_2;

public class Faculty extends Employee {
    private int officeHrs;
    private int rank;

    public Faculty(int officeHrs, int rank) {
        this.officeHrs = officeHrs;
        this.rank = rank;
    }

    public Faculty(String office, double salary, int officeHrs, int rank, MyDate dateHired) {
        super(office, salary, dateHired);
        this.officeHrs = officeHrs;
        this.rank = rank;
    }

    public Faculty(String name, String address, String emailAddress, long phoneNumber, String office, double salary, int officeHrs, int rank, MyDate dateHired) {
        super(name, address, emailAddress, phoneNumber, office, salary, dateHired);
        this.officeHrs = officeHrs;
        this.rank = rank;
    }

    public int getOfficeHrs() {
        return officeHrs;
    }

    public void setOfficeHrs(int officeHrs) {
        this.officeHrs = officeHrs;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString(){
        return super.toString() + " and the employee belongs to faculty having office hrs: " + officeHrs + " and a rank of: " + rank;
    }
}
