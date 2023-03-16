package com.driver;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String args[]) {
        RWOnly obj = new RWOnly();

        obj.setName("Tushar");

        String ans = obj.getName();

        System.out.println(ans);
    }

}