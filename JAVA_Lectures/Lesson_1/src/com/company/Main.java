package com.company;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello awesome World");
        System.out.println("This hi from Alexey");
        byte age = 34;
        System.out.println("my age is " + age + " years");
        short height = 171;
        System.out.println("my height is " + height + " cm");
        int salary = 4000;
        System.out.println("I want to get salary " + salary + " dollars per mounth"  );
        char sign = '$';
        byte a = 5;
        double weight = 60.5;
        int weight2 =  60;
        boolean adoult = true;
        long distance = 18000000;
        String word = "hello";
        int a2 = 7;
        int b2 = 2;
        int c2 = a2/b2;
        System.out.println(c2);
        double c3 = (double) a2 / b2;
        System.out.println(c3); // COMMENTS;
        /*
       TASK
        * */

        String Harry = "Mr. and Mrs. Dursley, of number four, Privet" +
                " Drive, were proud to say that they were perfectly normal," +
                " thank you very much. They were the last people you'd expect to be involved in anything strange or mysterious, because they just didn't hold with such nonsense.\n" +
                "Mr. Dursley was the director of a firm called Grunnings, which made drills. He was a big, beefy man with hardly any neck, although he did have a very large mustache. Mrs. Dursley was thin and blonde and had nearly twice the usual amount of neck, which came in very useful as she spent so much of her time craning over garden fences, spying on the neighbors. The Dursleys had a small son called Dudley and in their opinion there was no finer boy anywhere.\n" +
                "The Dursleys had everything they wanted, but they also had a secret, and their greatest fear was that somebody would discover it. They didn't think they could bear it if anyone found out about the Potters. Mrs. Potter was Mrs...";
        String [] words = Harry.split(" "); // расчипить текст по пробелам   Harry.split(" ")
        System.out.println(words[5]);
        for (int i = 0; i <=10; i++) {
            System.out.println(words[i]); // циклі  (i++) - єто один шаг



        }









    }
}
