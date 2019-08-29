package exer_11;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    public boolean contains(double x, double y) {
        return Math.pow(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2), 1 / 2.0) < radius;
    }

    public boolean contains(Circle2D circle2D) {
        return Math.pow(Math.pow((circle2D.x - this.x), 2) + Math.pow((circle2D.y - this.y), 2), 1 / 2.0) + circle2D.radius < radius;
    }

    public boolean overlaps(Circle2D circle2D) {
        return (Math.pow(Math.pow((circle2D.x - this.x), 2) + Math.pow((circle2D.y - this.y), 2), 1 / 2.0)) < radius + circle2D.radius;
    }

    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("area of c1 is: " + c1.getArea());
        System.out.println("perimeter of c1 is: " + c1.getPerimeter());
        System.out.println("does it contains: " + c1.contains(3, 3));

        System.out.println("does it contains: " + c1.contains(new Circle2D(4, 5, 10.5)));

        System.out.println("does it overlap: " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}
