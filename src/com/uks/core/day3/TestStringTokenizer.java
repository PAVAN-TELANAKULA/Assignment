package com.uks.core.day3;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestStringTokenizer
{
    public static void splitString()
    {
        Scanner sc=new Scanner(System.in);
        String st = sc.next();

        StringTokenizer stringTokenizer = new StringTokenizer(st,",");
        while(stringTokenizer.hasMoreTokens())
        {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
