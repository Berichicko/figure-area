package by.zasinets.qa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожаллуйста введите radius, для нахождения площади круга по формуле (S = π × radius × radius ): ");
        double radius = scanner.nextInt();
        Circle circle = new Circle("желтый", radius);
        String colorCircle = circle.getColor();
        System.out.println("\u001B[33m" + "Круг: " + colorCircle);
        System.out.println("\u001B[33m" + "Площадь (S = π × radius × radius ) кргуа =  " + circle.calculateArea());
        System.out.println(" ");

        System.out.println("\u001B[0m" + "Пожаллуйста введите length и width, для нахождения площади прямоугольника по формуле (S = length × width )");
        double length = scanner.nextInt();
        double width = scanner.nextInt();
        Rectangle rectangle = new Rectangle("красный", length, width);
        String colorRectangle = rectangle.getColor();
        System.out.println("\u001B[31m" + "Прямоугольник:" + colorRectangle);
        System.out.println("\u001B[31m" + "Площадь  (S = length × width ) прямоугольника = " + rectangle.calculateArea());
        System.out.println(" ");

        System.out.println("\u001B[0m" + "Пожаллуйста введите width и height, для нахождения площади треугольника по формуле (S = (width × height)/2 ): ");
        double widthTriangle = scanner.nextInt();
        double height = scanner.nextInt();
        Triangle triangle = new Triangle("синий", widthTriangle, height);
        String colorTriangle = triangle.getColor();
        System.out.println("\u001B[34m" + "Треугольник:" + colorTriangle);
        System.out.println("\u001B[34m" + "Плащадь (S = (width × height)/2 ) треугольника = " + triangle.calculateArea());

    }
}
