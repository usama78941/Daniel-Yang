package exer_2;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    private static final double KILOGRAMS_PER_POUND = 0.45459237;
    private static final double METRES_PER_INCH = 0.0254;
    private static final double METERS_PER_FEET = 0.3048;

    public BMI(String name, int age, double weight, int height){
        this(name, age, weight, height * METERS_PER_FEET);

    }

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    public double getBMI() {
        double bmi = weight * KILOGRAMS_PER_POUND / ((height * METRES_PER_INCH) * (height * METRES_PER_INCH));
        return Math.round(bmi * 100) / 100;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public static void main(String[] args) {
        BMI bmi = new BMI("Muhammad Usama", 19, 85, 60);
        System.out.println("The person: " + bmi.getName() + bmi.getStatus());
    }
}
