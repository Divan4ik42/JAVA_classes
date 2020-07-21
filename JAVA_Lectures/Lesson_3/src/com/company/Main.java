package com.company;

public class Main {

    public static void main(String[] args) {
        String harryPotter = "Mr. and Mrs. Dursley, of number four, Privet Drive, " +
                "" +
                "were proud to say that they were perfectly normal, \n" +
                "\n" +
                "thank you very much. They were the last people you’d \n" +
                "\n" +
                "expect to be involved in anything strange or \n" +
                "\n" +
                "mysterious, because they just didn’t hold with such \n" +
                "\n" +
                "nonsense. \n" +
                "\n" +
                "\n" +
                "\n" +
                "Mr. Dursley was the director of a firm called \n" +
                "\n" +
                "Grunnings, which made drills. He was a big, beefy \n" +
                "\n" +
                "man with hardly any neck, although he did have a \n" +
                "\n" +
                "very large mustache. Mrs. Dursley was thin and \n" +
                "\n" +
                "blonde and had nearly twice the usual amount of \n" +
                "\n" +
                "neck, which came in very useful as she spent so \n" +
                "\n" +
                "much of her time craning over garden fences, spying \n" +
                "\n" +
                "on the neighbors. The Dursley s had a small son \n" +
                "\n" +
                "called Dudley and in their opinion there was no finer \n" +
                "\n" +
                "boy anywhere. \n" +
                "\n" +
                "\n" +
                "\n" +
                "The Dursleys had everything they wanted, but they \n" +
                "\n" +
                "also had a secret, and their greatest fear was that \n" +
                "\n" +
                "somebody would discover it. They didn’t think they \n" +
                "\n" +
                "could bear it if anyone found out about the Potters. \n" +
                "\n" +
                "Mrs. Potter was Mrs. Dursley’s sister, but they hadn’t \n" +
                "\n" +
                "\n" +
                "\n" +
                "Page | 2 Harry Potter and the Philosophers Stone - J.K. Rowling \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "met for several years; in fact, Mrs. Dursley pretended \n" +
                "\n" +
                "she didn’t have a sister, because her sister and her \n" +
                "\n" +
                "good-for-nothing husband were as unDursleyish as it \n" +
                "\n" +
                "was possible to be. The Dursleys shuddered to think \n" +
                "\n" +
                "what the neighbors would say if the Potters arrived in \n" +
                "\n" +
                "the street. The Dursleys knew that the Potters had a \n" +
                "\n" +
                "small son, too, but they had never even seen him. \n" +
                "\n" +
                "\n" +
                "\n" +
                "This boy was another good reason for keeping the \n" +
                "\n" +
                "Potters away; they didn’t want Dudley mixing with a \n" +
                "\n" +
                "child like that. \n" +
                "\n" +
                "\n" +
                "\n" +
                "When Mr. and Mrs. Dursley woke up on the dull, gray \n" +
                "\n" +
                "Tuesday our story starts, there was nothing about the \n" +
                "\n" +
                "cloudy sky outside to suggest that strange and \n" +
                "\n" +
                "mysterious things would soon be happening all over \n" +
                "\n" +
                "the country. Mr. Dursley hummed as he picked out \n" +
                "\n" +
                "his most boring tie for work, and Mrs. Dursley \n" +
                "\n" +
                "gossiped away happily as she wrestled a screaming \n" +
                "\n" +
                "Dudley into his high chair. \n" +
                "\n" +
                "\n" +
                "\n" +
                "None of them noticed a large, tawny owl flutter past \n" +
                "\n" +
                "the window.";
        harryPotter = harryPotter.replaceAll("," , "");
        harryPotter = harryPotter.replaceAll("\n" , "");
        harryPotter = harryPotter.replaceAll("\\." , ""); // regex "\\." - єто как точку написать как символ а не как команду

        String[] word = harryPotter.split(" ");

        for (int i = 0; i < 100; i++) {

            if (word[i].length()<=20) {
                System.out.println( i + ". " + word[i]);
            }


        }

    }
}
