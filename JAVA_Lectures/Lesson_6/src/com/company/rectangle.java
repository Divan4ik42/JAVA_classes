package com.company;

public class rectangle {
    private int length;
    private  int width;

    public rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    int getArea(){
        return length * width;
    }
}
