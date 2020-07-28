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

        rectangle r2 = new rectangle(5,3);
        rectangle r3 = new rectangle(2,8);
        int areaR2 = r2.getArea();
        int areaR3 = r3.getArea();
        System.out.println(areaR2);
        System.out.println(areaR3);

        int perimetrR1 = r1.getPerimetr();
        System.out.println(perimetrR1);
        int perimetrR2 = r2.getPerimetr();
        System.out.println(perimetrR2);
        int perimetrR3 = r3.getPerimetr();
        System.out.println(perimetrR3);

        //мі хотим в ректангле R2 увеличить длинну на 3 и уменшить ширину на 1. ЄТО ДЕЛАЕТСЯ с помощью SETTERA
        r2.setLength(8);
        r2.setWidth(2);
        System.out.println(r2.getArea());


        System.out.println(r2.toString());

        rectangle r4 = new rectangle();
        r4.setWidth(5);
        r4.setLength(6);

        System.out.println(r4.toString());


    }
}
