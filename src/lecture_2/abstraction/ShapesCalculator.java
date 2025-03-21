package lecture_2.abstraction;

public class ShapesCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(7);
        System.out.println("Circle area: " + circle.area());

        Shape rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rectangle.area());
    }
}
