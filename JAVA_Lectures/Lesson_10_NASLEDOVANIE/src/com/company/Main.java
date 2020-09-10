package com.company;

public class Main {

    public static void main(String[] args) {

        Window window = new Window(30,40,5, "wood", 5, 2, "Zas4elka");
        System.out.println(window.getArrea());
        window.setWidth(50);
        System.out.println(window.getArrea());
        System.out.println(window.toString());
    }
}
