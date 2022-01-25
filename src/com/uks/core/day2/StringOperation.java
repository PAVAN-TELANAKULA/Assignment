package com.uks.core.day2;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringOperation {

    public static void doOperationWithRegEx() {
        int upper = 0;
        int lower = 0;
        int digit = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        String[] arr=new String[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.next();
        }
        for(int j = 0; j < size; j++)
        {
            Pattern p = Pattern.compile("\\d");
            Matcher m = p.matcher(arr[j]);
            while(m.find())
            {
                digit++;
            }
            Pattern pat = Pattern.compile("[A-Z]");
            Matcher mat = pat.matcher(arr[j]);
            while(mat.find())
            {
                upper++;
            }
            Pattern pattern = Pattern.compile("[a-z]");
            Matcher matcher = pattern.matcher(arr[j]);
            while(matcher.find())
            {
                lower++;
            }
        }
        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("Number : " + digit);

    }

    public static void reverseInput(String input) {
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        System.out.println(input1);
    }

    public static void doOperation(String input) {
        int upper = 0;
        int lower = 0;
        int digit = 0;


        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);
            if ( ch >= 'A' && ch <= 'Z' )
                upper++;
            else if ( ch >= 'a' && ch <= 'z' )
                lower++;
            else if ( ch >= '0' && ch <= '9' )
                digit++;

        }

        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("Number : " + digit);
    }
}