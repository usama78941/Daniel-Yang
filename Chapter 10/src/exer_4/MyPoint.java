package exer_4;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint(){
        this(0, 0);
    }

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint myPoint){
        return Math.pow((Math.pow((this.x - myPoint.x), 2) + Math.pow((this.y - myPoint.y), 2)), 1 / 2.0);
    }

    public double distance(double x, double y){
        return Math.pow((Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2)), 1 / 2.0);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(0, 0);
        MyPoint myPoint1 = new MyPoint(10, 30.5);
        System.out.println("The distance between two points is: " + myPoint.distance(myPoint1));
    }
}
