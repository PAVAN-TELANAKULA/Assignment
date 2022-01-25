package com.uks.core.day3;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAdd {
    public static void main(String[] args){
       addDate();
    }

    public static void addDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add Date: ");
        String date=sc.next();
        System.out.println("Enter Date,Month or Year: ");
        String  type = sc.next();
        System.out.println("Add Number to Increase: ");
        int n = sc.nextInt();

        if(type.equals("date")) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate d1 = LocalDate.parse(date, formatter);

            LocalDate newDate = d1.plusDays(n);
            System.out.print(newDate);
        }

        if(type.equals("month")) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate d1 = LocalDate.parse(date, formatter);

            LocalDate newDate = d1.plusMonths(n);
            System.out.print(newDate);
        }
        if(type.equals("year")) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate d1 = LocalDate.parse(date, formatter);

            LocalDate newDate = d1.plusYears(n);
            System.out.print(formatter.format(newDate));
        }
    }
}
