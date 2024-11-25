
package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        Square square = new Square(5.0);
        Triangle triangle = new Triangle(3, 5, 2);


        print(square, "Square");
        print(triangle, "Triangle");
        print(circle, "Circle");

        System.out.println("Circle overloading perimeter: " + circle.perimeter(circle.getRadius()));
    }

    public static void print(Shape shape, String shapeName) {
        System.out.println(shapeName + " area: " + shape.area());
        System.out.println(shapeName + " perimeter: " + shape.perimeter());
    }
}