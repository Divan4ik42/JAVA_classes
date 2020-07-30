package com.company;

public class Triangle {
    
    private float sideA;
    private float sideB;
    private float sideC;
    
    public Triangle(float A, float B, float C) {
        this.sideA = A;
        this.sideB = B;
        this.sideC = C;
    }
    public Triangle(float A, float B, double gamma) {
        this.sideA = A;
        this.sideB = B;
        this.sideC = (float) Math.sqrt(A*A + B*B - 2*A*B*Math.cos(gamma));
    }
// a*a + b*b - 2*a*b*gamma
    public Triangle() {
    }

    public float getPerimeter  (){
        return sideA + sideB + sideC;
    }
    public double getArea() {
        float p = this.getPerimeter()/ 2;
        double area = Math.sqrt(p *(p - sideA)*(p - sideB)*(p - sideC));
        return area;
    }

    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    public float getSideC() {
        return sideC;
    }

    public void setSideC(float sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", area " + this.getArea() +
                ", perimeter" + this.getPerimeter() +
                
                '}';
        
    }
}

