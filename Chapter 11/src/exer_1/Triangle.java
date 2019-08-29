package exer_1;

import java.util.Scanner;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean isFilled, double side1, double side2, double side3) {
        super(isFilled, color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (side1 + side3 + side2) / 2.0;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 1 / 2.0);
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle separated by spaces: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("What is the color of triangle: ");
        String color = scanner.nextLine();

        System.out.print("Is the triangle filled: ");
        boolean isFilled = scanner.nextBoolean();

        Triangle triangle = new Triangle(color, isFilled, side1, side2, side3);
        System.out.println("The area of the triangle is: " + triangle.getArea() + "\nThe perimeter of the triangle is: " + triangle.getPerimeter() + "\nThe color of the triangle is: " + triangle.getColour() + "\nIs the triangle filled? " + triangle.isFilled());
    }
}
