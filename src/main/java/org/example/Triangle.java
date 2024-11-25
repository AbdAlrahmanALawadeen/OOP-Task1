package org.example;

public class Triangle extends Shape {

    private double base;
    private double height;
    private double side;

    public Triangle(double base, double height, double side) {
        if(base <= 0 || height <= 0 || side <= 0) {
            throw new IllegalArgumentException("Base and height and side must be positive");
        }
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return this.base * this.height / 2;
    }

    @Override
    public double perimeter() {
        return this.base + this.height + this.side;
    }

    public int perimeter(double base, double height, double side) {
        if(base <= 0 || height <= 0 || side <= 0) {
            throw new IllegalArgumentException("Base and height and side must be positive");
        }
        return (int) (side + base + height);
    }
}
