package org.example;

public class Circle extends Shape{

    private final double pi = 3.14159265358979323846;
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        if(radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return this.pi * this.radius * this.radius;
    }

    @Override
    public double perimeter() {
        return 2 * this.pi * this.radius;
    }

    public int perimeter(double radius) {
        if(radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        return (int) (2 * this.pi * radius);
    }
}
