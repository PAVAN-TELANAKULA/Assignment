package com.uks.core.day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyChecker
{
    public static void checker()
    {
        String str;
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        System.out.println("Enter names for array");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.next();
        }
        Map<String, Integer> hashMap = new HashMap<>();
        String[] words = arr;
        for (String word : words)
        {
            if (hashMap.containsKey(word))
            {
                hashMap.put(word, hashMap.get(word) + 1);
            } else
            {
                hashMap.put(word, 1);
            }
        }
        System.out.println(hashMap);
    }
}
