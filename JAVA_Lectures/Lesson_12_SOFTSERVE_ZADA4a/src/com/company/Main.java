package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        EmployeeFullTime ivano = new EmployeeFullTime("Ivanov", 1277.3);
        EmployeeFullTime petrov = new EmployeeFullTime("Petrov", 1923.3);
        EmployeeFullTime denisov = new EmployeeFullTime("Denisov", 5277.3);

        List<EmployeeFullTime> fullTimeList = Stream.of(petrov, ivano, denisov)
                .collect(Collectors.toList());

        double fullSalary = fullTimeList.stream().mapToDouble(item -> item.getSalary()).sum();
        System.out.println(fullSalary + " Вся зарплата этих бичей");

        EmployeePartTime devOps = new EmployeePartTime("devOps", 12, 32);
        EmployeePartTime backEndDev = new EmployeePartTime("backEndDev", 35, 176);
        EmployeePartTime frontEndDev = new EmployeePartTime("frontEndDev", 25, 85);
        EmployeePartTime designer = new EmployeePartTime("designer", 50, 30);
        EmployeePartTime tester = new EmployeePartTime("tester", 20, 176);

        List<EmployeePartTime> partTimeList = Stream.of(devOps, backEndDev, frontEndDev, designer, tester)
                .collect(Collectors.toList());
//-------------------------------
        // not smart way to solve task
        double partTimeTotalSalary = 0;
        for (EmployeePartTime item : partTimeList) {
            partTimeTotalSalary += item.getHours() * item.getRate();

        }
        System.out.println("------------------");
        System.out.println(partTimeTotalSalary + " salary of part time employees");
        System.out.println("------------------");

        double total = partTimeTotalSalary + fullSalary;
        System.out.println(total + "total per mounth");
        //-------------------------------
        //  halfSMART way to solve task
        System.out.println("----------------------------");
        System.out.println("Smart way - POLYMORPH");
        //sozdat interfeys

        // one more LIST
        //ivano,petrov,denisov,
        //                devOps,designer,backEndDev,frontEndDev,tester
        List<IAccounting> totalList = new ArrayList<>(
                Arrays.asList(ivano, petrov, denisov,
                        devOps, designer, backEndDev, frontEndDev, tester)
        );
//        totalList.add(ivano);
//        totalList.add(petrov);
//        totalList.add(denisov);
//        totalList.add(designer);
//        totalList.add(devOps);
//        totalList.add(backEndDev);
//        totalList.add(frontEndDev);
//        totalList.add(tester);

        double totalSalary = totalList.stream()
                .mapToDouble(item -> item.getMonthSalary()).sum();
        System.out.println(totalSalary + " total per mounth");

        IAccounting patheticLoser = totalList.stream()
                .min(Comparator.comparing(IAccounting::getMonthSalary))
                .orElse(null);

        IAccounting geek = totalList.stream()
                .max(Comparator.comparing(IAccounting::getMonthSalary))
                .orElse(null);

        System.out.println(patheticLoser + " neyda4nik");
        System.out.println(geek + " Zadrot");


    }
}
