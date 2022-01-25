package com.uks.core.day1;

import java.util.Scanner;
public class TestAccessMod {
    AccessMod accessMod = new AccessMod();

    public void print() {
        accessMod.printProperties();
    }
    public static void main(String[] args){
        TestAccessMod testAccessMod = new TestAccessMod();
        testAccessMod.print();
    }

}
