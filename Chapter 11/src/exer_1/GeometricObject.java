package exer_1;

public class GeometricObject {
    private boolean isFilled;
    private String colour;

    public GeometricObject() {
        this(false, "White");
    }

    public GeometricObject(boolean isFilled, String colour) {
        this.isFilled = isFilled;
        this.colour = colour;

    }

    public String getColour() {
        return colour;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        return "The colour of the object is: " + getColour() + " and is the object filled? " + isFilled;

    }
}
