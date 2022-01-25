package com.uks.core.day3;
import java.util.*;
import java.text.DecimalFormat;
import java.util.Scanner;
public class FormattedNumber
{
    void ChangeFormatNumber( )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Format of your number: ");
        String format = sc.nextLine();

        System.out.println("Enter number your number:");
        double number = sc.nextDouble();
        customFormat(format,number);

    }
    public void customFormat(String format, double number )
    {
        DecimalFormat f = new DecimalFormat(format);
        String output = f.format(number);
        System.out.println("Formatted Number is :" + output);

    }

    public static void main(String args[])
    {
        FormattedNumber obj=new FormattedNumber();
        obj.ChangeFormatNumber();
    }
}
