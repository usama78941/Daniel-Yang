package exer_13;

public class MyRectangle2D {
    private double x;
    private double y;

    private double width;
    private double height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return (2 * width) + (2 * height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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

    public boolean contains(double x, double y){
        return this.x - x <= width / 2.0 && this.y - y <= height / 2;
    }

    public boolean contains(MyRectangle2D myRectangle2D){
        return contains(myRectangle2D.x, myRectangle2D.y);

    }

    public boolean overlaps(MyRectangle2D myRectangle2D){

    }
}
