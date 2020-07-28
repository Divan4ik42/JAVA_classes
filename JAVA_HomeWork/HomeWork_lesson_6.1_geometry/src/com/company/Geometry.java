package com.company;
//circle

public class Geometry {
    private int radius;

    public Geometry(int radius) {
        this.radius = radius;
    }

    public Geometry() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                '}';
    }
    public double getArea(){
        double area = Math.PI * radius * radius; // два "пи р квадрат"
        return area;
        }
    }


