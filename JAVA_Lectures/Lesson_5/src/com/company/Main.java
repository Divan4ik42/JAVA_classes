package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        // загружаем файл в строку
        String text = new String(Files.readAllBytes(Paths.get("/Users/divan4ik42/Storage/-WORK SPACE- Java/JAVA_OFFline/JAVA_Lectures/Lesson_5/Harry Potter and the Sorcerer.txt")));
        //Выведем первые 200 символов !!!
        System.out.println(text.substring(0, 200));

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        //Чистим от муссора !!
        text = text.replaceAll("[^A-Za-z ]", "");
        System.out.println(text);

        // Переводим все слова текста переводим в МАСИВ!!!/////"var" переменная !!!!
        String[] words = text.split(" ");

        for (int i = 0; i <= 20; i++) {

            System.out.println(i + ". " + words[i]);

        }
        for (int i = 0; i < words.length; i++) {
            /*char first = (Character) words[i].charAt(0);*/
            if (words[i].length() > 0 && Character.isUpperCase(words[i].charAt(0))) {

                System.out.println(i + ". " + words[i]);
            }
        }
        //Создаем строну из Distinct-ов это уникальные слова которые не повторяються
        String distinctString = "";
        for (int i = 0; i < words.length; i++) {

            if (!distinctString.contains(words[i])) {

                distinctString += " " + words[i];
            }
        }
        System.out.println(distinctString.substring(0, 200));

        String[] distincts = distinctString.split(" ");
        System.out.println(distincts.length);
        System.out.println(words.length);
        System.out.println("-----------------------------");

        //Розмещаем их в алфавитном порядке !!

        Arrays.sort(distincts); //атсортировать массив
        for (int i = 0; i <20 ; i++) {
            System.out.print(i + ". ");
            System.out.println(distincts[i]);
        }
        System.out.println("--------------------");
        // сколько слово THE встречается в тексте
        // alt + ENTER
        //создаем счетчик
        int counter = 0;

        String wordToFind = "the";

        for (int i = 0; i <words.length ; i++) {
            /*if (words[i].equals("the") || words[i].equals("The") ||words[i].equals("THE") ){*/

            //if (words[i].toUpperCase().equals("THE")){ - OR
            if (words[i].toLowerCase().equals(wordToFind)){
                counter++;
            }


        }
        System.out.println("слово (" + wordToFind + ") встречается в тексте " +counter + " раз");
        /*System.out.println( "єто слово вілазе " + counter + " разів");*/
    }



}


