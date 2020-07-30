package com.company;

public class Cylinder {
    private int height;
    private int radius;

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    double getPerimeter() {
        return (2 * Math.PI * radius);
        }
    double getSideArea(){
        return getPerimeter() * height;
    }
    double getCircleArea (){
        return Math.PI * radius * radius;
    }
    double geTotalCylinderArea (){
        return getSideArea() + (2 * getCircleArea());
    }

    @Override
    public String toString() {
        return "--------------------------------------------" + "\n" +
                "Cylinder { " +
                "height = " + height +
                ", radius = " + radius + " }" + "\n" +
                " "  + "\n" +
                "   CALCULATIONS ARE :       " + "\n" +
                " "  + "\n" +
                "Circle perimeter = " + getPerimeter() + "\n" +
                "Circle area = " + getCircleArea() + "\n" +
                "Cylinder side area = " + getSideArea() + "\n" +
                "Cylinder TOTAL area = " + geTotalCylinderArea() + "\n" +
                 "--------------------------------------------";

    }


    // периметр perimetr = 2PI*R
    // sideArea = rerimetr(2PI*R) * height
    // circleArea = PI*R*R
    // totalCilinderArea = 2pi*R*heught + 2*pi*R*R

}
