package exer_9;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.tan;
public class RegularPolygon {
    private int n = 3;
    private double side = 1; // length of side
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {

    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter(){
        return n * side;
    }

    public double getArea(){
        return (n * pow(side, 2)) / (4 * tan(PI/n));
    }

    public static void main(String[] args) {
        RegularPolygon regularPolygon = new RegularPolygon();
        System.out.println("Perimeter of 1st is: " + regularPolygon.getPerimeter() + " with an area of " + regularPolygon.getArea());

        RegularPolygon regularPolygon1 = new RegularPolygon(6, 4);
        System.out.println("Perimeter of 2nd is: " + regularPolygon1.getPerimeter() + " with an area of: " + regularPolygon1.getArea());

        RegularPolygon regularPolygon2 = new RegularPolygon(10,4, 5.6, 7.8);
        System.out.println("Perimeter of 3rd is: " + regularPolygon2.getPerimeter() + " with the area of: " + regularPolygon2.getArea());
    }
}
