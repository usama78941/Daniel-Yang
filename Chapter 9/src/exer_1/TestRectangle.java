package exer_1;

public class TestRectangle {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(4, 40);
        Rectangle rectangle1 = new Rectangle(3.5, 35.9);

        System.out.println("width of rectangle 0 is " + rectangle.width + " with the height of " + rectangle.height +
                " having area of " + rectangle.getArea() + " with the perimeter of " + rectangle.getPerimeter());

        System.out.println("width of rectangle 1 is " + rectangle1.width + " with the height of " + rectangle1.height +
                " having area of " + rectangle1.getArea() + " with the perimeter of " + rectangle1.getPerimeter());

    }
}
