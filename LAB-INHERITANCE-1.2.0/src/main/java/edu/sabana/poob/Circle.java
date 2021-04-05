package edu.sabana.poob;

public class Circle extends Shape {

    private double radius;
    final static double pi = Math.PI;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getDiameter() {
        return this.radius * 2;
    }

    @Override
    public double getArea() {
        return pi*this.radius*this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2*pi*this.radius;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " and radius %s", this.radius);

    }
}
