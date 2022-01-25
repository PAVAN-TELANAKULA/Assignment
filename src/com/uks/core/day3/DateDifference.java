package com.uks.core.day3;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateDifference {
    public static void main(String[] args) {
        dateDifference();
    }
        public static void dateDifference () throws DateTimeParseException {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1st Date : ");
            String Date1 = sc.next();
            System.out.println("Enter 2nd Date : ");
            String Date2 = sc.next();

            LocalDate d1 = LocalDate.parse(Date1, formatter);
            LocalDate d2 = LocalDate.parse(Date2, formatter);

            long Diff = ChronoUnit.DAYS.between(d1, d2);

            if (Diff > 0) {
                System.out.print(Diff);
            } else {
                System.out.print(Diff * -1);
            }
        }
    }

