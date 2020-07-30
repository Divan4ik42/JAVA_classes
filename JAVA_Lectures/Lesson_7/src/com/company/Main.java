package com.company;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        Triangle t1 = new Triangle(3, 4, 6 );
        //System.out.println(t1.getPerimeter());

        System.out.println(t1.toString());

        Triangle t2 = new Triangle(3,4,Math.PI/2);
        System.out.println(t2.toString());

        Student studentAlex = new Student("Alexey","Ivanovich",
                "Sofiychuk",true,1,"JAVA",LocalDate.of(1986,Month.JUNE,19));
        System.out.println(studentAlex.toString());

        Student studentOleg = new Student("Oleg","Olegovich",
                "Olegov",true,2,"IT", LocalDate.of(2000, Month.DECEMBER,2));
        System.out.println(studentOleg.toString());
        //----------------------------------------------------------------------------------------------------

        LocalDate may1st = LocalDate.of(2020, Month.MAY,1);
        System.out.println(may1st.getDayOfWeek());
        System.out.println(may1st.getDayOfYear());
        //когда день програмиста 256

        LocalDate newYear = LocalDate.of(2020, Month.JANUARY, 1);
        LocalDate programmerDay = newYear.plusDays(255);
        System.out.println(programmerDay);
        System.out.println(programmerDay.getDayOfWeek());

        System.out.println(LocalDate.now());
        System.out.println(ChronoUnit.DAYS.between(programmerDay, LocalDate.now())); // !!

        LocalDate myBirthDay = LocalDate.of(1986,Month.JUNE,19);

        int myYears = (int) (ChronoUnit.YEARS.between(myBirthDay,LocalDate.now())); // LONG  тип
        System.out.println(myYears);

        System.out.println(ChronoUnit.DAYS.between(myBirthDay, LocalDate.now() ));


    }




}
