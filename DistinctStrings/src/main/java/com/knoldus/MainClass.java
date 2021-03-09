package com.knoldus;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        GetDistinctStringsImpl obj = new GetDistinctStringsImpl();

        System.out.println(obj.get.distinctStrings(new ArrayList<>(Arrays.asList("java","java","c"))));
        System.out.println(obj.get.distinctStrings(new ArrayList<>(Arrays.asList("sam","sam","c"))));

    }
}
