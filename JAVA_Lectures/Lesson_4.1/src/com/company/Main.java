package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        //String regx = "[^A-Za-z' \\-]";// все кроме!!! ^ - первая часть кода
        String harryPotter = new String(Files.readAllBytes(Paths.get("C:/Users/Java01/Documents/divan/GITHUB/JAVA_Lectures/Lesson_4.1/Harry Potter and the Sorcerer.txt")));

        String first200 = harryPotter.substring(0, 200);
        /*System.out.println(first200);*/
        /*String textGarbegeFree = harryPotter.replaceAll(regx,"");*/
        String textGarbegeFree = harryPotter.replaceAll("[^A-Za-z'\\- ]", "");

        //System.out.println();
        first200 = textGarbegeFree.substring(0, 200);
        //System.out.println(first200);
        String[] wordsArray = textGarbegeFree.split(" ");

        System.out.println(wordsArray.length);////// выводит количество СЛОВ


        for (int i = 0; i < wordsArray.length; i++) {
            /*System.out.print(wordsArray[i].length()+ " ");*/


                                                    //певвая буква в слове "а"
            if ( (wordsArray[i].length() >= 3) && (wordsArray[i].charAt(0) == 'a' ) ) { // код определяет условие что 3 символа и начинается на "а"(а есло а .charAt() поставить 3 - то это будет условие 3 буквы в слове

                System.out.print(i + ". ");
                System.out.println(wordsArray[i]);


            }       //  слово под [i] такимтом номером


        }


        /* *//* harryPotter = harryPotter.replaceAll("\n","");
        harryPotter = harryPotter.replaceAll(",","");
        harryPotter = harryPotter.replaceAll("\\.","");
        harryPotter = harryPotter.replaceAll(";","");
        harryPotter = harryPotter.replaceAll(":","");*//*
        harryPotter = harryPotter.replaceAll(regx,"");// ВТОРАЯ ЧАСТЬ КОда вместо всего что выше
        *//*harryPotter = harryPotter.toLowerCase();// lower case*//*

        String[] words = harryPotter.split(" "); //  ДОРАБОТАНО!!! сравнить с хоум ворк лессон 3

        for (int i = 0; i <words.length; i++) {

            if (words[i].length() >=0)

                System.out.println (i + ". " + words[i]);*/
    }
}


