package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        //  Path
        String text = new String(Files.readAllBytes(Paths.get("/Users/divan4ik42/Storage/-WORK SPACE- Java/JAVA_OFFline/JAVA_HomeWork/HomeWork_Lesson_5/Harry Potter and the Sorcerer.txt")));

        //System.out.println(text.substring(0, 200));
       // System.out.println(text.length());// с мусором

        //text = text.toLowerCase();
        text = text.toLowerCase().replaceAll("[^a-z ]", " ");
        //System.out.println(text);
//-------------
        String[] wordsArray = text.split(" +");//" +" - один ИЛИ больше пробелов
        for (int i = 0; i < wordsArray.length; i++) {
            //System.out.println(wordsArray[i]);

            // ЗАДЕЙСТВУЕМ  MAP
        }
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < wordsArray.length; i++) {
                if (map.containsKey(wordsArray[i])) {
                    Integer value = map.get(wordsArray[i]);
                    map.put(wordsArray[i], value + 1);
                    //System.out.println(map.get(wordsArray[i]));
                }
                else {

                    map.put(wordsArray[i], 1);
                }
            }
            map.entrySet().stream().forEach(item -> {
                if (item.getValue() >1000)

                System.out.println(item.getKey() + " - " + item.getValue());

            });
        }


    }

