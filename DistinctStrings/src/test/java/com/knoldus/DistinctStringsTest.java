package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;



class DistinctStringsTest {
    @Test
    public void uniqueStringTest(){
        GetDistinctStringsImpl obj = new GetDistinctStringsImpl();
        List<String> Uniqueset = obj.get.distinctStrings(new ArrayList<>(Arrays.asList("java","java","c")));
        List<String> strList= new ArrayList<>();
        strList.add("c");
        strList.add("java");

        Assertions.assertEquals(strList,Uniqueset);
    }
    @Test
    public void similarStringTest() {
        GetDistinctStringsImpl obj = new GetDistinctStringsImpl();
        List<String> Uniqueset = obj.get.distinctStrings(new ArrayList<>(Arrays.asList("java", "java", "c")));
        List<String> strList = new ArrayList<>();
        strList.add("c");
        strList.add("c");
        Assertions.assertNotEquals(strList, Uniqueset);

    }




    @Test
    public void checkForNull() {
        GetDistinctStringsImpl obj = new GetDistinctStringsImpl();
        Assertions.assertThrows(NullPointerException.class, () -> obj.get.distinctStrings(new ArrayList<>(Arrays.asList(null))));



    }

}