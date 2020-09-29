package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // тема ОТЕЛЬ

        Hostel room1 = new Hostel("1", "next to toilet",100);
        Hostel room2 = new Hostel("2", "next to exit",110);
        Hostel room3 = new Hostel("3", "next to lobby",150);
        Hostel room4 = new Hostel("4", "next to bar",155);

        SemiLux chamber1 = new SemiLux("1","flor 1",200,true);
        SemiLux chamber2 = new SemiLux("2","flor 1",200);
        SemiLux chamber3 = new SemiLux("3","flor 1",200);

        chamber3.setBarPrice(50);
        chamber3.setBreakfastPrice(100);

        List<IAccounting> list = Stream.of(
                room1,room2,room3,room4,
                chamber1,chamber2,chamber3)
                .collect(Collectors.toList());

        int income = list.stream().mapToInt(IAccounting::getTotalSum)
                .sum();
        System.out.println(income + " грн");
// полная статистика
        String minProfit = list.stream()
                .min(Comparator.comparing(item -> item.getTotalSum() ))
                .orElse(null).toString();

// статистика - ТОЛЬКО имя
        String minProfitNameOnly = list.stream()
                .min(Comparator.comparing(item -> item.getTotalSum() ))
                .orElse(null).getName();

        System.out.println(minProfit);
        System.out.println(minProfitNameOnly);

        // тоже самое но без использования ИНТЕРФЕЙСА
        //-----

        // создаем базовій класс BaseHousing  поторій определим как Абстрактній
        // и вместе с ним создаем аналогичніе semiLuxTwo & hostelTwo а так же прописіваем код внутри их


        HostelTwo room11 = new HostelTwo("1", "next to toilet",100);
        HostelTwo room22 = new HostelTwo("2", "next to exit",110);
        HostelTwo room33 = new HostelTwo("3", "next to lobby",150);
        HostelTwo room44 = new HostelTwo("4", "next to bar",155);

        SemiLuxTwo chamber11 = new SemiLuxTwo("1","flor 1",200,true);
        SemiLuxTwo chamber22 = new SemiLuxTwo("2","flor 1",200);
        SemiLuxTwo chamber33 = new SemiLuxTwo("3","flor 1",200);

        chamber3.setBarPrice(50);
        chamber3.setBreakfastPrice(100);

        List<BaseHousing> list2 = Stream.of(
                        room11,room22,room33,room44,
                chamber11,chamber22,chamber33)
                .collect(Collectors.toList());


    }
}
