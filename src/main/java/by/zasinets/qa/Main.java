package by.zasinets.qa;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("black", 3);
        Rectangle rectangle = new Rectangle("red", 3, 3);
        Triangle triangle = new Triangle("blue", 4, 4);

        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Area of triangle: " + triangle.calculateArea());

    }
}
