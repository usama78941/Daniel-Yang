package exer_9;

public class Course {
    private String courseName;
    private String[] students = new String[10];
    private int numberOfStudents = 0;
    private int i;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String name) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }

        students[numberOfStudents] = name;
        numberOfStudents += 1;

    }

    public void dropStudent(String name) {
        if (doExists(name)) {
            students[i] = students[numberOfStudents - 1];
            students[numberOfStudents - 1] = null;
            numberOfStudents -= 1;
        } else {
            System.out.println("Student is not present in the record..!!");
        }

    }

    private boolean doExists(String name) {
        boolean isPresent = false;
        for (i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    private void clear() {
        for (int i = 0; i < students.length; i++) {
            students[i] = null;
        }
    }

    public static void main(String[] args) {
        Course course = new Course("Data Structures");
        course.addStudent("John");
        course.addStudent("Miller");
        course.addStudent("Tom");

        System.out.println("The total number of students are: " + course.getNumberOfStudents());

        for (String str : course.getStudents()) {
            System.out.println(str);
        }

        course.dropStudent("Miller");

        System.out.println("The total number of students after dropping on are: " + course.getNumberOfStudents());

        for (String str : course.getStudents()) {
            System.out.println(str);

        }



    }

}