package com.uks.core.day3;
import javax.swing.text.DateFormatter;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class DateAndTime {
    public static void main(String[] args) throws ParseException {

        DateAndTime.printDateAndTime();
    }

    public static void printDateAndTime() throws ParseException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date Format: ");
        String dateFormat = sc.next();

        System.out.println("You wanna add date ? Y or N ?");
        String yn = sc.next();

        if(yn.equals("Y")) {

            System.out.println("Enter Date: ");
            String ipdate = sc.next();


            SimpleDateFormat dateform = new SimpleDateFormat("yyyy/MM/dd");
            Date d1 = dateform.parse(ipdate);

            SimpleDateFormat dtf = new SimpleDateFormat(dateFormat);
            System.out.println(dtf.format(d1));
        }
        if(yn.equals("N")){
            Date d1 = new Date();
            SimpleDateFormat dtf = new SimpleDateFormat(dateFormat);
            System.out.println(dtf.format(d1));
        }
    }
}