package com.company;

public class Main {

    public static void main(String[] args) {
        String regx = "[^A-Za-z' \\-]";// все кроме!!! ^ - первая часть кода

        String harryPotter = "Mr. and Mrs. Dursley, of number four, Privet Drive, were proud to say that they were perfectly normal, thank you very much. They were the last people you'd expect to be involved in anything strange or mysterious, because they just didn't hold with such nonsense. \n" +
                "\n" +
                "Mr. Dursley was the director of a firm called Grunnings, which made drills. He was a big, beefy man with hardly any neck, although he did have a very large mustache. Mrs. Dursley was thin and blonde and had nearly twice the usual amount of neck, which came in very useful as she spent so much of her time craning over garden fences, spying on the neighbors. The Dursleys had a small son called Dudley and in their opinion there was no finer boy anywhere. \n" +
                "\n" +
                "The Dursleys had everything they wanted, but they also had a secret, and their greatest fear was that somebody would discover it. They didn't think they could bear it if anyone found out about the Potters. Mrs. Potter was Mrs. Dursley's sister, but they hadn't met for several years; in fact, Mrs. Dursley pretended she didn't have a sister, because her sister and her good-for-nothing husband were as unDursleyish as it was possible to be. The Dursleys shuddered to think what the neighbors would say if the Potters arrived in the street. The Dursleys knew that the Potters had a small son, too, but they had never even seen him. This boy was another good reason for keeping the Potters away; they didn't want Dudley mixing with a child like that. \n" +
                "\n" +
                "When Mr. and Mrs. Dursley woke up on the dull, gray Tuesday our story starts, there was nothing about the cloudy sky outside to suggest that strange and mysterious things would soon be happening all over the country. Mr. Dursley hummed as he picked out his most boring tie for work, and Mrs. Dursley gossiped away happily as she wrestled a screaming Dudley into his high chair. \n" +
                "\n" +
                "None of them noticed a large, tawny owl flutter past the window.";

       /* harryPotter = harryPotter.replaceAll("\n","");
        harryPotter = harryPotter.replaceAll(",","");
        harryPotter = harryPotter.replaceAll("\\.","");
        harryPotter = harryPotter.replaceAll(";","");
        harryPotter = harryPotter.replaceAll(":","");*/
        harryPotter = harryPotter.replaceAll(regx,"");// ВТОРАЯ ЧАСТЬ КОда вместо всего что выше
        /*harryPotter = harryPotter.toLowerCase();// lower case*/

        String[] words = harryPotter.split(" "); //  ДОРАБОТАНО!!! сравнить с хоум ворк лессон 3

        for (int i = 0; i <words.length; i++) {

            if (words[i].length() >=0)

                System.out.println (i + ". " + words[i]);
        }
    }
}