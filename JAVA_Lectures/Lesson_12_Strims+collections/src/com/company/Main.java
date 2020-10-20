package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(12, 32, 41, 51, 66, 25, 16, 34, 48, 42, 95)
        );
        for (Integer item : list) {
            System.out.println(item);
        }
        Integer summa = 0;
        for (Integer item2 : list) {
            summa += item2;
        }
        System.out.println(summa);

        summa = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(summa);
        list.stream().forEach(System.out::println);
        list.stream().forEach(item -> System.out.println(item));// ЭТО ОЧЕНЬ КРУТО - Ну очень item-> (ЭТО ДЛЯ КАЖДОГО ЭЛЕМЕНТА -вывести этот элемент)
        list.stream().forEach(item -> System.out.print(item + ", "));// ЭТО ОЧЕНЬ КРУТО - Ну очень item-> (ЭТО ДЛЯ КАЖДОГО ЭЛЕМЕНТА -вывести этот элемент)
        System.out.println("");
        double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println(avg);
        Integer minItem = list.stream().mapToInt(Integer::intValue).min().orElse(0);
        Integer maxItem = list.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println(minItem + " " + maxItem);
        System.out.println(minItem + maxItem);
        //создать список, который из нашего списка выбирает элементы меньше 20
        List<Integer> list2 = list.stream().filter(item -> item < 20).collect(Collectors.toList());
        System.out.println(list2);

        Student ivanov = new Student("Ivanov", 65);
        Student sofiychuk = new Student("Sofiychuk", 92);
        Student popov = new Student("Popov", 75);
        Student zajcev = new Student("Zajcev", 100);
        Student slimakov = new Student("Slimakov", 30);
        Student kiziakov = new Student("Kiziakov", 55);
        Student veres = new Student("Veres", 50);
        Student kalush = new Student("Kalush", 82);

        List<Student> students = new ArrayList<>(Arrays.asList(ivanov, sofiychuk, popov, zajcev, slimakov, kiziakov, veres, kalush));
        List<Student> studentsSortMin = students.stream().filter(student -> student.getMark() < 41).collect(Collectors.toList());
        System.out.println(studentsSortMin + "не сдали");
        List<Student> studentsNoMoney = students.stream()
                .filter(student -> student.getMark() < 70)
                .filter(student -> student.getMark() >= 50)
                .collect(Collectors.toList());
        System.out.println(studentsNoMoney + "СДАЛИ, но не получают стипендию");
        List<Student> studentsWithMoney = students.stream()
                .filter(student -> student.getMark() >= 70)
                .collect(Collectors.toList());
        System.out.println(studentsWithMoney + "Денюшка упала на карман");
        Student zadrot = students.stream().max(Comparator.comparing(Student::getMark)).orElse(null);
        System.out.println(zadrot + "КОНЧЕНЫЙ");
        // double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0);
        double averege = students.stream().mapToInt(student -> student.getMark()).average().orElse(0);
        System.out.println(averege + "всего класса");

        double averegeOfBest = students.stream().filter(student -> student.getMark() >= 90).mapToInt(student -> student.getMark()).average().orElse(0);
        System.out.println(averegeOfBest + "Среднее у атличников");
        Integer countOfBest = (int) students.stream().filter(student -> student.getMark() >= 90).mapToInt(student -> student.getMark()).count();
        System.out.println(countOfBest + "шт. скока штук отличников");

        Student bestFromWhorst = students.stream()
                .filter(student -> student.getMark() < 90)
                .max(Comparator.comparing(student -> student.getMark()))
                .orElse(null);
        System.out.println(bestFromWhorst + "нежданчик");


        //есть работники с ЗП. есть и почасовики и ставочники... сделать функционал который считает общюю ЗП

    }

}
