public class Main {
    public static void main(String[] args) {



        Triangle triangle = new Triangle(50,40);
        System.out.println("area of a circle "+triangle.findArea());

        Rectangle rectangle = new Rectangle(30,20);
        System.out.println("area of a rectangle " +rectangle.findArea());

        Circle circle = new Circle(30,20,20);
        System.out.println("area of a circle "+circle.findArea());

        Square square = new Square(20,20);
        System.out.println("area of a square "+square.findArea());
    }
}