package exer_8;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public double getRadius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public boolean isOn() {
        return on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Fan() {

    }

    public String toString(){
        return on ? "the speed of the fan is: " + speed + ". Color of the fan is: " + color + ". Radius of the fan is: " + radius :
                "the color of the fan is: " + color + ". The radius of the fan is: " + radius + ". Fan is Off";
    }

    public static void main(String[] args) {
        Fan fan0 = new Fan();
        Fan fan1 = new Fan();

        fan0.setSpeed(Fan.FAST);
        fan0.setRadius(10);
        fan0.setColor("Yellow");
        fan0.setOn(true);

        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(5);
        fan1.setOn(false);
        fan1.setColor("Blue");

        System.out.println(fan0.toString());
        System.out.println(fan1.toString());


    }
}
