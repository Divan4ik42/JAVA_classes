package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello wonderful World");
        System.out.println("This Hello to you from Alexey, and i glad to talk to you");
        System.out.println("let me tell you about myself");

        // переменные
        byte age = 34;
        short birth = 1986;
        int distanse = 10000;
        long hearstrings = 100000000;
        double spoon = 1.5;
        byte percent = 100;
        char sign = '%';
        boolean smart = true;
        boolean unconfident = false;

        // моя история

        System.out.println("I am " + age + " years old now");
        System.out.println("So logically " + birth + " is the year of my bith");
        System.out.println("in past year i traveled more than " + distanse + " kilometers");
        System.out.println("I nave more than " + hearstrings + " hairs on my head");
        System.out.println("usually, I putting " + spoon + " spoons of sugar in my coffy");
        System.out.println("and I am " + percent + sign + " sure that I will master Java coding");
        System.out.println("Am I smart? -" + smart);
        System.out.println("Am I unconfident? -" + unconfident);
        System.out.println("Such a WEIRD story !!! ");

        // немного практики на матиматике
        short year_now = (short) (age + birth);
        System.out.println(year_now);
        double randon_staff = (double) year_now / spoon;
        System.out.println(randon_staff + " - why do I calculate this???");
        System.out.println("bye bye");


    }
}
