package com.company;

public class Main {

    public static void main(String[] args) {
        String palendrom = "Гори, печурка, круче пирог";
        System.out.println(palendrom);
        System.out.println("-------------");
        String buffer = palendrom.toLowerCase(); //все переводим в нижний регистр
        buffer = buffer.replaceAll(" ",""); // замена символа ПРОБЕЛ меняем на пустой символ
        buffer = buffer.replaceAll(",","");
        System.out.println(buffer);
        String backward = ""; // пустая строка специально задана


        //int i = buffer.length()-1 - Єтот оператор начинает с последнего єлемегнта буфера
        //i >=0   - до нулевого єлемента включительно
        // i--    - С каждім шагом уменшая "і"  на единичку

        for (int i = buffer.length()-1; i >=0; i--) {

            backward+=buffer.charAt(i); // в каждом циклк прилепляем букву в плоть до нулевого

        }
        System.out.println(backward);
        boolean result = backward.equals(buffer);
        System.out.println(result);

        int [] array = new int[5];// мі задали массив из 5 єлементов
        // присваиваем значения
        /*array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;*/
        array[0] = 10;
        array[1] = 2;
        array[2] = 3;
        array[3] = 40;
        array[4] = 50;
        // теперь массив віводим в консоль
        for (int i = 0; i < array.length; i++) { //также может біть i < 5
            if (array[i] >= 10){
                System.out.println(array[i]);// условие что віводит результат что больше 10
            }

        }







    }
}

