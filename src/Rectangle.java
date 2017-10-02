public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {

        this.length = length;
        this.width = width;

    }

    public Rectangle(double length, double width, String color, boolean filled ) {

        this.length = length;
        this.width = width;
        this.colour = colour;
        this.filled = filled;

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {

        if(this.colour!=null) {
            return "Rectangle{" +
                    "length=" + length + " width=" + width + " color= "+colour+
                    '}';
        } else
            return "Rectangle{" +
                    "length=" + length + " width=" + width +
           '}';

    }
}
