package exer_2;

public class TestClass {
    public static void main(String[] args) {
        Person person = new Person("Muhammad Usama", "Misha Cottage", "saimali78941@gmail.com", 3156180891L);
        Staff staff = new Staff("Muhammad Usama", "Misha Cottage", "saimali78941@gmail.com", 3156180891L, "Microsoft", 50000, "Software Developer", new MyDate(System.currentTimeMillis()));
        Student student = new Student("Muhammad Usama", "Misha Cottage", "saimali78941@gmail.com", 3156180891L, Student.SOPHOMORE);
        Employee employee = new Employee("Muhammad Usama", "Misha Cottage", "saimali78941@gmail.com", 3156180891L, "Microsoft", 50000, new MyDate(System.currentTimeMillis()));
        Faculty faculty = new Faculty("Muhammad Usama", "Misha Cottage", "saimali78941@gmail.com", 3156180891L, "Microsoft", 50000, 10, 6, new MyDate(System.currentTimeMillis()));
        System.out.println(person);
        System.out.println(staff);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
    }
}
