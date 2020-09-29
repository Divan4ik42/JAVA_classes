package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException{

        String harryPotter = new String(Files.readAllBytes(Paths.get("/Users/divan4ik42/Storage/-WORK SPACE- Java/JAVA_OFFline/JAVA_Lectures/Lesson_5/Harry Potter and the Sorcerer.txt")));

        System.out.println(harryPotter.length());
        harryPotter = harryPotter.replaceAll("[^A-Za-z ]","");
        harryPotter = harryPotter.toLowerCase();
        System.out.println(harryPotter.substring(0,234)); // СИМВОЛЫ substring

        final String[] array = harryPotter.split(" ");
        List<String> words = Arrays.asList(array);
        System.out.println(words.size());
        //разобрать СТРИМЫ
        List<String> distinct = words.stream().distinct().collect(Collectors.toList());//вывод УНИКАЛЬНЫХ слов
        System.out.println(distinct.size());
        //вывести первую сотню
        System.out.println(distinct.subList(0, 100)); // СЛОВА  sublist
        //сортируем по алфавиту
        List<String> sorted = distinct.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted.subList(0,1000));

        // STREAM !!!!!!
    }
}


