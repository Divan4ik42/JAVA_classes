package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
       Rectangle r1 = new Rectangle(3,4);
       Rectangle r3 = new Rectangle(7,8);
       Rectangle r4 = new Rectangle(3,9);
       Squre sq1 = new Squre(4);

       IGeometry r2 = new Rectangle(5,6);
       IGeometry sq2 = new Squre(5);
       // В коллкции входят
       //список обьектов
        List<Rectangle> list = new ArrayList<>();
        List<IGeometry> figures = new ArrayList<>();

        figures.add(r1);
        figures.add(r2);
        figures.add(r3);
        figures.add(sq1);
        figures.add(sq2);


        list.add(r1);

        list.add(r3);

        System.out.println(list.size());
//item - в данном случаэ элемент списка
//list - указывает в каком списке мы будем искать

        double totalArea = 0;

        for (Rectangle item:list){
            System.out.println(item.toString() + " - " + item.getArea());
            totalArea += item.getArea();
//            totalArea = totalArea + item.getArea();    - ИДЕНТИЧНО


        }
        System.out.println(totalArea);

        double totalAllArea = 0;
        for(IGeometry item : figures){
            System.out.println(item.toString() + " - " + item.getArea());
            totalAllArea += item.getArea();
        }
        System.out.println(totalAllArea);
//еще один способ как добовлять обьекты в список
        List<Squre> listOfSquares = new ArrayList<>(
                Arrays.asList(
                        sq1,
                        new Squre(5),
                        new Squre(7),
                        new Squre(9)
                )
        );
        System.out.println(listOfSquares.get(0));
        System.out.println(listOfSquares.get(2));

        //------------------------------------------------

        //------------------------------------------------

        //STREAMS!!!!!!
        System.out.println("__________________");
        list.stream().filter(item -> item.getArea()>30).forEach(System.out::println);
        System.out.println("__________________");
        List<String> words = new ArrayList<>();
        words.add("hello");
        words.add("red");
        words.add("manky");
        words.add("alex");
        words.add("java");
        words.add("academy");
        words.add("cool");
        //отсикаем слова что короче 4
        List<String> shortList = words.stream().filter(item -> item.length()>4).collect(Collectors.toList());
        System.out.println(shortList);
        // (item -> item.length()>4) - ЭТО ЛЯМБДА ВЫРАЖЕНИЕ


    }
}
