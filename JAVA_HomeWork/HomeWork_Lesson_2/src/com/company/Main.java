package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Громилы мыли морг");
        String nova;
        String palendrom = "Громилы мыли морг"; // palendrom.length()-1 - 0 до 16
        nova = "";
        int sentenceLength = palendrom.length()-1;
        System.out.println(sentenceLength);
        int wordLength;
        int wordLengthOp;

        char space = ' ';
        for (int i = palendrom.length()-1; i >=0 ; i--) {
            nova+=palendrom.charAt(i);

            if (palendrom.charAt(i) == space) {

                break;

            }
        }
        wordLengthOp = (palendrom.length() - nova.length());
        wordLength = sentenceLength - wordLengthOp;
        System.out.println(wordLength);

        for (int j = wordLengthOp-1; j >=0; j--) {
            nova+=palendrom.charAt(j);

        }
        System.out.println(nova);

        System.out.println("--------");



    }
}
