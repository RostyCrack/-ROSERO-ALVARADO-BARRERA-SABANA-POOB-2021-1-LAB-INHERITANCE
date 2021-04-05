package edu.sabana.poob;

public class Triangle extends Shape{

    private double size1;
    private double size2;
    private double size3;

    public Triangle(){
        size1 = 1;
        size2 = 1;
        size3 = 1;
    }

    public Triangle(String color){
        super(color);
        size1 = 1;
        size2 = 1;
        size3 = 1;
    }

    public Triangle(String color, double size1, double size2, double size3){
        super(color);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }
    public Triangle(double size1, double size2, double size3){
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }


    @Override
    double getArea() {
        double p = (this.size1 + this.size2 + this.size3)/2;
        return Math.sqrt(p*(p-this.size1)*(p-this.size2)*(p-this.size3));

    }

    @Override
    public double getPerimeter() {
        return this.size1 + this.size2 + this.size3;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " and sides %s, %s, %s"
                ,this.size1
                ,this.size2
                ,this.size3);
    }

    public boolean isEquilateral(){
        return this.size1 == this.size2 && this.size3 == this.size1;
    }

    public boolean isIsosceles(){
        return this.size1 == this.size2 || this.size1==this.size3 || this.size2==this.size3;
    }
}
