package com.uks.core.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class RowPrinter {


    public static void readFile(String filePath) throws IOException {

        String row = "";
        String splitBy = ",";

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        List<GeneralEmployee> list=new ArrayList<>();


        while ((row = br.readLine()) != null) {


            String[] employee = row.split(splitBy);

            GeneralEmployee baseEmployee1 = new GeneralEmployee(employee[0],
                    employee[1], employee[2], employee[3], employee[4]);
            list.add(baseEmployee1);

        }

        int c = 1;
        for (GeneralEmployee e : list) {
            System.out.println("\nEmployee[" + c + "] : " + e.empCode
                    + "\nName : " + e.fName + " " + e.lName +
                    "\nEmployee type: " + e.empType +
                    "\nSalary: " + e.basicSal + "\n");
            c++;

        }
    }


    public static void tableFormat() throws IOException {

        String row="",splitby=",",filePath="/home/brilworks-20/my1.csv";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        List<GeneralEmployee> list=new ArrayList<>();

        Formatter fmt = new Formatter();
        fmt.format("%1s %14s %15s %15s %15s\n", "empcode", "fname", "lname", "emptype", "basicsal");

        while ((row = br.readLine()) != null) {
            String[] employee = row.split(splitby);
            GeneralEmployee baseEmployee1 = new GeneralEmployee(employee[0], employee[1],
                    employee[2], employee[3], employee[4]);

            list.add(baseEmployee1);

        }
        for(GeneralEmployee e:list)
            fmt.format("%-15s %-15s %-15s %-15s %-15s\n", e.empCode,
                    e.fName, e.lName, e.empType, e.basicSal);
        System.out.println(fmt);


    }
}



