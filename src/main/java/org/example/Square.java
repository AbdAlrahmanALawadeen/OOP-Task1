package org.example;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be positive");
        }
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return this.side * this.side;
    }

    @Override
    public double perimeter() {
        return 4 * this.side;
    }

    public int perimeter(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be positive");
        }
        return (int) (side * 4);
    }
}
