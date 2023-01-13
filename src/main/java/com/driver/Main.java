package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        RWOnly r = new RWOnly();
//        r.random = 0;
//        System.out.println(r.random);
//        'random' has private access in 'com.driver.RWOnly'
        r.setter(80);
        System.out.println(r.getter());


    }
}