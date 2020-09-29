package com.company;

public class Main {

    public static void main(String[] args) {

        Cylinder c1 = new Cylinder(2,5);
        double PerimeterC1 = c1.getPerimeter();
        double sideAreaC1 = c1.getSideArea();
        double circleAreaC1 = c1.getCircleArea();
        double totalCylinderAreaC1 = c1.geTotalCylinderArea();

        System.out.println(c1.toString());

        Cylinder c2 = new Cylinder(4,2);
        double PerimeterC2 = c2.getPerimeter();
        double sideAreaC2 = c2.getSideArea();
        double circleAreaC2 = c2.getCircleArea();
        double totalCylinderAreaC2 = c2.geTotalCylinderArea();

        System.out.println(c2.toString());

        Cylinder c3 = new Cylinder(24,6);
        double PerimeterC3 = c3.getPerimeter();
        double sideAreaC3 = c3.getSideArea();
        double circleAreaC3 = c3.getCircleArea();
        double totalCylinderAreaC3 = c3.geTotalCylinderArea();

        System.out.println(c3.toString());
        

    }
}
