package com.company;

public class Rectangle {

    private double length;
    private double width;
    public static final int sides = 4; //статическая переменная

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.getLength() * this.getWidth();
    }
    // вычислить не создавая new
    public static double getArea(double length, double width){
        return length*width;
    }
    // вычислить не создавая new

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
