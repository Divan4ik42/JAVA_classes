package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Item item = new Item("1","one","pensil");
        System.out.println(item.toString());
        System.out.println(item.toXML());
        System.out.println(item.toJSON());


        int myAge = 20;
        String permition0;

        if (myAge > 18){
            permition0 = "Adult";
        }
        else permition0 = "Kid";
        System.out.println(permition0);


        String premition = (myAge > 18) ? "Adult" :"Kid";
        System.out.println(premition);

        //(myAge > 18) ? System.out.println("Adult") : System.out.println("Kid");


    }
}
