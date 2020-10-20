package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");
        Rectangle r1 = new Rectangle(3,4);
        System.out.println(r1.getArea());

        // вычислить не создавая new
        System.out.println(Rectangle.getArea(5, 6));
        // вычислить не создавая new
        System.out.println(Math.sin(0.2));

        System.out.println(Rectangle.sides); //статическая переменная/ Имеем доступ из любого класса
        System.out.println(Math.PI);
        Map<Integer,String> week = new HashMap<>();
        week.put(1,"monday");
        week.put(2,"tuesday");
        week.put(3,"wednesday");
        week.put(4,"thursday");
        week.put(5,"friday");
        week.put(6,"saturday");
        week.put(7,"sunday");
        week.put(8,"sunday");
        week.put(0,"sunday");
        week.put(-1,"sunday");
        week.put(null,"sunday");

        week.put(1,"abcd");// ЗАМЕНА
        // двух ключей быть не может
        //два одинаковые значения ДОПУСКАЮТСЯ

        System.out.println(week);


    }
}
