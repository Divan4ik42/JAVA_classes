package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Complex customer1 = new Complex("Victor", "econom", 120);
        Complex customer2 = new Complex("Ivan", "elite", 300);
        Complex customer3 = new Complex("Maria", "econom", 120);
        Complex customer4 = new Complex("Lena", "standart", 245);

        List<Complex> complexCustomerList = Stream.of(customer1, customer2, customer3, customer4).collect(Collectors.toList());
        System.out.println(complexCustomerList);
        double complexTotal = complexCustomerList.stream().mapToInt(item -> (int) item.getDinnerTotalCheck()).sum();
        System.out.println(complexTotal + "грн. выручка за завтрак и обед (комплексные обеды)");
        //-------

        CustomOrder customer5 = new CustomOrder("Alexey", 0.12, 0.23, 0.15, 1, 0, 0.5);
        CustomOrder customer6 = new CustomOrder("Kate", 0.2, 0, 0.25, 0, 1, 0);
        CustomOrder customer7 = new CustomOrder("Lusia", 0.13, 0, 0.11, 1, 0, 0);
        CustomOrder customer8 = new CustomOrder("Ira", 0, 0.31, 0.11, 1, 0, 0.3);
        List<CustomOrder> customOrderCustomerList = Stream.of(customer5, customer6, customer7, customer8).collect(Collectors.toList());
        System.out.println(customOrderCustomerList);
        double totalForCustomOrders = 0;
        for (CustomOrder item : customOrderCustomerList) {
            totalForCustomOrders += item.getDinnerTotalCheck();
        }
        System.out.println(totalForCustomOrders + "грн. выручка за ужин");
        double subTotal = totalForCustomOrders + complexTotal;
        System.out.println(subTotal + "грн. выручка за день");

        double smartCustomersTotal = customOrderCustomerList.stream().mapToDouble(item -> item.getDinnerTotalCheck()).sum();
        System.out.println(smartCustomersTotal + "грн. выручка за ужин");

        IDinnerPayCheck cheapOne = customOrderCustomerList.stream().min(Comparator.comparing(IDinnerPayCheck::getDinnerTotalCheck)).orElse(null);
        IDinnerPayCheck major = customOrderCustomerList.stream().max(Comparator.comparing(IDinnerPayCheck::getDinnerTotalCheck)).orElse(null);

        System.out.println(cheapOne + " дешовка");
        System.out.println(major + " МАЖОР");


    }

}
