public abstract class Shape {

    String colour;
    public boolean filled = false;

    Shape() {
    }

    Shape(boolean filled, String colour) {
        this.filled = filled;
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract public double getArea();
    abstract public double getPerimeter();
    abstract public String toString();

}
