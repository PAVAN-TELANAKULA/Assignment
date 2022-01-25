package com.uks.core.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class EmployeeSearch {

    public static void main(String[] args) throws IOException {

        RowReader.printRecord();
        searchCriteria();
    }

    public static void searchCriteria() throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Lastname :");
        String lastName = sc.next();

        String row = "";
        String splitBy = ",";

        BufferedReader br = new BufferedReader(new FileReader("/home/brilworks-20/my1.csv"));

        List<GeneralEmployee> list = new ArrayList<>();

        while ((row = br.readLine()) != null) {
            String[] employee = row.split(splitBy);

            GeneralEmployee baseEmployee1 = new GeneralEmployee(employee[0],
                    employee[1], employee[2], employee[3], employee[4]);
            list.add(baseEmployee1);

        }


        int c = 1;

        Collections.sort(list);

        for (GeneralEmployee e : list) {
            if ( (e.lName).equals(lastName) ) {
                System.out.println("\nEmployee[" + c + "] : " + e.empCode
                        + "\nName : " + e.fName + " " + e.lName +
                        "\nEmployee type: " + e.empType +
                        "\nSalary: " + e.basicSal + "\n");
                c++;
            }

        }

    }
}