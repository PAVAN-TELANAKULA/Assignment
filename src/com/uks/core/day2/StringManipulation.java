package com.uks.core.day2;

import java.util.Scanner;

public class StringManipulation extends StringOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        switch (size) {
            case 1: {
                System.out.println("reverse input : ");
                reverseInput(args[0]);
                break;
            }
            case 2: {
                System.out.println("count");
                doOperation(args[0]);
                break;
            }

            case 3:{
                System.out.println("count with regex");
                doOperationWithRegEx();
                break;
            }
            default:System.out.print("enter valid ips");
        }

    }
}