public class shapeTest {

    public static void main(String[] args) {

        Square square = new Square(4, "green");
        System.out.println(square.toString());

        Rectangle rectangle = new Rectangle(6, 6);
        System.out.println(rectangle.toString());

        Circle circle = new Circle(6);
        System.out.println(circle.toString());
    }
}
