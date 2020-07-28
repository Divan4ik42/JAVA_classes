package com.company;

public class Main {

    public static void main(String[] args) {
        String text = "Hello OOP";
        System.out.println(text);

        // OOP єто типі данніх

        int a = 5;
        Integer b = 6; // тоже самое что и int - yj ,НО больше функций  - єто КЛАСС

        double c = (double) a; // нам необходим тип данніх "а" переделать в double

        System.out.println("а = " + a);
        System.out.println("с = " + c); // конвертация успешна в дабл

        double d = b.doubleValue(); // конвертация КЛАССА
        System.out.println("d = " + d);

        String value = "1234"; // конвертация текста в цифри
        Integer numberInt = Integer.valueOf(value);
        System.out.println("конверт текст на цифрі = " + numberInt);

        // Императивное прагромирование
        // найти площядь прямоугольника длинной 3 см и шириной 4 см

        int length = 3;
        int width = 4;
        int area = length * width;
        System.out.println(area);

        rectangle r1 = new rectangle(3,4);

        int areaR1 = r1.getArea();
        System.out.println(areaR1);
    }
}
