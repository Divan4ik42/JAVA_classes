package com.company;

public class Squre implements IGeometry{
    private int side;

    public Squre() {
    }

    public Squre(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Squre{" +
                "side=" + side +
                '}';
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
