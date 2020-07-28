package com.company;

public class rectangle {
    private int length;
    private  int width;

    public rectangle(int length, int width) { //  КОНСТРУКТОР
        this.length = length;
        this.width = width;
    }
//--------------
    public rectangle() {
    }
//----------------
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    int getArea(){
        return length * width;
    }
    int getPerimetr(){
        return (length + width) * 2;

    }
    //GENERATE - to string
    @Override
    public String toString() {
        return "rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + getArea() +
                '}';
    }
}
