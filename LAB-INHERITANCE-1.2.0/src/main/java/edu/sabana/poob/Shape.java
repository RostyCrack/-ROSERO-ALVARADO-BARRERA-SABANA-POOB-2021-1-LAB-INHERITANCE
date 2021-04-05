package edu.sabana.poob;

public abstract class Shape {

    private String color;

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    abstract double getArea();

    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("This is a %s with color %s"
                , this.getClass().getSimpleName()
                , this.color == null ? "NONE" : this.color);
    }
}
