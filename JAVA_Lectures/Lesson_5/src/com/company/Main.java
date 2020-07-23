package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        // загружаем файл в строку
        String text = new String(Files.readAllBytes(Paths.get("C:/Users/Java01/Documents/divan/GITHUB/JAVA_Lectures/Lesson_5/Harry Potter and the Sorcerer.txt")));
        System.out.println(text);
    }
}

       