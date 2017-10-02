public class Square extends Shape{

    private double side;

    public Square() {
    }

    public Square(double side) {

        this.side = side;

    }

    public Square(double side, String colour) {

        this.side = side;
        this.colour = colour;

    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }


    @Override
    public String toString() {

        if(this.colour!=null) {
            return "Square{" +
                    "side=" + side + " colour="+colour+
                    '}';
        }else
            return "Square{" +
                    "side=" + side +
                    '}';

    }
}
