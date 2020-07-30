package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        Triangle t1 = new Triangle(3, 4, 6 );
        //System.out.println(t1.getPerimeter());

        System.out.println(t1.toString());

        Triangle t2 = new Triangle(3,4,Math.PI/2);
        System.out.println(t2.toString());

        Student studentAlex = new Student("Alexey","Ivanovich","Sofiychuk",true,1,"JAVA");
        System.out.println(studentAlex.toString());

        Student studentOleg = new Student("Oleg","Olegovich",
                "Olegov",true,2,"IT", LocalDate.of(2000, Month.DECEMBER,2));
        System.out.println(studentOleg.toString());

    }




}
