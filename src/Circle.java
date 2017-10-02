public class Circle extends Shape{

    private double rad;

    public Circle() {
    }

    Circle (double rad) {
        this.rad = rad;
    }

    Circle (double rad, String colour, boolean filled) {
        this.filled = filled;
        this.rad = rad;
        this.colour = colour;
    }

    public double getRad() {
        return rad;
    }
    public void setRad(double rad) {
        this.rad = rad;
    }


    @Override
    public double getArea() {
        return (rad * rad * Math.PI);
    }

    @Override
    public double getPerimeter() {
        return (rad * 2 * Math.PI);
    }

    @Override
    public String toString() {

        if(this.colour!=null) {
            return "Circle{" +
                    "length=" + getPerimeter() + " area=" + getArea() + " perimeter=" + getPerimeter() + " color= "+colour+
                    '}';
        }else
            return "Circle{" +
                    "length=" + getPerimeter() + " area=" + getArea() + " perimeter=" + getPerimeter() +
                    '}';

    }

}
