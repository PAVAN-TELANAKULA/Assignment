package com.uks.core.day1;
import java.util.Scanner;
public class MultiCommandLine
{
    public static void doOperation(int a)
    {
        double sum = 0;
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        String[] arr=new String[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.next();
        }

        for(int i=0;i<size;i++)
        {
            if(a == 1)
            {
                try
                {
                    if(arr[i].contains("d"))
                    {
                        double number = Double.parseDouble(arr[i]);
                        sum = sum+ number;
                    }
                    else if(arr[i].contains("f"))
                    {
                        float number = Float.parseFloat(arr[i]);
                        sum = sum + number;
                    }
                    else if(arr[i].length() >= 7)
                    {
                        long number = Long.parseLong(arr[i]);
                        sum = sum + number;
                    }
                    else
                    {
                        int number = Integer.parseInt(arr[i]);
                        sum = sum + number;
                    }

                }
                catch (NumberFormatException e)
                {
                    counter++;
                }
            }

            if(a == 2){

                System.out.println(arr[i].toLowerCase());
            }
        }
        if(a == 1)
        {
            System.out.println("Sum: " + sum);
        }
    }
}