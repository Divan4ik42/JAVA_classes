package com.company;

public class Main {

    public static void main(String[] args) {
//        byte myAge = 34;
//        short myYearOfBirth = 1986;
//        int expectedSalary = 38000;
//        long sky = 19378685465364L;
//        float donutWeight = 120.29f;
//        double devisionResult = 0.11111111111111;
//        boolean amIadult = true;
//        char  dollar = '$';
//
//        System.out.println("мне " + myAge + " года");
//        System.out.println("мой год рождения - " + myYearOfBirth);
//        System.out.println("Ожидаемая ЗП - " + expectedSalary + " долларов");
//        System.out.println("более - " + sky + " планет в небе");
//        System.out.println("вес пончика - " + donutWeight + " грамм");
//        System.out.println("3/27 = " + devisionResult );
//        System.out.println("совершеннолетие " + amIadult );
//        System.out.println("символ доллара - " + dollar );
        //___________________________
        // Palindrome
        String palindrom = "Не видно морд, ни лап. А палиндром – он дивен";
        palindrom = palindrom.toLowerCase().replaceAll("[^а-яa-z]","");
        System.out.println(palindrom);
        String reversed = "";

        for (int i =  palindrom.length()-1; i >= 0; i--) {
            reversed += palindrom.charAt(i);
        }
        System.out.println(reversed);

        System.out.println(palindrom.equals(reversed));


    }
}
