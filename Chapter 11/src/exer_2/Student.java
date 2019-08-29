package exer_2;

public class Student extends Person {
    public static final String FRESHMEN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";
    private String classStatus;

    public Student(String classStatus) {
        this.classStatus = classStatus;
    }

    public Student(String name, String address, String emailAddress, long phoneNumber, String classStatus) {
        super(name, address, emailAddress, phoneNumber);
        this.classStatus = classStatus;
    }

    public String getClassStatus() {
        return classStatus;
    }

    @Override
    public String toString() {
        return super.toString() + " and the person is a student with the class status: " + classStatus;
    }
}
