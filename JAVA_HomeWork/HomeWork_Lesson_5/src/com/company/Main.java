package com.company;

import sun.text.normalizer.UCharacter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

// домашка манипуляции ч текстом
public class Main {

    public static void main(String[] args) throws IOException {

        String mainText = new String(Files.readAllBytes(Paths.get("/Users/divan4ik42/Storage/-WORK SPACE- Java/JAVA_OFFline/JAVA_HomeWork/HomeWork_Lesson_5/Harry Potter and the Sorcerer.txt")));

        //System.out.println(mainText);//  вывод всего текста
        System.out.println(mainText.substring(0, 200)); //вывод только 200 символов

        System.out.println("-----------------");

        //  чистим от мусора
        mainText = mainText.replaceAll("[^A-Za-z ]", "");
        /* mainText = mainText.toLowerCase();*/   //  перевод текста в нижний регистр
        System.out.println(mainText);
        System.out.println("---------------");

        String[] words = mainText.toLowerCase().split(" ");  // разделили все символы по ПРАБЕЛУ - " " - и назвали эти кучки симвалов СЛОВАМИ words АТАЖЕ В ЛОВЕРКЕЙС

        // -------------------------------------------------------------------------------------------------------------------------------------------------------------

        for (int i = 0; i < 10; i++) {
            System.out.print(i + 1 + ". "); //i+1 начинает текст не с 0, а с 1
            System.out.println(words[i]);
        } // пробую вывести первые 10 слов
        System.out.println("----------------------");

        // -------------------------------------------------------------------------------------------------------------------------------------------------------------

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0 && Character.isUpperCase(words[i].charAt(0))) {
                // words[i].length() > 0 - ПРОВЕРЯЕТСЯ ПЕРВЫМ (чтоб избежать ошибки когда слово начинается с пробела
                // потом проверяется Character.isUpperCase(words[i].charAt(0) - и говорит что 0-й символ (ПЕРВАЯ БУКВА) - должна быть большой
                // символ && задает условие обязательного выполнения обоих пунктов
                System.out.print(i + 1 + ". "); //i+1 начинает текст не с 0, а с 1
                System.out.println(words[i]);

            }
        } //вывожу только слова с большой буквы
        System.out.println("----------------------");

        // -------------------------------------------------------------------------------------------------------------------------------------------------------------

        String unicWords = "";
        for (int i = 0; i < words.length; i++) {
            if (!unicWords.contains(words[i])) {
                unicWords += " " + words[i];
            }

        } // создаю масив из ДИСТИНКТОВ только уникальных слов

        String[] distinct = unicWords.split(" "); // разделяем только что созданый массив по ПРАБЕЛУ
        System.out.println(distinct.length); // выводим количество УНИКАЛЬНЫХ СЛОВ В ТЕКСТЕ
        System.out.println(words.length); // колличество ВСЕХ СЛОВ
        System.out.println("----------------------");

        // -------------------------------------------------------------------------------------------------------------------------------------------------------------

        Arrays.sort(distinct);
        for (int i = 0; i < 20; i++) {
            if (distinct[i].length() > 0) {

            }
            System.out.println(i + 1 + ". " + distinct[i]);

        } // создал МАССИВ аз слов по алфавиту
        System.out.println("----------------------");


        // -------------------------------------------------------------------------------------------------------------------------------------------------------------
/*

        Arrays.sort(distinct, Comparator.reverseOrder());
        for (int i = 0; i < 20; i++) {
            if (distinct[i].length() > 0) {

            }
            System.out.println(i + 1 + ". " + distinct[i]);

        } // создал МАССИВ аз слов по алфавиту В ОЮРАТНОМ ПОРЯДКЕ
        System.out.println("----------------------");
*/


        // -------------------------------------------------------------------------------------------------------------------------------------------------------------

        int counter = 0; //стартовый показатель счетчика
        String wordToFind = words[0];

        for (int i = 0; i < words.length; i++) {

            if ((words[i].toLowerCase().equals(wordToFind))) { //ОЗНАЧАЕТ - если слово переведенное в ЛОВЕРКЕЙС будет равно wordToFind = "the"
                counter++; //счетчик увеличивается на 1 (командой ++)
            }
        } //Создаю счетчик который будет считать сколько раз слово встречается в тексте
        System.out.println("Слово: (" + wordToFind + ") встречается в тексте " + counter + " раз ! ! ! ");


        System.out.println("----------------------");

        // -------------------------------------------------------------------------------------------------------------------------------------------------------------

        //Домашнее задание - Вывести на экран сколько раз каждое слово встречается в тексте

        Map<String, Integer> counta = new HashMap<>();
        for (String unWord : words){
            if(!unWord.isEmpty()){
                Integer count = counta.get(unWord);
                if(count == null) {
                    count = 0;
                }
                counta.put(unWord, ++count);
            }
        }
        for (String unWord : counta.keySet()) {
            System.out.println(unWord + ": " + counta.get(unWord));
        }
    }
}




